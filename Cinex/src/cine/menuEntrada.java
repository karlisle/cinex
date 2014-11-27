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
	}
	
	/*
	 * Leemos la entrada desde el teclado de la selección que ha hecho el usuario.
	 * Esto es un metodo de servicio ;) 
	 */
	private void elegir()
	{
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Seleccione su opcion: \n ");
		
		opcion = leer.nextInt();
		leer.close();
	
	}
	
	@Override
	public String toString()
	{
		return super.toString()+  " y es un  estreno";
	}

}











