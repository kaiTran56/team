package com.tranquyet.service;

import java.util.List;

import com.tranquyet.dto.UserDTO;

public interface UserService {

	List<UserDTO> findAll();
	
	UserDTO findById(long id);
	
	UserDTO save(UserDTO dto);
	
	void delete(long[] ids);
}
