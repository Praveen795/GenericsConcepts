package com.JexlBoot.app.Repo;

import org.springframework.data.repository.CrudRepository;

import com.JexlBoot.app.entity.StudentResult;

public interface UserRepo extends CrudRepository<StudentResult, Integer> {
	

}
