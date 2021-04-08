package com.tranquyet.dto;

public class NewDTO extends BasedDTO<NewDTO> {

	private String content;
	private UserNewDTO user;
	private Long categoryId;
	private String categoryCode;


	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public UserNewDTO getUser() {
		return user;
	}

	public void setUser(UserNewDTO user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
