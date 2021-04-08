package com.tranquyet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tranquyet.converter.CategoryConverter;
import com.tranquyet.dto.CategoryDTO;
import com.tranquyet.entity.CategoryEntity;
import com.tranquyet.repository.CategoryRepository;
import com.tranquyet.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryConverter convert;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<CategoryDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoryDTO findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public CategoryDTO save(CategoryDTO dto) {
		CategoryEntity newCategory = new CategoryEntity();
		if (dto.getId() != null) {
			CategoryEntity oldCategory = new CategoryEntity();
			newCategory = convert.toEntity(dto, oldCategory);
		} else {
			newCategory = convert.toEntity(dto);
		}
		return convert.toDTO(categoryRepository.save(newCategory));
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub

	}

}
