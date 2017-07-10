package com.magazine.dao;

import com.magazine.bo.Article;

import jdk.internal.instrumentation.Logger;
import src.java.com.magazine.dao.CustomerDAOImpl;

public class ManagerDAOImpl implements ManagerDAO {
	Logger log = new Logger(ManagerDAOImpl.class);
	
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
    * 
    */
	@Override
	public void modifyArticles(Article article) throws Exception{
		try{
			save(article);
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
	public void createCommentAndReview(CommentAndReview commentAndReview) throws Exception{
		try{
			save(commentAndReview);
		}
		catch(Exception ex) {
			log.error("Exception ex:"+ex);
			throw ex;
		}
		finally {
			tx.close();
		}
	}
}
