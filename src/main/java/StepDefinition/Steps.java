package StepDefinition;

import Juego.Run;
import Juego.DifferentValuesException;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				
	Run juego = new Run(); 

	// Scenario 1 :

	@Given("^inicia juego$")				
    public void inicia_juego() throws Throwable							
    {		
       juego.crearMazo();					
    }		

    @When("^llenar mazo$")					
    public void llenar_mazo() throws Throwable 							
    {		
       juego.llenarMazo();					
    }		

    @Then("^validar que el numero de cartas en el mazo sea (\\d+)$")					
    public void validar_cartas(int arg1) throws Throwable 							
    {    		
    	if(juego.tamanoMazo()==arg1) {
    		System.out.println("Baraja creada correctamente");					
    	}else{
    		throw new DifferentValuesException("La creación de la baraja ha fallado");
    	}
 	}	


 	// Scenario 2 :
    
    @Given("^juego iniciado$")				
    public void juego_iniciado() throws Throwable							
    {		
       juego.inicioJuego();					
    }

	@When("^repartir cartas$")
	public void repartir_cartas() throws Throwable {
	    juego.repartirCartas();
	}

	@Then("^verificar que el total de cartas repartidas sea (\\d+)$")
	public void verificar_que_el_total_de_cartas_repartidas_sea(int arg1) throws Throwable {
		if(juego.getCartasRepartidas()==arg1){
    		System.out.println("Cartas repartidas correctamente");					
		}else{
			throw new DifferentValuesException("Las cartas se repartieron incorrectamente");
		}
	}


	// Scenario 3 :

	@Given("^mostrar cartas$")
	public void mostrar_cartas() throws Throwable {
	    juego.mostrarCartas();
	}

    @When("^calcula puntaje$")					
    public void calcula_puntaje() throws Throwable 							
    {		
    	juego.carcularPuntaje();
    }		

    @Then("^verifica ganador$")					
    public void verifica_ganador() throws Throwable 							
    {    		
    	juego.ganador();
    }	 

}