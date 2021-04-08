package com.tranquyet.converter;

import org.springframework.stereotype.Component;

import com.tranquyet.dto.UserDTO;
import com.tranquyet.entity.UserEntity;

@Component
public class UserConverter {
	public UserDTO toDTO(UserEntity user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setName(user.getName());
		userDTO.setAddress(user.getAddress());
		return userDTO;
	}

	public UserEntity toEntity(UserDTO userDTO) {
		UserEntity userEntity = new UserEntity();
		userEntity.setId(userDTO.getId());
		userEntity.setName(userDTO.getName());
		userEntity.setAddress(userDTO.getAddress());
		return userEntity;
	}

	public UserEntity toEntity(UserDTO userDTO, UserEntity result) {
		result.setId(userDTO.getId());
		result.setName(userDTO.getName());
		result.setAddress(userDTO.getAddress());
		return result;
	}
}
