package com.magazine.service;

import com.magazine.bo.Article;
import com.magazine.bo.CommentAndReview;

public interface ManagerService {
  
	public void modifyArticles(Article article) throws Exception;
    
	public void createCommentAndReview(CommentAndReview commentAndReview) throws Exception;
  
}
