package com.tranquyet.service;

import java.util.List;

import com.tranquyet.dto.UserNewDTO;

public interface UserNewService {
	
	List<UserNewDTO> findAll();
	
	UserNewDTO findById(long id);

	UserNewDTO save(UserNewDTO dto);
	
	void delete(long[] ids);
	
}
