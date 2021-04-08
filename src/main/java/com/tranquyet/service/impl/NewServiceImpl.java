package com.tranquyet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tranquyet.converter.NewConverter;
import com.tranquyet.dto.NewDTO;
import com.tranquyet.entity.CategoryEntity;
import com.tranquyet.entity.NewEntity;
import com.tranquyet.repository.CategoryRepository;
import com.tranquyet.repository.NewRepository;
import com.tranquyet.service.NewService;

@Service
public class NewServiceImpl implements NewService {

	@Autowired
	private NewConverter convert;

	@Autowired
	private NewRepository newRepo;

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<NewDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NewDTO findById(long id) {
		NewEntity entity = newRepo.findOne(id);
		System.out.println(entity.getContent());
		return convert.toDTO(entity);
	}

	@Override
	@Transactional
	public NewDTO save(NewDTO dto) {
		CategoryEntity category = categoryRepository.findFirstByName(dto.getCategoryCode());

		NewEntity newEntity = new NewEntity();
		if (dto.getId() != null) {
			NewEntity oldEntity = newRepo.findOne(dto.getId());
			oldEntity.setCategory(category);
			newEntity = convert.toEntity(dto, oldEntity);
		} else {
			newEntity = convert.toEntity(dto);
			newEntity.setCategory(category);
		}

		return convert.toDTO(newRepo.save(newEntity));
	}

	@Override
	@Transactional
	public void delete(long[] ids) {
		for (long id : ids) {
			newRepo.delete(id);
		}
	}

}
