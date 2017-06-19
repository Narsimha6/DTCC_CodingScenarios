package com.dtcc.emagazine.service;

import com.dtcc.emagazine.model.Advertisement;
import com.dtcc.emagazine.model.Article;
 
 
public interface CustomerService {
     
    Article findJournalByName(String name);
     
    void postAdvertise(Advertisement advertisement);
    
    void postFeedback(String feedback);
    
    void viewJournal(Article article);
     
}