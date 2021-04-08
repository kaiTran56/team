package com.tranquyet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranquyet.entity.UserNewEntity;

public interface UserNewRepository extends JpaRepository<UserNewEntity, Long>{

	UserNewEntity findFirstByStatus(String status);
	
}
