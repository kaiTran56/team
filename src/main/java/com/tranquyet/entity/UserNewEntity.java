package com.tranquyet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_new")
public class UserNewEntity extends BasedEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user")
	private UserEntity user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_new")
	private NewEntity news;

	@Column(name = "status")
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public NewEntity getNews() {
		return news;
	}

	public void setNews(NewEntity news) {
		this.news = news;
	}

}
