package cine;

import java.util.Scanner;

public class Eleccion 
{
	Scanner leer = new Scanner(System.in);										// Hacemos una instancia de Scanner
	int opt;																	// Variable en la que se almacena la lectura
	
	
	public int elegir()
	{
		try
		{
		System.out.println("Seleccione una de las opcion del menú:");
		opt = leer.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Erro: "+e);
		}
		return opt;
		
	}
	
	/*
	 * Metodo que se encarga de recojer una selección de tipo Si o No
	 * lo cual se maneja con un 0 si es falso, y 1 si es verdadero. 
	 * Y posteriormente se retorna el valor leido
	 */
	public int sino()
	{
		try
		{
		System.out.println("Seleccione:\n 1- continuar. \n 2- Cancelar. \n 3- Terminar");
		opt = leer.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Error: "+ e);
		}
		return opt;
		
	}
	
}
