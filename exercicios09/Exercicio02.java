package exercicio09;

/* Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.*/


public class Exercicio02 {

	public static void main(String[] args) {
	
		int numero = 1;
		int soma = 0;
		
		System.out.println("Somatorio dos valores pares de 1 ate 500: ");
		
		do {
			if (numero % 2 == 0) {
				soma += numero;
			}
			numero++;
		} while (numero <= 500);
		System.out.println("A soma dos valores pares é: " + soma);
		
	}
}
