package com.apidevsuperior.userdept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apidevsuperior.userdept.entities.User;
import com.apidevsuperior.userdept.repositories.UserRepository;

//O controller recebe as requisições do usuário e responde elas
@RestController //Defino a classe como um controller
@RequestMapping(value = "/users") //Diz qual o caminho que esse controlador responde
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping //É usada para informar qual a requisição http get, post ..
	public List<User> findAll(){
 //Tipo   retorno     nome
		List<User> result =repository.findAll(); //A lista chamada result manda procurar todos os users
		return result; //retorna a lista preenchida com os users
	}
	
	@GetMapping(value = "/{id}")
	public User findAById(@PathVariable Long id){
		User result =repository.findById(id).get(); 
		return result; 
	}
	
	@PostMapping(value = "/user")
	public User sendNewUser(@RequestBody User user){
		User result =repository.save(user); 
		return result; 
	}
	
}
