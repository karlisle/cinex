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
								{"Star Trek Into Darkness", "J.J. Abrams", "132", "50"},
								{"El extraño mundo de jack", "Tim Burton", "130", "60"}
								};		

		int len = pelicula1.length;
		int tope = 0;
		for(int i=0; i<=len; i++)
		{
			super.titulo = pelicula1[i][0];
			super.director = pelicula1[i][1];
			super.duracion = Integer.parseInt(pelicula1[i][2]);
			super.costo = Integer.parseInt(pelicula1[i][3]);			
			
			if(i == tope)
			{
				int opt = len - i;
				System.out.println("Opcion: "+ opt );
				System.out.println(super.toString());
				tope += 1;
				
			}
			
		}
		
		return null;
		
	}


}
