package com.magazine.dao;

import jdk.internal.instrumentation.Logger;
import src.java.com.magazine.service.CustomerServiceImpl;

import com.magazine.bo.Advertise;
import com.magazine.bo.Article;
import com.magazine.bo.Customer;
import com.magazine.bo.FeedBack;
import com.magazine.bo.Journal;


public class CustomerDAOImpl implements CustomerDAO {
	
	Logger log = new Logger(CustomerDAOImpl.class);
	
	private Session session;
	
	private Transaction tx = null;
	
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Transaction getTx() {
		return tx;
	}

	public void setTx(Transaction tx) {
		this.tx = tx;
	}
    /**
     * Save the cutsomer details
     * @param customer
     * @throws Exception
     */
	@Override
	public void createCustomer(Customer customer) throws Exception {
		try{
			save(customer);
		}
		catch(Exception ex) {
			log.error("Exception ex:"+ex);
			throw ex;
		}
		finally {
			tx.close();
		}
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public Customer fetchCustomer(long id)  throws Exception{
		try {
			
		}
		catch(Exception ex) {
			log.error("Exception ex:"+ex);
			throw ex;
		}
		finally {
			tx.close();
		}
	}
	@Override
	public Journal viewJournal(long journalId)  throws Exception{
		try {
			
		}
		catch(Exception ex) {
			log.error("Exception ex:"+ex);
			throw ex;
		}
		finally {
			tx.close();
		}
	}
	@Override
	public FeedBack visitorPostFeedBack(long feedBackId) throws Exception {
		try {
			
		}
		catch(Exception ex) {
			log.error("Exception ex:"+ex);
			throw ex;
		}
		finally {
			tx.close();
		}
	}
	@Override
	public void publishArticles(Article articles) throws Exception {
		try {
			save(articles);
		}
		catch(Exception ex) {
			log.error("Exception ex:"+ex);
			throw ex;
		}
		finally {
			tx.close();
		}
	}
	@Override
	public void createAdvertise(Advertise ads)  throws Exception {
		try {
			save(ads);
		}
		catch(Exception ex) {
			log.error("Exception ex:"+ex);
			throw ex;
		}
		finally {
			tx.close();
		}
	}
	/**
	 * 
	 */
	@Override
	public Advertise fetchAdvertise(Advertise ads) throws Exception {
		try {
			
		}
		catch(Exception ex) {
			log.error("Exception ex:"+ex);
			throw ex;
		}
		finally {
			tx.close();
		}
	}
	
	private void save(Object obj) throws Exception {		
		tx = seesion.beginTranstion();
		session.save(obj);
		tx.commit();		
	}

}
