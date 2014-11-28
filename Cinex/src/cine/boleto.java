package cine;


public class boleto extends Pelicula
{
	
	
	public boleto(String titulo, String director, int duracion, int costo) 
	{
		super(titulo, director, duracion, costo);
		// TODO Auto-generated constructor stub
	}
	
	public void boletoPelicula()
	{
		
		for(int x=0; x<=10; x++)
		{
			System.out.println("*******************************");
		}
		System.out.println("\nUn momento, se esta \ngeneranodo su ticket!\n");
		System.out.println("*******************************");
		System.out.println("* Titulo: "+ titulo);
		System.out.println("* Duración:"+ director);
		System.out.println("* Costo: " + costo);
		System.out.println("* Disfrute de su pelicula!");
		System.out.println("*******************************");
		
	}
	
	@Override
	public String toString()
	{
		return "\n Disfrute su pelicula!!";
		
	}
}
