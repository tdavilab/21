package Juego;

import java.util.ArrayList;

public class Baraja {
	String [] valor= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String [] palo = {"Corazon", "Diamantes", "Picas", "Treboles"};
	ArrayList<Carta> baraja =new ArrayList<Carta>();
	public void llenarBaraja(){
		for (int i = 0; i<palo.length;i++){
			for (int j = 0; j<valor.length;j++){
				baraja.add(new Carta(valor[j], palo[i]));
			}
		}
	}
	public Carta devolerCarta() {
		Carta devolver;
		int carta =(int) Math.floor(Math.random()*baraja.size());
		devolver = baraja.get(carta);
		baraja.remove(carta);
		return devolver;
	}
	public int tamanoBaraja() {
		return baraja.size();
	}
}
