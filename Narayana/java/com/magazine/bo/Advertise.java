package com.magazine.bo;

import java.io.Serializable;
import java.sql.Date;

public class Advertise implements Serializable{

	    
		private long advertiseId;
		
		private String advertiseName;
		
		private String advertiseDesc;
		
		private Date advertiseDate;
		
		private Date advertiseExpiryDate;
		
		private Date createdOn;
		
		private String createdBy;

		public Date getCreatedOn() {
			return createdOn;
		}

		public void setCreatedOn(Date createdOn) {
			this.createdOn = createdOn;
		}


		public long getAdvertiseId() {
			return advertiseId;
		}

		public void setAdvertiseId(long advertiseId) {
			this.advertiseId = advertiseId;
		}

		public String getAdvertiseName() {
			return advertiseName;
		}

		public void setAdvertiseName(String advertiseName) {
			this.advertiseName = advertiseName;
		}

		public String getAdvertiseDesc() {
			return advertiseDesc;
		}

		public void setAdvertiseDesc(String advertiseDesc) {
			this.advertiseDesc = advertiseDesc;
		}

		public Date getAdvertiseDate() {
			return advertiseDate;
		}

		public void setAdvertiseDate(Date advertiseDate) {
			this.advertiseDate = advertiseDate;
		}

		public Date getAdvertiseExpiryDate() {
			return advertiseExpiryDate;
		}

		public void setAdvertiseExpiryDate(Date advertiseExpiryDate) {
			this.advertiseExpiryDate = advertiseExpiryDate;
		}
}
