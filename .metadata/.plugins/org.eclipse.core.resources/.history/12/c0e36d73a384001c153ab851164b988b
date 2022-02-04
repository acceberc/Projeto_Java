package Projeto44;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int op;
		
		Scanner leia = new Scanner(System.in);
		CidadeI[] city = new CidadeI[6];
		// (String nome, String estacao, String fuso, String moeda,
		// boolean visto, float cambio, float alimentacao, float passagem, float
		// hospedagem))
		city[1] = new CidadeI("Londres", "Estação", 3, "Libra(s)", true, 7, 80, 9000, 100);
		city[2] = new CidadeI("Paris", "Estação", 4, "Euro(s)", true, 6, 60, 7000, 800);
		city[3] = new CidadeI("Los Angeles", "Estação", -5, "Dólar(es)", true, 5, 70, 2000, 300);
		city[4] = new CidadeI("Buenos Aires", "Estação", 0, "Peso(s) Argentino(s)", true, 0.5f, 20, 800, 200);
		city[5] = new CidadeI("Dubai", "Estação", 7, "Dihram(s)", true, 10, 500, 10000, 50000);

		// CidadeN cidade = new CidadeN("");

		System.out.println("Olá, seja bem vinde a 44 Turismo " + "\nQual seu nome?");
		String nome = leia.next();

		do{	
			System.out.println("\n" + nome + " escolha o destino desejado");
			System.out.println("\n[1] – Internacional");
			System.out.println("\n[2] – Nacional");
			op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.println("Opção [1]: Londres");
				System.out.println("Opção [2]: Paris");
				System.out.println("Opção [3]: Los Angeles");
				System.out.println("Opção [4]: Buenos Aires");
				System.out.println("Opção [5]: Dubai");
				op = leia.nextInt();
				
				
				switch (op) {
				
				case 1:
					city[op].opcoesMenuI();
					break;
				case 2:
					city[op].imprimirCustos();
					break;
				}
				break;
				
			case 2 :
				System.out.println("\nviagem nacional");
				break;
			
		
			
			}
			
			
		}while (op != 0);
	}
}
		
