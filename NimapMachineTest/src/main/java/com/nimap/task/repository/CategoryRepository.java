package com.nimap.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nimap.task.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
