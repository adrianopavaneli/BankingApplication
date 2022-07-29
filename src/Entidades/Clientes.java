package Entidades;

public class Clientes {

	@Override
	public String toString() {
		return "Clientes [cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", idade=" + idade + "]";
	}



	private String cpf;
	private String nome;
	private String email;	
	private int idade;
	
	
	
	public Clientes(int idade, String cpf, String nome, String email) {
		this.idade = idade;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		
	}




	public int getIdade() {
		return idade;
	}




	public void setIdade(int idade) {
		this.idade = idade;
	}




	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}




	
	
	
	
}
