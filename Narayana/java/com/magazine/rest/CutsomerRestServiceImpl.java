package com.magazine.rest;

import java.com.magazine.service.Article;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.magazine.bo.Advertise;
import com.magazine.bo.Customer;

import src.java.com.magazine.service.HttpServletRequest;
import src.java.com.magazine.service.JSONObject;

@Controller
@RequestMapping("/customer")
public class CutsomerRestServiceImpl {
	
	@Autowire
	private CustomerService customerService;
	
	@RequestMapping(value="/custRegister", method = RequestMethod.POST)
	public @ResponseBody Customer createCustomer(@PathVariable Customer customer) throws Exception{
		try{
			customerService.createCutsomer(customer);
		}catch(Exception e){
			throw new Exception("Internal error occured");
		}
		return customer;
	}
	
	@RequestMapping(value="/fetchCustomer/{id}", method = RequestMethod.GET)
	public @ResponseBody Customer fetchCustomer(@PathVariable long id) throws Exception{
		//Suppose any exception occurred will handle in ajax .. will show message as internal service error.
		return customerService.fetchCustomer(id);
	}
	
	@RequestMapping(value="/viewJournal/{id}", method = RequestMethod.GET)
	public @ResponseBody Journal viewJournal(@PathVariable long id) throws Exception{
		return customerService.viewJournal(id);
	}
	
	@RequestMapping(value="/visitorPostFeedBack/{id}", method = RequestMethod.GET)
	public @ResponseBody FeedBack visitorPostFeedBack(@PathVariable long id) throws Exception{
		return customerService.visitorPostFeedBack(id);
	}
	
	@RequestMapping(value="/publishArticles", method = RequestMethod.POST)
	public @ResponseBody Article publishArticles(@PathVariable Article articles) throws Exception{
		customerService.publishArticles(id);
		return articles;
	}
	
	@RequestMapping(value="/createAdvertise", method = RequestMethod.POST)
	public @ResponseBody Advertise createAdvertise(@PathVariable Advertise advertise) throws Exception{
		try{
			customerService.createAdvertise(advertise);
		}catch(Exception e){
			throw new Exception("Internally error occured");
		}
		return advertise;
	}
	
	@RequestMapping(value="/fetchAdvertise/{id}", method = RequestMethod.GET)
	public @ResponseBody Advertise fetchAdvertise(@PathVariable long id) throws Exception{
		return customerService.visitorPostFeedBack(id);
	}
}