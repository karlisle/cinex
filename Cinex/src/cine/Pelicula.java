package cine;

public class Pelicula 
{
	protected int opcion;
	
	protected String titulo;
	protected String director;
	protected int duracion;
	protected int 	 costo;
		
	public Pelicula(String titulo, String director, int duracion, int costo)
	{	
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.costo = costo;
	}
	
	
	/*
	 * Descripcion de la clase, Pelicula
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "La pelicula "+ titulo + " dirigida por, " + director + "\nes una hobra maestra, de "+duracion+ " minutos!\n"; 
	}
}
