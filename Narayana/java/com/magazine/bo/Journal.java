package com.magazine.bo;

import java.io.Serializable;
import java.sql.Date;

public class Journal implements Serializable {

	private long journalId;
	
	private String journalName;
	
	private String journalDesc;
	
	private Date journalDate;
	
	private Date journalExpiryDate;
	
	private Date createdOn;
	
	private String createdBy;

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

	public long getJournalId() {
		return journalId;
	}

	public void setJournalId(long journalId) {
		this.journalId = journalId;
	}

	public String getJournalName() {
		return journalName;
	}

	public void setJournalName(String journalName) {
		this.journalName = journalName;
	}

	public String getJournalDesc() {
		return journalDesc;
	}

	public void setJournalDesc(String journalDesc) {
		this.journalDesc = journalDesc;
	}

	public Date getJournalDate() {
		return journalDate;
	}

	public void setJournalDate(Date journalDate) {
		this.journalDate = journalDate;
	}

	public Date getJournalExpiryDate() {
		return journalExpiryDate;
	}

	public void setJournalExpiryDate(Date journalExpiryDate) {
		this.journalExpiryDate = journalExpiryDate;
	}
 
     	

}
