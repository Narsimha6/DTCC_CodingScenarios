package com.dtcc.emagazine.service;

import java.util.List;

import com.dtcc.emagazine.model.Article;
 
 
public interface PublisherService {
     
    List<Article> listAllArticles();
    
    Article findById(long id);
     
    void editArticle(Article article);
    
    void reviewContent(Article article);
    
    void saveArticle(Article article);
}
