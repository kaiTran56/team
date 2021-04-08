package com.tranquyet.converter;

import org.springframework.stereotype.Component;

import com.tranquyet.dto.NewDTO;
import com.tranquyet.entity.NewEntity;

@Component
public class NewConverter {

	public NewDTO toDTO(NewEntity entity) {
		NewDTO newDTO = new NewDTO();
		newDTO.setId(entity.getId());
		newDTO.setContent(entity.getContent());
		return newDTO;
	}

	public NewEntity toEntity(NewDTO dto) {
		NewEntity newEntity = new NewEntity();
		newEntity.setContent(dto.getContent());
		return newEntity;
	}

	public NewEntity toEntity(NewDTO dto, NewEntity result) {
		result.setContent(dto.getContent());
		return result;
	}

}
