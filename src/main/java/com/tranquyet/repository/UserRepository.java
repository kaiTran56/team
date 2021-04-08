package com.tranquyet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranquyet.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
		UserEntity findFirstByName(String name);
}
