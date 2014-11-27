package cine;

public class menuEntrada extends Pelicula
{
	
	
	public menuEntrada(String titulo, String director, String duracion, int costo) 
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
	 */
	void elegir()
	{
				
	}

}
