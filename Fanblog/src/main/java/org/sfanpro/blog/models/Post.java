package org.sfanpro.blog.models;

import java.util.Date;

public class Post {

	private Long id;
	private String title;
	private String body;
	private User author;
	private Date date = new Date();

	public Post() {
	}

	public Post(Long id, String title, String body, User author) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Posts [id=" + id + ", title=" + title + ", body=" + body + ", author=" + author + ", date=" + date
				+ "]";
	}

}
