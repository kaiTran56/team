package com.tranquyet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranquyet.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long>{
	NewEntity findFirstByContent(String content);
}
