package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Course;
@Repository
public interface CourseMTM extends CrudRepository<Course, Integer>{
  
}
