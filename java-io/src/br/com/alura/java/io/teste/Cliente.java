package br.com.alura.java.io.teste;

import java.io.Serializable;

public class Cliente implements Serializable {

	public Cliente() {
		super();
	}

	public Cliente(String nome) {
		this();
		this.nome = nome;
	}

	private static final long serialVersionUID = 1L;

	private String nome;

	// Ao marcar o atributo como "transient", ele não será serializado.
	private transient Cliente indicacao;

	public Cliente getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(Cliente indicacao) {
		this.indicacao = indicacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
