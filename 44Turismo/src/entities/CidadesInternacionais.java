package entities;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CidadesInternacionais extends Destinos {

	

	public CidadesInternacionais(String nome, String moeda, String pontosTuristicos, String sigla, int fuso,
			int temperaturaMin, int temperaturaMax, int periodo, float cambio, float bilhete, float alimentacao,
			float hospedagem, float aluguel, float passagem) {
		super(nome, moeda, pontosTuristicos, sigla, fuso, temperaturaMin, temperaturaMax, periodo, cambio, bilhete, alimentacao,
				hospedagem, aluguel, passagem);
		// TODO Auto-generated constructor stub
	}

	Scanner sc = new Scanner(System.in);

	public void cambio(float cambio) {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimirFuso() {
		// TODO Auto-generated method stub
		if (fuso < 0) {
			System.out.println("Diferença fuso horária " + fuso + ":00");
		} else {
			System.out.println("Diferença fuso horária +" + fuso + ":00");
		}
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(new Date());

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		System.out.println("Horário local: " + sdf.format(gc.getTime()));

		gc.add(Calendar.HOUR, fuso);
		System.out.println("Horário no destino: " + sdf.format(gc.getTime()));
	}

	@Override
	public void imprimirClima() {
		// TODO Auto-generated method stub

		if (periodo == 1 && nome == "Londres") {
			setTemperaturaMin(2);
			setTemperaturaMax(8);

		} else if (periodo == 2 && nome == "Londres") {
			setTemperaturaMin(3);
			setTemperaturaMax(17);

		} else if (periodo == 3 && nome == "Londres") {
			setTemperaturaMin(11);
			setTemperaturaMax(22);

		} else if (periodo == 4 && nome == "Londres") {
			setTemperaturaMin(4);
			setTemperaturaMax(19);

		} else if (periodo == 1 && nome == "Paris") {
			setTemperaturaMin(3);
			setTemperaturaMax(9);

		} else if (periodo == 2 && nome == "Paris") {
			setTemperaturaMin(6);
			setTemperaturaMax(22);

		} else if (periodo == 3 && nome == "Paris") {
			setTemperaturaMin(14);
			setTemperaturaMax(26);

		} else if (periodo == 4 && nome == "Paris") {
			setTemperaturaMin(5);
			setTemperaturaMax(20);

		} else if (periodo == 1 && nome == "Los Angeles") {
			setTemperaturaMin(3);
			setTemperaturaMax(9);

		} else if (periodo == 2 && nome == "Los Angeles") {
			setTemperaturaMin(5);
			setTemperaturaMax(20);

		} else if (periodo == 3 && nome == "Los Angeles") {
			setTemperaturaMin(14);
			setTemperaturaMax(26);

		} else if (periodo == 4 && nome == "Los Angeles") {
			setTemperaturaMin(6);
			setTemperaturaMax(22);

		} else if (periodo == 1 && nome == "Buenos Aires") {
			setTemperaturaMin(19);
			setTemperaturaMax(29);

		} else if (periodo == 2 && nome == "Buenos Aires") {
			setTemperaturaMin(12);
			setTemperaturaMax(26);

		} else if (periodo == 3 && nome == "Buenos Aires") {
			setTemperaturaMin(8);
			setTemperaturaMax(17);

		} else if (periodo == 4 && nome == "Buenos Aires") {
			setTemperaturaMin(11);
			setTemperaturaMax(25);

		} else if (periodo == 1 && nome == "Dubai") {
			setTemperaturaMin(18);
			setTemperaturaMax(38);

		} else if (periodo == 2 && nome == "Dubai") {
			setTemperaturaMin(18);
			setTemperaturaMax(38);

		} else if (periodo == 3 && nome == "Dubai") {
			setTemperaturaMin(28);
			setTemperaturaMax(41);

		} else if (periodo == 4 && nome == "Dubai") {
			setTemperaturaMin(4);
			setTemperaturaMax(19);

		} else {
			System.out.println("Opção inválida!");

		}

		if (getTemperaturaMin() != 0) {

			System.out.println("A média de temperatura em " + getNome() + " nessa época do ano é de "
					+ getTemperaturaMin() + "ºC à " + getTemperaturaMax() + "ºC.");

		}

	}

	@Override
	public void imprimirCustos() { // TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Quantos dias você pretende ficar nesse destino? ");
		int qntsDias = sc.nextInt();
		
		double total = (((( getAlimentacao() + getBilhete() + getAluguel() + getHospedagem()) * getCambio()) * qntsDias) + getPassagem());

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		
		System.out.println(getNome() + " - " + getMoeda() + " = " + getSigla());
		System.out.println("Custo médio de alimentação diário: " + getSigla() + " " + getAlimentacao() + " - BRL " + nf.format(getAlimentacao() * getCambio()));
		System.out.println("Custo do bilhete para transporte: " + getSigla()  + " " + getBilhete() + " - BRL " + nf.format(getBilhete() * getCambio()));
		System.out.println("Custo de aluguel de carro diário a partir de: " + getSigla() +  " " + getAluguel() + " - BRL " + nf.format(getAluguel() * getCambio()));
		System.out.println("A hospedagem diária tem o custo inicial de: " + getSigla() + " " + getHospedagem() + "0 - BRL " + nf.format(getHospedagem() * getCambio()));
		System.out.println("Valor de passagens a partir de: BRL " + getPassagem());
		System.out.println("\nCom base nas informações acima, o seu gasto médio na viagem durante " + qntsDias
				+ " dias, será de: BRL " + nf.format(total));
	}
	 
	 
	@Override
	public void pontosTuristicos() {
		// TODO Auto-generated method stub

		System.out.println(getPontosTuristicos());

	}

	@Override
	public void geNome() {
		// TODO Auto-generated method stub

	}

}