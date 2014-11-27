package cine;

public class estreno extends Pelicula
{
	
	
	
	public estreno(String titulo, String director, int duracion, int costo) {
		super(titulo, director, duracion, costo);
		// TODO Auto-generated constructor stub
	}

	public String[]etrenos() 
	{
		String pelicula1 [][] = {
								{"Interestelar", "Cristopher Nolan", "180", "50"},
								{"Star Trek Into Darkness", "J.J. Abrams", "132", "50"}
								};		

		/*
		super.titulo = pelicula1[0];
		super.director = pelicula1[1];
		super.duracion = Integer.parseInt(pelicula1[2]);
		*/
		int len = pelicula1.length;
		for(int x = 0; x <= len; x++)
		{	
			int op = x +1;
			System.out.println("Opcion: " + op );
			for(int y = 0; y <= 3; y++)
			{
				System.out.println(pelicula1[x][y]);
				
			}
			System.out.println("\n");
		}
		
		return null;
		
	}


}
