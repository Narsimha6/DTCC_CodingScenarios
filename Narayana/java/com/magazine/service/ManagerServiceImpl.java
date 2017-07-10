package com.magazine.service;

import com.magazine.service.Article;
import com.magazine.service.CommentAndReview;
import com.magazine.dao.ManagerDAO;
import com.magazine.service.ManagerService;

import jdk.internal.instrumentation.Logger;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService{
	
	Logger log = new Logger(ManagerServiceImpl.class);
	@Autowire
	private ManagerDAO managerDAO;
	
	public ManagerDAO getManagerDAO() {
		return managerDAO;
	}
	public void setManagerDAO(ManagerDAO managerDAO) {
		this.managerDAO = managerDAO;
	}

	/**
	 * 
	 * @param article
	 * @throws Exception
	 */
	@Override
	public void modifyArticles(Article article) throws Exception{
		log.info("ModifyArticles : START");
		try {
			managerDAO.modifyArticles(article);
		}
		catch(Exception ex) {
			log.error("Exception : "+ex);
			throw new Exception(ex.getMessage());
		}
		log.info("ModifyArticles : END");
	}
    
	/**
	 * 
	 * @param commentAndReview
	 * @throws Exception
	 */
	@Override
	public void createCommentAndReview(CommentAndReview commentAndReview) throws Exception{
		log.info("createCommentAndReview : START");
		try {
			managerDAO.createCommentAndReview(commentAndReview);
		}
		catch(Exception ex) {
			log.error("Exception : "+ex);
			throw new Exception(ex.getMessage());
		}
		log.info("createCommentAndReview : END");
	}
}
