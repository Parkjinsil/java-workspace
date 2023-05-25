package com.webtoon.model;

import java.util.Date;

public class Webtoon {

	private String title;
	private String comment;
	private Date uploadAt;
	private int count;
	private String imgUrl;
	
	public Webtoon() {
	}

	public Webtoon(String title, String comment, Date uploadAt, int count, String imgUrl) {
		this.title = title;
		this.comment = comment;
		this.uploadAt = uploadAt;
		this.count = count;
		this.imgUrl = imgUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getUploadAt() {
		return uploadAt;
	}

	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "Webtoon [title=" + title + ", comment=" + comment + ", uploadAt=" + uploadAt + ", count=" + count
				+ ", imgUrl=" + imgUrl + "]";
	}
	
}
