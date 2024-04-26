package exercicio09;

/* Apresentar os quadrados dos números inteiros de 15 a 200.*/

public class Exercicio01 {
	
	public static void main(String[] args) {
		int numero = 15;
		System.out.println("Quadrados dos numeros inteiros de 1 a 200: ");
		
		do {
			int quadrado = numero * numero;
			System.out.println(numero + " ao quadrado é: " + quadrado);
			numero++;
			
		} while (numero <= 200);
		
	}

}
