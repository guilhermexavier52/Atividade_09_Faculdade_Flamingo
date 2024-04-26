package exercicio09;

import java.util.Scanner;

/*Elaborar um programa que efetue a leitura de valores 
 * positivos inteiros até que um valor negativo seja informado. Ao 
 * final devem ser apresentados o maior e o menor valores informados pelo usuário.*/

public class Exercicio09 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int maior = Integer.MIN_VALUE;
	        int menor = Integer.MAX_VALUE;
	        int valor;

	        do {
	            System.out.println("Digite um valor positivo (ou um valor negativo para sair):");
	            valor = sc.nextInt();

	            if (valor >= 0) {
	                if (valor > maior) {
	                    maior = valor;
	                }
	                if (valor < menor) {
	                    menor = valor;
	                }
	            }
	        } while (valor >= 0);

	        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
	            System.out.println("O maior valor informado foi: " + maior);
	            System.out.println("O menor valor informado foi: " + menor);
	        } else {
	            System.out.println("Nenhum valor positivo foi informado.");
	        }

	        sc.close();
	    }
}
