package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{
	//SÓ COM ISSO JÁ TEREMOS UM OBJETO RESPONSAVEL POR ACESSAR OS DADOS DE UM SELLER
	//JÁ TEREMOS PRONTAS OPERAÇÕES DE INSERIR, BUSCAR, DELETAR, ATUALIZAR

}
