package com.tranquyet.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class CategoryEntity extends BasedEntity {

	@Column(name = "name", columnDefinition = "TEXT")
	private String name;
	
	@OneToMany(mappedBy ="category")
	private List<CategoryEntity> category = new ArrayList<CategoryEntity>();
	

	public List<CategoryEntity> getCategory() {
		return category;
	}

	public void setCategory(List<CategoryEntity> category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
