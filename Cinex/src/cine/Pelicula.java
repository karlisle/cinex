package cine;

public class Pelicula 
{
	protected int opcion;
	
	protected String titulo;
	protected String director;
	protected String duracion;
	protected int 	 costo;
		
	public Pelicula(String titulo, String director, String duracion, int costo)
	{	
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.costo = costo;
	}
	
	/*
	 * Construimos un menu, con las peliculas en cartelera
	 */
	void menu(int opcion)
	{
		if (opcion == 1) 
		{
			System.out.println("Ver cartelera de estreno!");			
		} 
		else if(opcion == 2)
		{
			System.out.println("Ver Cartelera general!");
		}		
	}
}
