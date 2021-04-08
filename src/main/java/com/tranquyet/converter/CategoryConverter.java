package com.tranquyet.converter;

import org.springframework.stereotype.Component;

import com.tranquyet.dto.CategoryDTO;
import com.tranquyet.entity.CategoryEntity;

@Component
public class CategoryConverter {

	public CategoryDTO toDTO(CategoryEntity entity) {
		CategoryDTO result = new CategoryDTO();
		result.setId(entity.getId());
		result.setName(entity.getName());
		return result;
	}

	public CategoryEntity toEntity(CategoryDTO dto) {
		CategoryEntity result = new CategoryEntity();
		result.setId(dto.getId());
		result.setName(dto.getName());
		return result;
	}

	public CategoryEntity toEntity(CategoryDTO dto, CategoryEntity result) {
		result.setId(dto.getId());
		result.setName(dto.getName());
		return result;
	}
}
