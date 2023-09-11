package teste;

import java.util.Scanner;

import arvores.AVLint;

public class Teste {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		AVLint avl = new AVLint();
		String menu= "(xxxx{}zzzzzzz>  ARVORE  <zzzzzzz{}xxxxx) \n"
				    + "1 - inserir um valor a tabela \n"
				    + "2 - Apresentar o fator de balanceamento em posOrdem \n"
				    + "0 - Sair ";
		int escolha, valor;
		
		do {
			
			System.out.println(menu);
			escolha = in.nextInt();
			switch (escolha) {
			case 1:
				System.out.print("Digite o valor que deseja inserir: ");
				valor = in.nextInt();
				avl.root =  avl.inserirH(avl.root, valor);
				
				
				System.out.println(valor + "Inserido");
				
				break;
				
			case 2:
				avl.mostraFB(avl.root);
				System.out.println();
				
				break;
				
			}
			
		}while(escolha != 0);
		System.out.println("Programa encerrado");
		
	}

}
