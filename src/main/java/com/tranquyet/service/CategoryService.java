package com.tranquyet.service;

import java.util.List;

import com.tranquyet.dto.CategoryDTO;

public interface CategoryService {

	List<CategoryDTO> findAll();

	CategoryDTO findById(long id);

	CategoryDTO save(CategoryDTO dto);

	void delete(long[] ids);
	
}
