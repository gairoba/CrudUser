package com.gairoba.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gairoba.crud.model.entities.Membro;
import com.gairoba.crud.model.repositories.MembroRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/membro")
public class MembroController {
	
	@Autowired
	private MembroRepository membroRepository;


	@GetMapping
	public Membro obterMembro(Membro membro) {
		return membro;
	}
	
	@PostMapping
	public Membro criarMembro(@Valid Membro membro) {
		membroRepository.save(membro);
		return membro;
	}
	
	
	
}
