import java.text.NumberFormat;
import java.util.Scanner;

public class CidadeN extends Destinos {
	Scanner leia = new Scanner(System.in);
	

	public CidadeN(int opCidade, int cidade) {
		super(opCidade, cidade);
	}

	public int getCidadeN() {
		return cidade;
	}

	public void setCidadeN(int cidadeN) {
		this.cidade = cidadeN;
	}

	public void escolhaCidadeN() {
		System.out.println("Op��o [1]: S�o Paulo");
		System.out.println("Op��o [2]: Fortaleza");
		System.out.println("Op��o [3]: Manaus");
		System.out.println("Op��o [4]: Rio de Janeiro");
		System.out.println("Op��o [5]: Porto Alegre");
		cidade = leia.nextInt();

		switch (cidade) {
		case 1:
			opcoesMenuN();

			break;
		case 2:
			opcoesMenuN();

			break;
		case 3:
			opcoesMenuN();

			break;
		case 4:
			opcoesMenuN();

			break;
		case 5:
			opcoesMenuN();

			break;
		}
	}

	public void imprimirPontosTur() {
		// S�o Paulo
		if (cidade == 1) {
			System.out.println(
					"S�o Paulo tem tr�s principais pontos tur�sticos, sendo eles: Edif�cio It�lia, Parque do Ibirapuera, MASP e mais 35 destinos.");
			opcoesMenuN();

			// Fortaleza
		} else if (cidade == 2) {
			System.out.println(
					"Fortaleza tem tr�s principais pontos tur�sticos, sendo eles: Mercado Central de Fortaleza, Praia do Futuro, Av. Beira Mar e mais 20 destinos.");
			opcoesMenuN();
		}

		// Manaus
		else if (cidade == 3) {
			System.out.println(
					"Manaus tem tr�s principais pontos tur�sticos, sendo eles: Centro hist�rico, Encontro das �guas, Praia da Ponta Negra e mais 11 destinos.");
			opcoesMenuN();
		}

		// Rio de Janeiro
		else if (cidade == 4) {
			System.out.println(
					"Rio de Janeiro tem tr�s principais pontos tur�sticos, sendo eles: Cristo Redentor, P�o de a��car, Copacabana e mais 36 destinos.");
			opcoesMenuN();
		}

		// Porto Alegre
		else if (cidade == 5) {
			System.out.println(
					"Porto Alegre tem tr�s principais pontos tur�sticos, sendo eles: Parque Farroupilha, Cidade Baixa, Rio Gua�ba e mais 21 destinos.");
			opcoesMenuN();
		} else {
			System.out.println("ERRO");
		}
	}

	public void imprimirCustos() {
		System.out.println("Quantos dias voc� pretende ficar nesse destino? ");
		int qntsDias = leia.nextInt();

		if (cidade == 1) {
			double alimentacao = 55.83;
			double bilhete = 4.40;
			double aluguel = 99;
			double hospedagem = 90;
			double passagem = 0;
			double total = (((alimentacao + bilhete + aluguel + hospedagem) * qntsDias) + passagem);

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(total);

			System.out.println("S�o Paulo");
			System.out.println("Custo m�dio de alimenta��o di�rio: BRL " + alimentacao);
			System.out.println("Custo do bilhete para transporte: BRL " + bilhete);
			System.out.println("Custo de aluguel de carro di�rio a partir de: BRL " + aluguel);
			System.out.println("A hospedagem di�ria tem o custo inicial de: BRL " + hospedagem);
			System.out.println("Valor de passagens a partir de: BRL " + passagem);
			System.out.printf("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
					+ " dias, ser� de: " + nf.format(total));

		} else if (cidade == 2) {
			double alimentacao = 76;
			double bilhete = 3.90;
			double aluguel = 122.17;
			double hospedagem = 290;
			double passagem = 0;
			double total = (((alimentacao + bilhete + aluguel + hospedagem) * qntsDias) + passagem);

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(total);

			System.out.println("Fortaleza");
			System.out.println("Custo m�dio de alimenta��o di�rio: BRL " + alimentacao);
			System.out.println("Custo do bilhete para transporte: BRL " + bilhete);
			System.out.println("Custo de aluguel de carro di�rio a partir de: BRL " + aluguel);
			System.out.println("A hospedagem di�ria tem o custo inicial de: BRL " + hospedagem);
			System.out.println("Valor de passagens a partir de: BRL " + passagem);
			System.out.printf("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
					+ " dias, ser� de: " + nf.format(total));

		} else if (cidade == 3) {
			double alimentacao = 60;
			double bilhete = 3.80;
			double aluguel = 139;
			double hospedagem = 120;
			double passagem = 0;
			double total = (((alimentacao + bilhete + aluguel + hospedagem) * qntsDias) + passagem);

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(total);

			System.out.println("Manaus");
			System.out.println("Custo m�dio de alimenta��o di�rio: BRL " + alimentacao);
			System.out.println("Custo do bilhete para transporte: BRL " + bilhete);
			System.out.println("Custo de aluguel de carro di�rio a partir de: BRL " + aluguel);
			System.out.println("A hospedagem di�ria tem o custo inicial de: BRL " + hospedagem);
			System.out.println("Valor de passagens a partir de: BRL " + passagem);
			System.out.printf("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
					+ " dias, ser� de: " + nf.format(total));

		} else if (cidade == 4) {
			double alimentacao = 95;
			double bilhete = 5.80;
			double aluguel = 130;
			double hospedagem = 150;
			double passagem = 0;
			double total = (((alimentacao + bilhete + aluguel + hospedagem) * qntsDias) + passagem);

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(total);

			System.out.println("Rio de Janeiro");
			System.out.println("Custo m�dio de alimenta��o di�rio: BRL " + alimentacao);
			System.out.println("Custo do bilhete para transporte: BRL " + bilhete);
			System.out.println("Custo de aluguel de carro di�rio a partir de: BRL " + aluguel);
			System.out.println("A hospedagem di�ria tem o custo inicial de: BRL " + hospedagem);
			System.out.println("Valor de passagens a partir de: BRL " + passagem);
			System.out.printf("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
					+ " dias, ser� de: " + nf.format(total));

		} else if (cidade == 5) {
			double alimentacao = 73;
			double bilhete = 8.37;
			double aluguel = 99;
			double hospedagem = 110;
			double passagem = 0;
			double total = (((alimentacao + bilhete + aluguel + hospedagem) * qntsDias) + passagem);

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(total);

			System.out.println("Porto Alegre");
			System.out.println("Custo m�dio de alimenta��o di�rio: BRL " + alimentacao);
			System.out.println("Custo do bilhete para transporte: BRL " + bilhete);
			System.out.println("Custo de aluguel de carro di�rio a partir de: BRL " + aluguel);
			System.out.println("A hospedagem di�ria tem o custo inicial de: BRL " + hospedagem);
			System.out.println("Valor de passagens a partir de: BRL " + passagem);
			System.out.printf("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
					+ " dias, ser� de: " + nf.format(total));

		} else {
			System.out.println("ERRO");
		}

	}

	public void opcoesMenuN() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Op��o [1]: Custos");
		System.out.println("Op��o [2]: Pontos tur�sticos");
		System.out.println("Op��o [3]: Todas as op��es");
		opCidade = leia.nextInt();
		switch (opCidade) {
		case 1:
			imprimirCustos();
			break;
		case 2:
			imprimirPontosTur();
			break;
		case 3:
			imprimirCustos();
			imprimirPontosTur();
			break;

		}
	}
}
