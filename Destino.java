import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Destino {

	private String nome;
	private String estacao;
	private double moeda;
	private int fuso;

	Scanner leia = new Scanner(System.in);

	public Destino(String nome, String estacao, double moeda, int fuso) {
		this.nome = nome;
		this.estacao = estacao;
		this.moeda = moeda;
		this.fuso = fuso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstacao() {
		return estacao;
	}

	public void setEstacao(String estacao) {
		this.estacao = estacao;
	}

	public double getMoeda() {
		return moeda;
	}

	public void setMoeda(double moeda) {
		this.moeda = moeda;
	}

	public int getFuso() {
		return fuso;
	}

	public void setFuso(int fuso) {
		this.fuso = fuso;
	}

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public void imprimirInfo() {
		System.out.println("********** 44 Turismo **********");
		System.out.println("Olá, somos a empresa 44 Turismo e seja bem-vinde ao nosso site!");

	}

	
	 public void horario() {
		 DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm");
	     System.out.println(dtf2.format(LocalDateTime.now())); 
	 }
	 

	public void vestimenta() {
		System.out.println("\nSelecione o período desejado");
		System.out.println("\n[1] – Janeiro a Março");
		System.out.println("\n[2] – Abril a Junho");
		System.out.println("\n[3] – Julho a Setembro");
		System.out.println("\n[4] – Outubro a Novembro");
		int periodo1 = leia.nextInt();

		if (periodo1 == 1) {
			System.out.println("inverno, não se esqueça de levar cachecol, luva e touca!");
		} else if (periodo1 == 2) {
			System.out.println("primavera, invista em roupas leves!");
		} else if (periodo1 == 3) {
			System.out.println("verão, não se esqueça do protetor solar!");
		} else if (periodo1 == 4) {
			System.out.println("outono e costuma chover, leve guarda chuva!");
		} else {
			System.out.println("Opção inválida!");
		}
	}

}
