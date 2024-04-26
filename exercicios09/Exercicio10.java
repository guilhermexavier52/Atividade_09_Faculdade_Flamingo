package exercicio09;

import java.util.Scanner;

/*Elaborar um programa que apresente o resultado inteiro da divisão de dois números quaisquer.
Para a elaboração do programa, não utilizar em hipótese alguma o conceito do operador aritmético 
DIV. A solução deve ser alcançada com a utilização de looping. Ou seja, o programa deve apresentar 
como resultado (quociente) quantas vezes o divisor cabe no dividendo.*/

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o dividendo:");
		int dividendo = sc.nextInt();

		System.out.println("Digite o divisor:");
		int divisor = sc.nextInt();

		int quociente = 0;

		if (divisor != 0) {

			do {
				dividendo -= divisor;
				quociente++;
			} while (dividendo >= divisor);
		} else {
			System.out.println("Erro: O divisor não pode ser zero.");
			return;
		}

		System.out.println("O resultado inteiro da divisão é: " + quociente);

		sc.close();
	}
}
