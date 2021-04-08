package com.tranquyet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tranquyet.converter.UserNewConverter;
import com.tranquyet.dto.UserNewDTO;
import com.tranquyet.entity.NewEntity;
import com.tranquyet.entity.UserEntity;
import com.tranquyet.entity.UserNewEntity;
import com.tranquyet.repository.NewRepository;
import com.tranquyet.repository.UserNewRepository;
import com.tranquyet.repository.UserRepository;
import com.tranquyet.service.UserNewService;

@Service
public class UserNewServiceImpl implements UserNewService {

	@Autowired
	private UserNewRepository userNewRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private NewRepository newRepository;

	@Autowired
	private UserNewConverter converter;

	@Override
	public List<UserNewDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserNewDTO findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public UserNewDTO save(UserNewDTO dto) {

		UserEntity user = userRepository.findFirstByName(dto.getUser().getName());

		NewEntity news = newRepository.findFirstByContent(dto.getNews().getContent());

		UserNewEntity userNew = new UserNewEntity();

		if (dto.getId() != null) {
			UserNewEntity oldEntity = new UserNewEntity();
			oldEntity.setId(dto.getId());
			oldEntity.setUser(user);
			oldEntity.setNews(news);
			userNew = converter.toEntity(oldEntity, dto);
		} else {
			userNew = converter.toEntity(dto);
			userNew.setUser(user);
			userNew.setNews(news);
			
		}
		return converter.toDTO(userNewRepository.save(userNew));
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub

	}

}
