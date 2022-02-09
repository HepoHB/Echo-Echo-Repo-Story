package com.bank.project;
import java.util.List;

public class Bank{
	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getContas() {
		return contas.toString();
	}

	public void setContas(List<Conta> contas){
		this.contas = contas;
		
	}
	
}
