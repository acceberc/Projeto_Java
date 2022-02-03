package entities;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CidadesNacionais extends Destinos {

	public CidadesNacionais(String nome, String pontosTuristicos, int fuso, float bilhete, float alimentacao,
			float hospedagem, float aluguel, float passagem) {
		super(nome, pontosTuristicos, fuso, bilhete, alimentacao, hospedagem, aluguel, passagem);
		// TODO Auto-generated constructor stub
	}

	public CidadesNacionais(String nome, String pontosTuristicos, float bilhete, float alimentacao, float hospedagem,
			float aluguel, float passagem) {
		super(nome, pontosTuristicos, bilhete, alimentacao, hospedagem, aluguel, passagem);
		// TODO Auto-generated constructor stub
	}

	public void cambio(float cambio) {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimirFuso() {
		// TODO Auto-generated method stub
		if (fuso < 0) {
			System.out.println("Diferen�a fuso hor�ria " + fuso + ":00");
		} else {
			System.out.println("Diferen�a fuso hor�ria +" + fuso + ":00");
		}
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(new Date());

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		System.out.println("Hor�rio local: " + sdf.format(gc.getTime()));

		gc.add(Calendar.HOUR, fuso);
		System.out.println("Hor�rio no destino: " + sdf.format(gc.getTime()));
	}

	@Override
	public void geNome() {
		// TODO Auto-generated method stub

	}

	public void imprimirCustos() { // TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Quantos dias voc� pretende ficar nesse destino? ");
		int qntsDias = sc.nextInt();

		double total = ((((getAlimentacao() + getBilhete() + getAluguel() + getHospedagem())) * qntsDias)
				+ getPassagem());

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);

		System.out.println(getNome());
		System.out.println("Custo m�dio de alimenta��o di�rio: BRL " + getAlimentacao());
		System.out.println("Custo do bilhete para transporte: BRL " + getBilhete());
		System.out.println("Custo de aluguel de carro di�rio a partir de: BRL " + getAluguel());
		System.out.println("A hospedagem di�ria tem o custo inicial de: BRL " + getHospedagem());
		System.out.println("Valor de passagens a partir de: BRL " + getPassagem());
		System.out.println("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
				+ " dias, ser� de: BRL " + nf.format(total));
	}

	@Override
	public void pontosTuristicos() {
		// TODO Auto-generated method stub
		System.out.println(getPontosTuristicos());
	}

	@Override
	public void imprimirClima() {
		// TODO Auto-generated method stub

	}

}
