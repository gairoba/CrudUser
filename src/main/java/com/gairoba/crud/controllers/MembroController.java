package com.gairoba.crud.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gairoba.crud.model.entities.Membro;
import com.gairoba.crud.model.repositories.MembroRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/membro")
public class MembroController {
	
	@Autowired
	private MembroRepository membroRepository;

	@PostMapping
	public Membro criarMembro(@Valid Membro membro) {
		membroRepository.save(membro);
		return membro;
	}
	
	@GetMapping
	public Iterable<Membro> obterMembro(){
		return membroRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Membro> obterMemnroPorId(@PathVariable Long id){
		return membroRepository.findById(id);
	}
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public Membro atualizarMembro(@Valid Membro membro) {
		membroRepository.save(membro);
		return membro;
	}
	
	@DeleteMapping("/{id}")
	public void excluirMembro (@PathVariable Long id) {
		membroRepository.deleteById(id);
	}
	
}
