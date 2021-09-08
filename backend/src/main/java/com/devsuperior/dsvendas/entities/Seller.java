package com.devsuperior.dsvendas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sellers")
public class Seller {
	
	//PARTE 1
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "seller")
	private List<Sale> sales = new ArrayList<>();
	//SELLER ESTÁ RELACIONADO A VÁRIAS SALES(UMA LISTA DE SALE)
	//PARA A LISTA DE SALE DEVEMOS USAR O MESMO NOME DO DIAGRAMA
	//EM SE TRATANDO DE UMA COLEÇÃO JÁ DEVEMOS INSTANCIAR
	
	//PARTE 2
	public Seller() {
	}

	//PARTE 3
	public Seller(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	//PARTE 4
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
	public List<Sale> getSales() {
		return sales;
	}
	//PARA COLEÇOES SÓ USAMOS O MÉTODO GETTER;

}
