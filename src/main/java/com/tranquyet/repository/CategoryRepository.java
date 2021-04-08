package com.tranquyet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranquyet.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	CategoryEntity findFirstByName(String name);
}
