package Juego;

public class Run {
	private Baraja mazo;
	private Carta carta = new Carta(null, null);
	Jugador jugador1 = new Jugador("jugador1");
	Jugador jugador2 = new Jugador("jugador2");
	public void crearMazo() {
		mazo = new Baraja();
	}
	public void llenarMazo() {
		mazo.llenarBaraja();
	}
	public int tamanoMazo() {
		return mazo.tamanoBaraja();
	}
	public void inicioJuego() {
		crearMazo();
		llenarMazo();
		repartirCartas();
	}
	public void repartirCartas() {
		carta = mazo.devolerCarta();
		jugador1.setCarta(mazo.devolerCarta());
		jugador1.setCarta(mazo.devolerCarta());
		jugador2.setCarta(mazo.devolerCarta());
		jugador2.setCarta(mazo.devolerCarta());
	}
	public void carcularPuntaje() {
		jugador1.calcularPuntaje();
		jugador2.calcularPuntaje();
	}
	public void ganador() {
		if(jugador1.getPuntaje()>jugador2.getPuntaje()) {
			System.out.println("Gano jugador 1");
		}else {
			if(jugador1.getPuntaje()<jugador2.getPuntaje()) {
				System.out.println("Gano jugador 2");
			}else {
				System.out.println("Empate");
			}
		}
	}
}
