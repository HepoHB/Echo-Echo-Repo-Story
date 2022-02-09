package com.bank.project;

public class Main {

	public static void main(String[] args){
		Cliente cliente = new Cliente();
		cliente.setNome("Scrooge McDuck");
		
		Conta contaA = new ContaCorrente(cliente);
		Conta contaB = new ContaPoupança(cliente);
		
		contaA.imprimirExtrato();
		contaB.depositar(300000);
		contaB.imprimirExtrato();
		contaB.transferir(50, contaA);
		contaA.imprimirExtrato();
		contaB.imprimirExtrato();

	}

}
