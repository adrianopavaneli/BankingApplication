package Entidades;



public class Conta {
	private int saldo;
	private int transacaoAnterior;
	private String nomeCliente;
	private String idCliente;
	
	
	public Conta() {
		
	}


	public Conta(int saldo, int transacaoAnterior, String nomeCliente, String idCliente) {
		this.saldo = saldo;
		this.transacaoAnterior = transacaoAnterior;
		this.nomeCliente = nomeCliente;
		this.idCliente = idCliente;
	}


	public int getTransacaoAnterior() {
		return transacaoAnterior;
	}


	public void setTransacaoAnterior(int transacaoAnterior) {
		this.transacaoAnterior = transacaoAnterior;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}


	public int getSaldo() {
		return saldo;
	}


	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", transacaoAnterior=" + transacaoAnterior + ", nomeCliente=" + nomeCliente
				+ ", idCliente=" + idCliente + "]";
	}
	
	
	
	
	

}
