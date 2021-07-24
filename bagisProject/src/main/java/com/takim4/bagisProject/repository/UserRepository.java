package com.takim4.bagisProject.repository;

import org.springframework.data.repository.CrudRepository;

import com.takim4.bagisProject.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
