import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Destinos {
	
	abstract public void geNome();
	abstract public void imprimirCustos();
	abstract public void pontosTuristicos(); 
	abstract public void imprimirClima();
			
	public String nome;
	public String moeda;
	public String pontosTuristicos;
	public String sigla;
	public int fuso;
	public int temperaturaMin;
	public int temperaturaMax;
	public int periodo;
	public float cambio;
	public float bilhete;
	public float alimentacao;
	public float hospedagem;
	public float aluguel;
	public float passagem;
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public Destinos(String nome, String pontosTuristicos, int fuso, float bilhete, float alimentacao, float hospedagem,
			float aluguel, float passagem) {
		super();
		this.nome = nome;
		this.pontosTuristicos = pontosTuristicos;
		this.fuso = fuso;
		this.bilhete = bilhete;
		this.alimentacao = alimentacao;
		this.hospedagem = hospedagem;
		this.aluguel = aluguel;
		this.passagem = passagem;
	}
	
	
	public Destinos(String nome, String pontosTuristicos, float bilhete, float alimentacao, float hospedagem,
			float aluguel, float passagem) {
		super();
		this.nome = nome;
		this.pontosTuristicos = pontosTuristicos;
		this.bilhete = bilhete;
		this.alimentacao = alimentacao;
		this.hospedagem = hospedagem;
		this.aluguel = aluguel;
		this.passagem = passagem;
	}
	
	
	public Destinos(String nome, String moeda, String pontosTuristicos, String sigla, int fuso,
			int temperaturaMin, int temperaturaMax, int periodo, float cambio, float bilhete, float alimentacao,
			float hospedagem, float aluguel, float passagem) {
		// TODO Auto-generated constructor stub
		
		this.nome = nome;
		this.moeda = moeda;
		this.pontosTuristicos = pontosTuristicos;
		this.sigla = sigla;
		this.fuso = fuso;
		this.temperaturaMin = temperaturaMin;
		this.temperaturaMax = temperaturaMax;
		this.periodo = periodo;
		this.cambio = cambio;
		this.bilhete = bilhete;
		this.alimentacao = alimentacao;
		this.hospedagem = hospedagem;
		this.aluguel = aluguel;
		this.passagem = passagem;
		
	}
	public float getPassagem() {
		return passagem;
	}
	public void setPassagem(float passagem) {
		this.passagem = passagem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMoeda() {
		return moeda;
	}
	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}
	public String getPontosTuristicos() {
		return pontosTuristicos;
	}
	public void setPontosTuristicos(String pontosTuristicos) {
		this.pontosTuristicos = pontosTuristicos;
	}
	public  int getFuso() {
		return fuso;
	}
	public void setFuso(int fuso) {
		this.fuso = fuso;
	}
	public float getCambio() {
		return cambio;
	}
	public void setCambio(float cambio) {
		this.cambio = cambio;
	}

	public float getAlimentacao() {
		return alimentacao;
	}
	public void setAlimentacao(float alimentacao) {
		this.alimentacao = alimentacao;
	}
	public float getHospedagem() {
		return hospedagem;
	}
	public void setHospedagem(float hospedagem) {
		this.hospedagem = hospedagem;
	}

	public int getTemperaturaMin() {
		return temperaturaMin;
	}
	public void setTemperaturaMin(int temperaturaMin) {
		this.temperaturaMin = temperaturaMin;
	}
	public int getTemperaturaMax() {
		return temperaturaMax;
	}
	public void setTemperaturaMax(int temperaturaMax) {
		this.temperaturaMax = temperaturaMax;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public float getBilhete() {
		return bilhete;
	}
	public void setBilhete(float bilhete) {
		this.bilhete = bilhete;
	}
	public float getAluguel() {
		return aluguel;
	}
	public void setAluguel(float aluguel) {
		this.aluguel = aluguel;
	}
	public void imprimirFuso() {
	 {

		if (fuso < 0) {
			System.out.println("");
			System.out.println("\n*********Fuso horário**********");
			System.out.println("Diferença fuso horária " + fuso + ":00");
		} else {
			System.out.println("");
			System.out.println("\n*********Fuso horário**********");
			System.out.println("Diferença fuso horária +" + fuso + ":00");
		}

		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(new Date());
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		System.out.println("Horário local: " + sdf.format(gc.getTime()));
		gc.add(Calendar.HOUR, fuso);
		System.out.println("Horário no destino: " + sdf.format(gc.getTime()));
	}
	}
	
}
