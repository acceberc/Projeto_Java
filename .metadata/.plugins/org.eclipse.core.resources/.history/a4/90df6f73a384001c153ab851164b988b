package Projeto44;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CidadeI extends Internacional {
	Scanner leia = new Scanner(System.in);
	private float cambio = (float) 0;

	public CidadeI(String nome, String estacao, int fuso, String moeda, boolean visto,
			float cambio, float alimentacao, float passagem, float hospedagem) {
		
		super(nome, estacao, fuso, moeda, visto, alimentacao, passagem, hospedagem);
		this.cambio = cambio;
	}

	public float getCambio() {
		return cambio;
	}

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public void setCambio(float cambio) {
		this.cambio = cambio;
	}

	public void imprimirClima() {
		System.out.println("\nSelecione o período desejado");
		System.out.println("\n[1] – Janeiro a Março");
		System.out.println("\n[2] – Abril a Junho");
		System.out.println("\n[3] – Julho a Setembro");
		System.out.println("\n[4] – Outubro a Novembro");
		int periodo1 = leia.nextInt();

		// alterar temperatura
		if (periodo1 == 1) {
			System.out.println("A média de temperatura é de 8ºC à 2ºC");
		} else if (periodo1 == 2) {
			System.out.println("A média de temperatura é de 3ºC à 17ºC");
		} else if (periodo1 == 3) {
			System.out.println("A média de temperatura é de 11ºC à 22ºC");
		} else if (periodo1 == 4) {
			System.out.println("A média de temperatura é de 4ºC à 19ºC");
		} else {
			System.out.println("Opção inválida!");
		}
	}

	public void imprimirPontosTur() {
		System.out.println(
				"\nOs principais pontos turísticos são: Torre de Londres, London Eye, Madame Tussauds Museum, mas além desses, a cidade conta com mais 39 pontos turísticos.");
	}

	public void imprimirFuso() {
		int f = 3; // incluir aqui a diferença de horario

		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(new Date());

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println("Horário local: " + sdf.format(gc.getTime()));

		gc.add(Calendar.HOUR, f);
		System.out.println("Horário no destino: " + sdf.format(gc.getTime()));
	}

	public void imprimirCustos() {
		System.out.println("\nA moeda local é " + moeda + ", cada " + moeda + " equivale a R$ " + cambio);
		System.out.println("\nA alimentação média na cidade pode chegar a R$" + alimentacao + ", " + moeda + ", o que equivale a R$" + (40 * cambio));
		System.out.println("\nPassagem aéreas tem valores a partir de R$ " + passagem);
		System.out.println("\nOs valores em hoteis e pousadas variam, sendo possível encontrar diárias a partir de R$ " + hospedagem);
	}
	
	

	public void opcoesMenuI() {
		int op = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("Opção [1]: Fuso Horário");
		System.out.println("Opção [2]: Temperatura");
		System.out.println("Opção [3]: Custos");
		System.out.println("Opção [4]: Pontos turísticos");
		System.out.println("Opção [5]: Todas as opções");
		op = leia.nextInt();
		switch (op) {
		case 1:
			imprimirFuso();
			break;
		case 2:
			imprimirClima();
			break;
		case 3:
			imprimirCustos();
			break;
		case 4:
			imprimirPontosTur();
			break;
		case 5:
			imprimirFuso();
			imprimirClima();
			imprimirCustos();
			imprimirPontosTur();
			break;

		}

	}
}
