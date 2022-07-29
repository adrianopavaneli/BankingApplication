package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Clientes;
import Entidades.Conta;

public class Programa {

	public static void main(String[] args)  {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Alimentação Cadastro!");
		System.out.print("Digite sua idade:");
		int idade = sc.nextInt();
		while (idade < 18) {
			System.out.println("Você precisa ter 18 anos para abrir uma conta!");
			System.out.print("Digite a idade novamente:");
			idade = sc.nextInt();
		}
		
		sc.nextLine();
		System.out.print("Digite seu cpf:");
		String cpf = sc.nextLine();
		System.out.print("Digite seu nome:");
		String nome = sc.nextLine();
		System.out.print("Digite seu email:");
		String email = sc.nextLine();
		
		Clientes cliente = new Clientes(idade, cpf, nome, email);
		Conta cc = new Conta(cliente);
		
	
		
		System.out.println();
		
		
		
		System.out.println("Bemvindo ao Banco Azul!");
		System.out.println("CPF:" + cliente.getCpf());
		System.out.println("Cliente:" + cliente.getNome());
		System.out.println();
		System.out.println();
		
		char option = '0';
		while(option != 'D') {
		System.out.println("A. Saldo");
		System.out.println("B. Deposito");
		System.out.println("C. Saque");
		System.out.println("D. Saida");
		
		System.out.println("**************************************************");
		System.out.println("Entre com uma opção:");
		System.out.println("**************************************************");
			
		option = sc.next().charAt(0);
		
		if(option == 'A' ) {
			System.out.println("***************************");
			System.out.println("Saldo: " + cc.getSaldo());
			System.out.println("***************************");
			System.out.println();
			
			
		}if(option == 'a' ) {
			System.out.println("***************************");
			System.out.println("Saldo: " + cc.getSaldo());
			System.out.println("***************************");
			System.out.println();
			
		}if(option =='B') {
			System.out.println("***************************");
			System.out.println("Deposito:");
			System.out.print("Digite o valor a depositar:");
			double deposito = sc.nextDouble();
			cc.deposito(deposito);
			System.out.println("Novo saldo: " + cc.getSaldo());
			System.out.println("***************************");
			System.out.println();
			
		}if(option =='b') {
			System.out.println("***************************");
			System.out.println("Deposito:");
			System.out.print("Digite o valor a depositar:");
			double deposito = sc.nextDouble();
			cc.deposito(deposito);
			System.out.println("Novo saldo: " + cc.getSaldo());
			System.out.println("***************************");
			System.out.println();
			
		}if(option == 'C') {
			System.out.println("Saque:");
			System.out.print("Digite o valor a sacar:");
			double saque = sc.nextDouble();
				while(saque > cc.getSaldo() ) {
					System.out.println("Saldo insuficiente! Digite novo valor:");
					saque = sc.nextDouble();
				}
				cc.saque(saque);
				System.out.println("Novo saldo: " + cc.getSaldo());
				System.out.println("***************************");
				System.out.println();
			
		
		}if(option == 'c') {
			System.out.println("Saque:");
			System.out.print("Digite o valor a sacar:");
			double saque = sc.nextDouble();
				while(saque > cc.getSaldo() ) {
					System.out.println("Saldo insuficiente! Digite novo valor:");
					saque = sc.nextDouble();
				}
				cc.saque(saque);
				System.out.println("Novo saldo: " + cc.getSaldo());
				System.out.println("***************************");
				System.out.println();
			
		
		}
		
		
		
		}
		System.out.println();			
		System.out.println(cliente.getNome() + " obrigado por fazer parte do Banco Azul!");
		System.out.println("Volte Sempre!");
			
			
			
			
			
			
			
		
		sc.close();

	}

}
