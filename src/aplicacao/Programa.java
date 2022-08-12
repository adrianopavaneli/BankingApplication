package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Clientes;
import Entidades.Conta;

public class Programa {

	public static void main(String[] args)  {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados do Cliente! ");
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		while (idade < 18) {
			System.out.println("Você precisa ter 18 anos para abrir uma conta!");
			System.out.print("Digite a idade novamente: ");
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
		
	
		
		System.out.println();
		
		
		
		System.out.println("Bemvindo ao Banco Azul!");
		System.out.println("CPF:" + cliente.getCpf());
		System.out.println("Cliente:" + cliente.getNome());
		System.out.println();
		System.out.println();
		
		int option = '0';
		while(option != '4') {
		System.out.println("1. Saldo");
		System.out.println("2. Deposito");
		System.out.println("3. Saque");
		System.out.println("4. Saida");
		
		System.out.println("**************************************************");
		System.out.println("Entre com uma opção:");
		System.out.println("**************************************************");
			
		option = sc.next().charAt(0);
		switch(option) {
		
		case 1:
		
			System.out.println("***************************");
			System.out.printf("Saldo: R$%.2f\n", cc.getSaldo() );
			System.out.println("***************************");
			System.out.println();
			break;
			
			
		
		case 2:
			System.out.println("***************************");
			System.out.println("Deposito:");
			System.out.print("Digite o valor a depositar:");
			double deposito = sc.nextDouble();
			cc.deposito(deposito);
			System.out.printf("Novo saldo: R$%.2f\n ",  cc.getSaldo());
			System.out.println("***************************");
			System.out.println();
			break;
		
			
		case 3:
			System.out.println("Saque:");
			System.out.print("Digite o valor a sacar:");
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
		System.out.println(cliente.getNome() + " obrigado por fazer parte do Banco Azul!");
		System.out.println("Volte Sempre!");
			
			
			
			
			
			
			
		
		
		}
		sc.close();
	}
}

