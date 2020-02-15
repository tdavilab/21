package Juego;

public class Run {
	private Baraja mazo;
	private Carta carta;
	Jugador jugador1;
	Jugador jugador2;

	public Run(){
		carta = new Carta(null, null);
		jugador1 = new Jugador("jugador1");
		jugador2 = new Jugador("jugador2");
	}

	private boolean finalizar_juego = false;

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
		//repartirCartas();
	}
	public void repartirCartas() {
		carta = mazo.devolerCarta();
		jugador1.setCarta(mazo.devolerCarta());
		jugador1.setCarta(mazo.devolerCarta());
		jugador2.setCarta(mazo.devolerCarta());
		jugador2.setCarta(mazo.devolerCarta());
	}
	public int getCartasRepartidas(){
		return jugador1.getTamanoMano()+jugador2.getTamanoMano();
	}

	public void mostrarCartas(){
		inicioJuego();
		repartirCartas();
		finalizar_juego = true;
	}

	public void carcularPuntaje() {
		if (finalizar_juego == true) {
			jugador1.calcularPuntaje();
			jugador2.calcularPuntaje();
		}
	}
	public void ganador() {
		System.out.println("Puntaje Jugador 1: "+jugador1.getPuntaje()+", Puntaje Jugador 2: "+jugador2.getPuntaje());
		if(jugador1.getPuntaje()>jugador2.getPuntaje()) {
			System.out.println("Gano Jugador 1");
		}else {
			if(jugador1.getPuntaje()<jugador2.getPuntaje()) {
				System.out.println("Gano Jugador 2");
			}else {
				System.out.println("Empate");
			}
		}
	}
}
