package Juego;

import java.util.ArrayList;

public class Jugador {
	private String nombre;
	private int puntaje;
	ArrayList<Carta> baraja =new ArrayList<Carta>();
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.puntaje=0;
	}
	public ArrayList<Carta> getBaraja() {
		return baraja;
	}
	public void setCarta(Carta carta) {
		baraja.add(carta);
	}
	public void calcularPuntaje() {
		for (int i=0;i<baraja.size();i++) {
			if(baraja.get(i).getValor()=="J"||baraja.get(i).getValor()=="Q"||baraja.get(i).getValor()=="K") {
				puntaje=puntaje+10;
			}else {
				if(baraja.get(i).getValor()=="A") {
					if(puntaje<=11) {
						puntaje=puntaje+10;
					}else {
						puntaje=puntaje+1;
					}
				}else{
					puntaje=puntaje+Integer.parseInt(baraja.get(i).getValor());
				}
			}		
		}
			
	}
	public int getPuntaje() {
		return puntaje;
	}
}
