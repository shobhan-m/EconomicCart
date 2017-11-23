package com.nisum.economycart.app.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="priceRequest")
@Entity
public class PriceRequest {

	@Id
	@Column(name = "requestId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int requestId;
	private int productId;
	private int userId;
	private float fromPrice;
	private float toPrice;
	private int selectDaysRange;
	private String comment;
	private LocalDateTime createDate;
	private LocalDateTime toDate;
	/**
	 * @return the requestId
	 */
	public int getRequestId() {
		return requestId;
	}
	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the fromPrice
	 */
	public float getFromPrice() {
		return fromPrice;
	}
	/**
	 * @param fromPrice the fromPrice to set
	 */
	public void setFromPrice(float fromPrice) {
		this.fromPrice = fromPrice;
	}
	/**
	 * @return the toPrice
	 */
	public float getToPrice() {
		return toPrice;
	}
	/**
	 * @param toPrice the toPrice to set
	 */
	public void setToPrice(float toPrice) {
		this.toPrice = toPrice;
	}
	/**
	 * @return the selectDaysRange
	 */
	public int getSelectDaysRange() {
		return selectDaysRange;
	}
	/**
	 * @param selectDaysRange the selectDaysRange to set
	 */
	public void setSelectDaysRange(int selectDaysRange) {
		this.selectDaysRange = selectDaysRange;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the createDate
	 */
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the toDate
	 */
	public LocalDateTime getToDate() {
		return toDate;
	}
	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(LocalDateTime toDate) {
		this.toDate = toDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + Float.floatToIntBits(fromPrice);
		result = prime * result + productId;
		result = prime * result + requestId;
		result = prime * result + selectDaysRange;
		result = prime * result + ((toDate == null) ? 0 : toDate.hashCode());
		result = prime * result + Float.floatToIntBits(toPrice);
		result = prime * result + userId;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PriceRequest other = (PriceRequest) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (Float.floatToIntBits(fromPrice) != Float.floatToIntBits(other.fromPrice))
			return false;
		if (productId != other.productId)
			return false;
		if (requestId != other.requestId)
			return false;
		if (selectDaysRange != other.selectDaysRange)
			return false;
		if (toDate == null) {
			if (other.toDate != null)
				return false;
		} else if (!toDate.equals(other.toDate))
			return false;
		if (Float.floatToIntBits(toPrice) != Float.floatToIntBits(other.toPrice))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PriceRequest [requestId=" + requestId + ", productId=" + productId + ", userId=" + userId
				+ ", fromPrice=" + fromPrice + ", toPrice=" + toPrice + ", selectDaysRange=" + selectDaysRange
				+ ", comment=" + comment + ", createDate=" + createDate + ", toDate=" + toDate + "]";
	}

	
}
