package com.apidevsuperior.userdept.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Essa classe vai ser convertida em tabela no bd

//@Entity e @Table são anotações do JPA, estamos mapeando a classe para ser usada no banco de dados

@Entity
@Table(name = "tb_user")
public class User {

	//@Id informa que é o Id e a chave primária
	//@GeneratedValue estamos dizendo que vai ser autoincrementado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	
	//Chamar a outra classe/modal aqui é relacionar uma com a outra. Um user tem um departemento então eu relaciono as duas classes
	//Referencia ao obj departamento
	@ManyToOne 
	@JoinColumn(name = "department_id")//nome da chave estrangeira do banco
	private Department department;
	
	public User() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
}
