package com.dtcc.emagazine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.dtcc.emagazine.model.Article;

@Service("publisherService")
public class PublisherServiceImpl implements PublisherService {

	private static final AtomicLong counter = new AtomicLong();

	private static List<Article> articles;

	static {
		articles = createDummyArticles();
	}

	public List<Article> listAllArticles() {
		return articles;
	}


	private static List<Article> createDummyArticles() {
		List<Article> article = new ArrayList<Article>();
		article.add(new Article(1, "Business", "someTitle", "Headline1", "Content1","Auther1"));
		article.add(new Article(2, "Economic", "someTitle", "Headline2", "Content1","Auther2"));
		article.add(new Article(3, "General", "someTitle", "Headline3", "Content1","Auther3"));
		article.add(new Article(4, "Political", "someTitle", "Headline4", "Content1","Auther4"));
		article.add(new Article(5, "Health&Beauty", "someTitle", "Headline4", "Content1","Auther4"));
		article.add(new Article(6, "Youth", "someTitle", "Headline1", "Content5","Auther5"));
		article.add(new Article(7, "Education", "someTitle", "Headline1", "Content6","Auther6"));
		
		return article;
	}
	
	@Override
	public void saveArticle(Article article) {
		article.setId(counter.incrementAndGet());
		articles.add(article);
		
	}

	
	public Article findById(long id) {
		for (Article article : articles) {
			if (article.getId() == id) {
				return article;
			}
		}
		return null;
	}


	@Override
	public void editArticle(Article article) {
		// TODO: Api yet to implement as per the requirement. 
		
	}


	@Override
	public void reviewContent(Article article) {
		// TODO: Api yet to implement as per the requirement. 
		
	}


}