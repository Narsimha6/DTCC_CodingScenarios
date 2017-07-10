package com.magazine.dao;

import com.magazine.service.Article;
import com.magazine.service.CommentAndReview;

public interface ManagerDAO {

	public void modifyArticles(Article article) throws Exception;
    
	public void createCommentAndReview(CommentAndReview commentAndReview) throws Exception;
}
