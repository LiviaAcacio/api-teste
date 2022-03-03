package com.apidevsuperior.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apidevsuperior.userdept.entities.User;

//Os repositorys são parte de um sub-framework do jpa, todo repositoty é uma interface
//Esse repositório extende o JpaRepository que tem todos os métodos de salvar, buscar ..
//O repository acessa dados da entidade no banco

public interface UserRepository extends JpaRepository<User, Long>{

}
