
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
	public void geNome() {
		// TODO Auto-generated method stub

	}

	public void imprimirCustos() { // TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Quantos dias você pretende ficar nesse destino? ");
		int qntsDias = sc.nextInt();

		double total = ((((getAlimentacao() + getBilhete() + getAluguel() + getHospedagem())) * qntsDias)
				+ getPassagem());

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);

		System.out.println("\n*********Custo médio**********");
		System.out.println("Custo médio de alimentação diário: " + nf.format(getAlimentacao()));
		System.out.println("Custo do bilhete para transporte: " + nf.format(getBilhete()));
		System.out.println("Custo de aluguel de carro diário a partir de: " + nf.format(getAluguel()));
		System.out.println("A hospedagem diária tem o custo inicial de: " + nf.format(getHospedagem()));
		System.out.println("Valor de passagens ida e volta a partir de: " + nf.format(getPassagem()));
		System.out.println("\nCom base nas informações acima, o seu gasto médio na viagem durante " + qntsDias
				+ " dias, será de: " + nf.format(total));
		System.out.println("");
	}

	@Override
	public void pontosTuristicos() {
		// TODO Auto-generated method stub
		
		System.out.println("\n*********Pontos turísticos**********");
		System.out.println(getPontosTuristicos());
	}

	@Override
	public void imprimirClima() {
		// TODO Auto-generated method stub

	}

}
