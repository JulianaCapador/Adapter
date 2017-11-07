package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import logica.AdaptadorPersonaje;
import logica.Personaje;

	

public class Main {
	
	
	private static Personaje personaje;
	
	public static void main(String []args) throws NumberFormatException, IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int opcion = 0;
		
		System.out.println("Por favor seleccione una opcion");
		System.out.println("1. Mago");
		opcion = Integer.parseInt(in.readLine());
		
		switch(opcion){
		
		case 1:
			personaje = new AdaptadorPersonaje();
			procesar();
			
		
		}
	}
	
	private static void procesar(){
		personaje.caminar();
		personaje.atacar();
	}
	
}
