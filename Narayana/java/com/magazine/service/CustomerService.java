package com.magazine.service;

import com.magazine.bo.Advertise;
import com.magazine.bo.Article;
import com.magazine.bo.Customer;
import com.magazine.bo.FeedBack;
import com.magazine.bo.Journal;

public interface CustomerService {
	
	public void createCustomer(Customer customer) throws Exception ;
	
	public Customer fetchCustomer(long id) throws Exception ;
	
	public Journal viewJournal(long journalId)throws Exception ;
	
	public FeedBack visitorPostFeedBack(long feedBackId) throws Exception ;
	
	public void publishArticles(Article articles) throws Exception ;
	
	public void createAdvertise(Advertise ads) throws Exception ;
	
	public Advertise fetchAdvertise(long advertiseId) throws Exception ;

}
