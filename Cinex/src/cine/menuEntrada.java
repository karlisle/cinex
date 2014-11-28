package cine;

import java.util.Scanner;

public class menuEntrada extends Pelicula
{
	
	protected int opcion;
	Scanner lectura = new Scanner(System.in);
	
	
	public menuEntrada(String titulo, String director, int duracion, int costo) 
	{
		super(titulo, director, duracion, costo);
		// TODO Auto-generated constructor stub
		
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
	}
	
	/*
	 * Leemos la entrada desde el teclado de la selección que ha hecho el usuario.
	 * Esto es un metodo de servicio ;) 
	 */
	public void elegir()
	{
		menuPrincipal();
		
		System.out.println("Seleccione su opcion: \n ");
		
		opcion = lectura.nextInt();																	// Leemos la opcion del usuario.
																						// Cerramos la lectura de datos
		
		estreno ver = new estreno(null, null, 0, 0);												// Instanciamos  la clase estrenos.
		Golosinas golosina = new Golosinas();											// Creamos una instancia de Golosinas
	
		
		// Comenzamos a comparar la opcion seleccionada.
		if (opcion == 1) 
		{
			System.out.println("Ok, ahora se listaran los estrenos!\n");
			ver.estrenos();															// Se llama al metodo estrenos() de la clase estreno
			ver.selPeli();
			
			
		}
		else if (opcion == 2)
		{
			System.out.println("Ok, ahora se listara toda la cartelera!");
			System.out.println("Regresando al menú principal.");
		}
		else if (opcion == 3)
		{
			System.out.println("Ok, ahora se listaran las golosinas!");
			
			golosina.cargar();
			
				
		}
	}


}