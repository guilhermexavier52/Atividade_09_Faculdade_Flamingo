package exercicio09;

import java.util.Scanner;

/*Elaborar um programa que efetue a leitura sucessiva 
 *de valores numéricos e apresente no final o total do 
 *somatório, a média aritmética e o total de valores 
 *lidos. O programa deve fazer as leituras dos valores 
 *enquanto o usuário estiver fornecendo valores positivos. Ou
 *seja, o programa deve parar quando o usuário fornecer um 
 *valor negativo. Não se esqueça que o usuário pode entrar como
 *primeiro número um número negativo, portanto, cuidado com a 
 *divisão por zero no cálculo da média.*/

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valorTotal = 0;
		double soma = 0;

		System.out.println("DIgite os valores (digite um valor negativo para sair):");

		double valor;

		do {
			valor = sc.nextDouble();
			if (valor >= 0) {
				soma += valor;
				valorTotal++;

			}
		} while (valor >= 0);
		
		sc.close();
		if (valorTotal > 0) {
			double media = soma / valorTotal;
			System.out.println("Total do somatorio: " + soma);
			System.out.println("Media aritimetica: " + media);
			System.out.println("Total de valores lidos: " + valorTotal);
		}else {
			System.out.println("Nenhum valor valido foi fornecido");
		}

	}

}
