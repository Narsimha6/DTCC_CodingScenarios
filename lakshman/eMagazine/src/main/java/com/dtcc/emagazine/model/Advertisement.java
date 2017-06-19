package com.dtcc.emagazine.model;

public class Advertisement {

	private long id;

	private String type;
	
	private String title;

	private String headLine;

	private String content;

	private String auther;

	public Advertisement() {
		id = 0;
	}

	public Advertisement(long id, String title, String headLine, String content,String type,
			String auther) {
		this.id = id;
		this.type = type;
		this.title = title;
		this.headLine = headLine;
		this.content = content;
		this.auther = auther;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHeadLine() {
		return headLine;
	}

	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

}