package cine;

import java.util.Scanner;

public class menuEntrada extends Pelicula
{
	
	protected int opcion;
	
	
	public menuEntrada(String titulo, String director, int duracion, int costo, int opcion) 
	{
		super(titulo, director, duracion, costo);
		// TODO Auto-generated constructor stub
		this.opcion = opcion;
	}

	void menuPrincipal()
	{
		System.out.println("\n\n\n");
		System.out.println("Bienvenido a Cinex.");
		System.out.println("Seleccione una de las opciones: \n");
		
		System.out.println("#############################");
		System.out.println("#       Menú                #");
		System.out.println("# 1- Ver estrenos!          #");
		System.out.println("# 2- Ver Cartelera general! #");
		System.out.println("# 3- Comprar golosinas :D!  #");
		System.out.println("#                           #");
		System.out.println("#############################");
		
		elegir();																	// Llamamos al metodo elegir, con el cual seleccionamos una opción.
	}
	
	/*
	 * Leemos la entrada desde el teclado de la selección que ha hecho el usuario.
	 * Esto es un metodo de servicio ;) 
	 */
	private void elegir()
	{
		Scanner leer = new Scanner(System.in);														// Cremos una instancia de Scanner
		
		System.out.println("Seleccione su opcion: \n ");
		
		opcion = leer.nextInt();																	// Leemos la opcion del usuario.
		leer.close();																				// Cerramos la lectura de datos
		
		estreno ver = new estreno(null, null, 0, 0);
		
		
		if (opcion == 1) 
		{
			System.out.println("Ok, ahora se listaran los estrenos!\n");
			ver.etrenos();
			//System.out.println(super.toString());
			
					
		}
		else if (opcion == 2)
		{
			System.out.println("Ok, ahora se listara toda la cartelera!");
			
			
			System.out.println("Regresando al menú principal.");
			
		}
		else if (opcion == 3)
		{
			System.out.println("Ok, ahora se listaran las golosinas!");
			
			System.out.println("Regresando al menú principal.");
			
		}
	
	}
	
	@Override
	public String toString()
	{
		return super.toString()+  " y es un  estreno";
	}

}











