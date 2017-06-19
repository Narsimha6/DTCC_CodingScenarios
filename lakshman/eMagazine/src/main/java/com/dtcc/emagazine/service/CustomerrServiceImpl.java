package com.dtcc.emagazine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtcc.emagazine.model.Advertisement;
import com.dtcc.emagazine.model.Article;

@Service("customerService")
public class CustomerrServiceImpl implements CustomerService {

	@Override
	public void viewJournal(Article article) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postAdvertise(Advertisement advertisement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postFeedback(String feedback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Article findJournalByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}