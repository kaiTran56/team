package com.tranquyet.dto;

public class CategoryDTO extends BasedDTO<CategoryDTO>{

	private String name;
	
	private NewDTO newDTO;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NewDTO getNewDTO() {
		return newDTO;
	}

	public void setNewDTO(NewDTO newDTO) {
		this.newDTO = newDTO;
	}
	
	
	
}
