package com.apidevsuperior.userdept.entities;

//Importação com o javax.persistence sõa especificações, sem dê preferencias as especificações

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Essa classe vai ser convertida em tabela no bd

//@Entity e @Table são anotações do JPA, estamos mapeando a classe para ser usada no banco de dados

@Entity
@Table(name = "tb_department")
public class Department {

	//@Id informa que é o Id e a chave primária
	//@GeneratedValue estamos dizendo que vai ser autoincrementado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	public Department() {
		
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
	
	
	
}
