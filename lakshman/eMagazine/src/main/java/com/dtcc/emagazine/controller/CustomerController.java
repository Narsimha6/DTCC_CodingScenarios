package com.dtcc.emagazine.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dtcc.emagazine.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {

	public static final Logger logger = LoggerFactory
			.getLogger(CustomerController.class);

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/getJournal/", method = RequestMethod.GET)
	public ResponseEntity<String> getJournal(@PathVariable("title") String title) {
		if (logger.isInfoEnabled()) {
			logger.info("Finding Journal");
		}
		return new ResponseEntity<String>("", HttpStatus.OK);
	}

	
	
	
}