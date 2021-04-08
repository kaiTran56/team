package com.tranquyet.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity extends BasedEntity {

	@Column(name = "name")
	private String name;
	@Column(name = "address", columnDefinition = "TEXT")
	private String address;
	
	@OneToMany(mappedBy ="user")
	private List<UserNewEntity> userNew = new ArrayList<UserNewEntity>();

	
	public List<UserNewEntity> getUserNew() {
		return userNew;
	}

	public void setUserNew(List<UserNewEntity> userNew) {
		this.userNew = userNew;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
