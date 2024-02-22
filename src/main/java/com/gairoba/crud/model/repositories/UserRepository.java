package com.gairoba.crud.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gairoba.crud.model.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
}

