package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import logica.AdaptadorPersonaje;
import logica.Orco;
import logica.Personaje;

	

public class Main {
	
	
	private static Personaje personaje;
	
	public static void main(String []args) throws NumberFormatException, IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int opcion = 0;
		
		System.out.println("Por favor seleccione una opcion");
		System.out.println("1. Mago");
		System.out.println("2. Orco");
		opcion = Integer.parseInt(in.readLine());
		
		switch(opcion){
		
		case 1:
			personaje = new AdaptadorPersonaje();
			procesar();
			
			break;
			
		case 2:
			Orco orquito = new Orco();
			orquito.caminar();
			orquito.atacar();
			break;
		}
	}
	
	private static void procesar(){
		personaje.caminar();
		personaje.atacar();
	}
	
}
