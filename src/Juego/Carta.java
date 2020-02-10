package Juego;

public class Carta {
	private String valor;
	private String palo;
	
	Carta(String valor, String palo){
		this.palo=palo;
		this.valor=valor;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	
}
