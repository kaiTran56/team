package com.tranquyet.service;

import java.util.List;

import com.tranquyet.dto.NewDTO;

public interface NewService {

	List<NewDTO> findAll();

	NewDTO findById(long id);

	NewDTO save(NewDTO dto);

	void delete(long[] ids);
}
