package com.generation.lojadegames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.lojadegames.model.Produto;


@Repository
public interface ProdutosRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByValorLessThanEqual(BigDecimal valor);
	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);

}
