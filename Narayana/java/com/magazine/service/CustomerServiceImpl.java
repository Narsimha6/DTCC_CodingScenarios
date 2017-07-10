package com.magazine.service;

import java.com.magazine.bo.Advertise;
import java.com.magazine.bo.Article;
import java.com.magazine.bo.Customer;
import java.com.magazine.bo.FeedBack;
import java.com.magazine.bo.Journal;
import java.com.magazine.dao.CustomerDAO;
import java.com.magazine.rest.Autowire;
import java.com.magazine.service.CustomerService;

import jdk.internal.instrumentation.Logger;

/**
 * @author msb
 *
 */

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
	
	Logger log = new Logger(CustomerServiceImpl.class);
	
	@Autowire
	private CustomerDAO customerDao;
	
	/**
	 * 
	 */
	@Override
	public void createCustomer(Customer customer) throws Exception {
		log.info("createCustomer : START");
		try {
		customerDao.createCustomer(customer);
		}
		catch(Exception ex) {
			log.error("Exception : "+ex);
			throw new Exception(ex.getMessage());
		}
		log.info("createCustomer : END");
	}
	/**
	 * 
	 */
	@Override
	public Customer fetchCustomer(long id)throws Exception {
		log.info("fetchCustomer : START");
		try {
			Customer cust = customerDao.fetchCustomer(id);
			return cust;
			}
			catch(Exception ex) {
				log.error("Exception : "+ex);
				throw new Exception(ex.getMessage());
			}
		log.info("fetchCustomer : END");
	}
	/**
	 * 
	 */
	@Override
	public Journal viewJournal(long journalId) throws Exception {
		log.info("viewJournal : START");
		try {
			Journal journal = customerDao.viewJournal(journalId);
			return journal;
			}
			catch(Exception ex) {
				log.error("Exception : "+ex);
				throw new Exception(ex.getMessage());
			}
		log.info("viewJournal : END");
	}
	/**
	 * 
	 */
	@Override
	public FeedBack visitorPostFeedBack(long feedBackId) throws Exception {
		log.info("visitorPostFeedBack : START");
		try {
			FeedBack feedBack = customerDao.visitorPostFeedBack(feedBackId);
			return feedBack;
			}
			catch(Exception ex) {
				log.error("Exception : "+ex);
				throw new Exception(ex.getMessage());
			}
		log.info("visitorPostFeedBack : END");
	}
	/**
	 * 
	 */
	@Override
	public void publishArticles(Article articles) throws Exception {
		log.info("publishArticles : START");
		try {
			customerDao.publishArticles(articles);
			}
			catch(Exception ex) {
				log.error("Exception : "+ex);
				throw new Exception(ex.getMessage());
			}
		log.info("publishArticles : END");
	}
	
	
	/* (non-Javadoc)
	 * @see java.com.magazine.service.CustomerService#createAdvertise(Advertise)
	 * @Param Advertise  
	 */
	@Override	
	public void createAdvertise(Advertise ads) throws Exception {
		log.info("createAdvertise : START");
		try {
			customerDao.createAdvertise(ads);
			}
			catch(Exception ex) {
				log.error("Exception : "+ex);
				throw new Exception(ex.getMessage());
			}
		log.info("createAdvertise : END");
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public Advertise fetchAdvertise(long id) throws Exception {
		log.info("fetchAdvertise : START");
		try {
			Advertise  advertise = customerDao.fetchAdvertise(id);
			return advertise;
			}
			catch(Exception ex) {
				log.error("Exception : "+ex);
				throw new Exception(ex.getMessage());
			}
		log.info("fetchAdvertise : END");
	}	
	
}
