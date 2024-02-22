package com.gairoba.crud.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gairoba.crud.model.entities.User;
import com.gairoba.crud.model.repositories.UserRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping(path = "/list")
	public Iterable<User> readUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping(path = "/create")
	public User creatUser(@Valid User users) {
		userRepository.save(users);
		return users;
	}
	
	@GetMapping(path ="/read/{id}")
	public Optional<User> readIdUser(@PathVariable Long id){
		return userRepository.findById(id);
	}
	
	@PutMapping(path = "/update/{id}")
	public User updateUser (@Valid User user) {
		userRepository.save(user);
		return user;
	}
	
	@DeleteMapping(path ="/delete/{id}")
	public void deleteUser (@PathVariable Long id) {
		userRepository.deleteById(id);
	}
	
}
