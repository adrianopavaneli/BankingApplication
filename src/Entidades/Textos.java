package Entidades;

public class Textos {
	
	public String  menu() {
		String m =  """	
	1. Saldo
	2. Deposito
	3. Saque
	4. Saida
	""";
	return m;	
	}
	public String cabecalho() {
		String m = """
	Dados do Cliente! 
	Digite sua idade: 
	""";
	return m;
	}
	
	public String erroIdade() {
		String m = """
			Você precisa ter 18 anos para abrir uma conta!
			Digite a idade novamente:			
			""";
		return m;
	}
	public String opcao() {
		String m = """	
			**************************************************
			Entre com uma opção:
			**************************************************			
			""";
		return m;
	}
	
	public String saida() {
		String m = """	
			 obrigado por fazer parte do Banco Azul!
			Volte Sempre!");
			""";
		return m;
	}
	
	public String deposito() {
		String m = """	
			***************************
			Deposito:
			Digite o valor a depositar: 
			""";
		return m;
	}
	
	public String saque() {
		String m = """	
			***************************
			Saque:
			Digite o valor a sacar: 
			""";
		return m;
	}


}
