package Entidades;



public class Conta {
	private double saldo;	
	
	private String numeroConta;
	private Clientes cliente;



	public Conta(Clientes cliente) {
		
		this.saldo = 0.0;
		this.numeroConta = "00121-1";
		this.cliente = cliente;
	}


	
	
	public String getNumeroConta() {
		return numeroConta;
	}




	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}




	public Clientes getCliente() {
		return cliente;
	}




	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}




	public double getSaldo() {
		return saldo;
	}




	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor)  {
		
    	
            this.saldo -= valor;
	}




	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", numeroConta=" + numeroConta + ", cliente=" + cliente + "]";
	}



	
	
	
	

}
