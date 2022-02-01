import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
		 int op;
		 int f = 0;
		 
		 	System.out.println("Selecione o destino desejado");
			System.out.println("[1] – Londres");
			System.out.println("[2] – Paris");
			System.out.println("[3] – Los Angeles");
			System.out.println("[4] – Vancouver");
			System.out.println("[5] – Genebra");
			op= leia.nextInt();
			
			switch (op) {
			
			case 1:
				f = 3;
				break;
			}
		 
		 GregorianCalendar gc = new GregorianCalendar();
	        gc.setTime(new Date());
	        
	        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	        System.out.println("Horário local: " + sdf.format(gc.getTime()));
	        
	        gc.add(Calendar.HOUR,f);
	        System.out.println("Horário no destino: " + sdf.format(gc.getTime()));	
		 
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
