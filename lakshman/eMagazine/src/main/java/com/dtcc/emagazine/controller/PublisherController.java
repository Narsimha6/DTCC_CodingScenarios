package com.dtcc.emagazine.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.dtcc.emagazine.model.Article;
import com.dtcc.emagazine.service.PublisherService;
import com.dtcc.emagazine.util.CustomErrorType;

@RestController
@RequestMapping("/api")
public class PublisherController {

	public static final Logger logger = LoggerFactory
			.getLogger(PublisherController.class);

	@Autowired
	PublisherService publisherService;

	@RequestMapping(value = "/publication/", method = RequestMethod.GET)
	public ResponseEntity<List<Article>> listAllArticle() {
		if (logger.isInfoEnabled()) {
			logger.info("Listing All Articles");
		}
		List<Article> articles = publisherService.listAllArticles();
		if (articles.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Article>>(articles, HttpStatus.OK);
	}

	@RequestMapping(value = "/publication/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getPublication(@PathVariable("id") long id) {
		if (logger.isInfoEnabled()) {
			logger.info("Fetching Publication with id {}", id);
		}
		Article publication = publisherService.findById(id);
		if (publication == null) {
			logger.error("publication with id {} not found.", id);
			return new ResponseEntity<CustomErrorType>(new CustomErrorType(
					"publication with id " + id + " not found"),
					HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Article>(publication, HttpStatus.OK);
	}

	@RequestMapping(value = "/createArticle/", method = RequestMethod.POST)
	public ResponseEntity<?> createArticle(@RequestBody Article article,
			UriComponentsBuilder ucBuilder) {
		if (logger.isInfoEnabled()) {
			logger.info("Creating New Article", article);
		}

		publisherService.saveArticle(article);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/publication/{id}")
				.buildAndExpand(article.getId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

}