package com.generation.lojadegames.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "O Atributo nome deve ser preenchido")
	@Size(min = 2, max = 255, message = "O Atributo nome deve conter entre 2 e 255 caracteres")
	private String nome;
	
	@NotBlank(message = "O Atributo descricao deve ser preenchido")
	@Size(min = 10, max = 1000, message = "O Atributo nome deve conter entre 10 e 1000 caracteres")
	private String descricao;
	
	
	@NotNull(message = "O Atributo valor deve ser preenchido")
	private float valor;
	
	
	private long categoria;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public long getCategoria() {
		return categoria;
	}


	public void setCategoria(long categoria) {
		this.categoria = categoria;
	}
	
	
	
	
}
