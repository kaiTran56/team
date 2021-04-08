package com.tranquyet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tranquyet.converter.UserConverter;
import com.tranquyet.dto.UserDTO;
import com.tranquyet.entity.UserEntity;
import com.tranquyet.repository.UserRepository;
import com.tranquyet.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserConverter convert;

	@Override
	public List<UserDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public UserDTO save(UserDTO dto) {
		UserEntity newUser = new UserEntity();
		if (dto.getId() != null) {
			UserEntity oldEntity = userRepository.findOne(dto.getId());
			newUser = convert.toEntity(dto, oldEntity);
		} else {
			newUser = convert.toEntity(dto);
		}
		return convert.toDTO(userRepository.save(newUser));
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub

	}

}
