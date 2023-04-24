package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Students;
@Repository
public interface StudentsMTMRepo extends CrudRepository<Students, Integer> {
List<Students> findAll();
}
