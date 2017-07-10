package com.magazine.bo;

import java.io.Serializable;
import java.sql.Date;

public class FeedBack implements Serializable {
	
	private long feedBackId;
	
	private String feedBackName;
	
	private String feedBackDesc;
	
	private Date feedBackDate;
	
	private Date createdOn;
	
	private String createdBy;

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}


	public long getFeedBackId() {
		return feedBackId;
	}

	public void setFeedBackId(long feedBackId) {
		this.feedBackId = feedBackId;
	}

	public String getFeedBackName() {
		return feedBackName;
	}

	public void setFeedBackName(String feedBackName) {
		this.feedBackName = feedBackName;
	}

	public String getFeedBackDesc() {
		return feedBackDesc;
	}

	public void setFeedBackDesc(String feedBackDesc) {
		this.feedBackDesc = feedBackDesc;
	}

	public Date getFeedBackDate() {
		return feedBackDate;
	}

	public void setFeedBackDate(Date feedBackDate) {
		this.feedBackDate = feedBackDate;
	}
	
}
