package com.bank.project;

public abstract class Conta implements IConta{
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	private static int AGENCIA_PADRAO = 0001;
	
	private static int SEQUENCIAL = 1;
	
	public Conta(Cliente cliente){
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
	}
	
	public void imprimirExtrato(){
		System.out.println("=== Extrato da Conta ===");
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: R$%.2f", this.saldo));
		
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}	

	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
