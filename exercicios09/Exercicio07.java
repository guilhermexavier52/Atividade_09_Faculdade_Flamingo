package exercicio09;

/*Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares
  situados na faixa numérica de 1 a 10.*/

public class Exercicio07 {
	public static void main(String[] args) {
		int numero = 1;
		do {
			if (numero % 2 != 0) {
				System.out.println("Fatrotial de " + numero + "é: " + calcularFatorial(numero));

			}
			numero++;

		} while (numero <= 10);

	}

	public static int calcularFatorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int fatorial = 1;
		int contador = 1;
		do {
			fatorial *= contador;
			contador++;
		} while (contador <= n);
		return fatorial;
	}
}
