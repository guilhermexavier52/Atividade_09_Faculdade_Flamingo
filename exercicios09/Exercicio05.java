package exercicio09;

import java.util.Scanner;

/*Elaborar um programa que efetue a leitura de 15 valores numéricos inteiros
 *e no final apresente ototal do somatório da fatorial de cada valor lido.*/

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int somaFatorial = 0;
		int contador = 0;
		
		do {
			contador++;
		  System.out.println("Digite o " + contador + "º valor inteiro: ");
		  int valor =sc.nextInt();
		  int fator = calcularFatorial(valor);
		  somaFatorial += fator;
		} while (contador < 15);
		
		
		
		System.out.println("O total da somatoria dos  fatoriais é: " + somaFatorial);
		sc.close();
	}
		public static int calcularFatorial(int n) {
	        if (n == 0)
	            return 1;
	        int fatorial = 1;
	        for (int i = 1; i <= n; i++) {
	            fatorial *= i;
	        }
	        return fatorial;
	}

}
	
