package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Clientes;
import Entidades.Conta;
import Entidades.Textos;

public class Programa {

	public static void main(String[] args)  {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Textos texto = new Textos();
				
	
		System.out.println(texto.cabecalho());		
		int idade = sc.nextInt();
		while (idade < 18) {
			System.out.println(texto.erroIdade());			
			idade = sc.nextInt();
		}
		
		sc.nextLine();
		System.out.print("Digite seu cpf: ");
		String cpf = sc.nextLine();
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite seu email: ");
		String email = sc.nextLine();
		
		Clientes cliente = new Clientes(idade, cpf, nome, email);
		Conta cc = new Conta(cliente);
				
		System.out.println("Bemvindo ao Banco Azul!");
		System.out.println("CPF:" + cliente.getCpf());
		System.out.println("Cliente:" + cliente.getNome());
		System.out.println();
		System.out.println();
		
		int option = '0';
		while(option != '4') {
		System.out.println(texto.menu());
		
		
		System.out.println(texto.opcao());
		
		option = sc.next().charAt(0);
		switch(option) {
		
		case 1:
		
			System.out.println("***************************");
			System.out.printf("Saldo: R$%.2f\n", cc.getSaldo() );
			System.out.println("***************************");
			System.out.println();
			break;
			
			
		
		case 2:
			System.out.println(texto.deposito());			
			double deposito = sc.nextDouble();
			cc.deposito(deposito);
			System.out.printf("Novo saldo: R$%.2f\n ",  cc.getSaldo());
			System.out.println("***************************");
			System.out.println();
			break;
		
			
		case 3:
			System.out.println(texto.saque());
			
			double saque = sc.nextDouble();
				while(saque > cc.getSaldo() ) {
					System.out.println("Saldo insuficiente! Digite novo valor:");
					saque = sc.nextDouble();
				}
				cc.saque(saque);
				System.out.printf("Novo saldo: R$%.2f\n ",  cc.getSaldo());
				System.out.println("***************************");
				System.out.println();
		break;	
		
		
		
		}
		
		
		System.out.println();			
		System.out.println(cliente.getNome() + texto.saida());
			
			
			
			
			
			
			
		
		
		}
		sc.close();
	}
}

