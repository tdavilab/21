package StepDefinition;

import Juego.Run;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				
	Run juego = new Run(); 
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
	
	    @Then("^validar cartas$")					
	    public void validar_cartas() throws Throwable 							
	    {    		
	    	if(juego.tamanoMazo()==52) {
	    		System.out.println("Baraja creada correctamente");					
	    	}
	 	}	
	    
	    @Given("^juego iniciado$")				
	    public void juego_iniciado() throws Throwable							
	    {		
	       juego.inicioJuego();					
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