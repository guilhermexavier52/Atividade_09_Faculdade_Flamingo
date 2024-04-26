package exercicio09;

/*Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha,
banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada
do nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área
do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar calculando 
novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor total acumulado da área residencial.*/

import java.util.Scanner;

public class Exercicio08 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double areaTotal = 0;
	        String continuar;

	        do {
	            System.out.println("Digite o nome do cômodo:");
	            String nomeComodo = sc.nextLine();

	            System.out.println("Digite a largura do cômodo em metros:");
	            double largura = sc.nextDouble();

	            System.out.println("Digite o comprimento do cômodo em metros:");
	            double comprimento = sc.nextDouble();

	            double areaComodo = largura * comprimento;
	            areaTotal += areaComodo;

	            System.out.println("A área do cômodo '" + nomeComodo + "' é: " + areaComodo + " metros quadrados.");

	            sc.nextLine(); 

	            System.out.println("Deseja calcular a área de mais algum cômodo? (Digite 'SIM' ou 'NAO')");
	            continuar = sc.nextLine().toUpperCase();
	        } while (continuar.equals("SIM")|| continuar.equals("sim"));

	        System.out.println("A área total da residência é: " + areaTotal + " metros quadrados.");

	        sc.close();
	    }
}
