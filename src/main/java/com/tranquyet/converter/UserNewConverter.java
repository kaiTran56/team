package com.tranquyet.converter;

import org.springframework.stereotype.Component;

import com.tranquyet.dto.UserNewDTO;
import com.tranquyet.entity.UserNewEntity;

@Component
public class UserNewConverter {

	public UserNewDTO toDTO(UserNewEntity userNew) {
		UserNewDTO result = new UserNewDTO();
		result.setId(userNew.getId());
		result.setStatus(userNew.getStatus());
		return result;
	}

	public UserNewEntity toEntity(UserNewDTO userNew) {

		UserNewEntity result = new UserNewEntity();
		result.setId(userNew.getId());
		result.setStatus(userNew.getStatus());
		return result;

	}

	public UserNewEntity toEntity(UserNewEntity result, UserNewDTO dto) {

		result.setId(dto.getId());
		result.setStatus(dto.getStatus());
		return result;

	}

}
