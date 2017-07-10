package com.magazine.bo;

import java.io.Serializable;
import java.sql.Date;

public class Article implements Serializable {
	
	private long articleId;
	
	private String articleName;
	
	private String articleDesc;
	
	private Date articleDate;
	
	private Date articleExpiryDate;
	
	private Date createdOn;
	
	private String createdBy;

	public long getArticleId() {
		return articleId;
	}

	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getArticleDesc() {
		return articleDesc;
	}

	public void setArticleDesc(String articleDesc) {
		this.articleDesc = articleDesc;
	}

	public Date getArticleDate() {
		return articleDate;
	}

	public void setArticleDate(Date articleDate) {
		this.articleDate = articleDate;
	}

	public Date getArticleExpiryDate() {
		return articleExpiryDate;
	}

	public void setArticleExpiryDate(Date articleExpiryDate) {
		this.articleExpiryDate = articleExpiryDate;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
