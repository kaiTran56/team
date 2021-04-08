package com.tranquyet.dto;

public class UserNewDTO extends BasedDTO<UserNewDTO> {

	private Long userId;

	private Long newId;

	private String name;

	private UserDTO user;

	private String content;

	private NewDTO news;

	private String status;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getNewId() {
		return newId;
	}

	public void setNewId(Long newId) {
		this.newId = newId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public NewDTO getNews() {
		return news;
	}

	public void setNews(NewDTO news) {
		this.news = news;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
