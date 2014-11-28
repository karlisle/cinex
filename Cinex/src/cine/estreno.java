package cine;

import java.util.Scanner;


/*
 * Clase estrenos, hereda de la clase Peliculas.
 * Es llamada desde menuEntrada, simpre que se elija mostrar los estrenos.
 */


public class estreno extends Pelicula
{	
	Scanner leer = new Scanner(System.in);										// Hacemos una instancia de Scanner
	int opt;																	// Variable en la que se almacena la lectura
	
	
	String pelicula1 [][] = {													
			{"Interestelar", "Cristopher Nolan", "180", "50"},
			{"Star Trek Into Darkness", "J.J. Abrams", "132", "50"},
			{"El extraño mundo de jack", "Tim Burton", "130", "60"}
			};																	// Array bi-dimencional en el cual cada uno de los 
	
																				// elementos exteriores, representa una pelicula
																				// y los internos los datos de la misma
	
	
	/*
	 * Constructor  
	*/ 
	public estreno(String titulo, String director, int duracion, int costo) {
		super(titulo, director, duracion, costo);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Este metodo se encarga de generar el menu de las peliculas de estreno
	 * Para ello toma los datos de las mismas desde el array 'pelicula1' y
	 * en base el se obtienen los datos necesarios y dado que se hereda de Pelicula 
	 * se usan los metodos de la clase padre para mostrar los estrenos
	 */
	public void estrenos() 
	{
				

			for(int i=0; i<pelicula1.length; i++)																	// Se inicia el ciclo de lectura/llamada.
			{
				/*
				 * Para obtener el elemento, se usa el valor de i como indice exterior y un valor 
				 * estatico para el interior, de este modo para cada incremento de i, se obtine el 
				 * mismo elemento interior.
				*/
				super.titulo = pelicula1[i][0];											 
				super.director = pelicula1[i][1];
				super.duracion = Integer.parseInt(pelicula1[i][2]);
				super.costo = Integer.parseInt(pelicula1[i][3]);			
				
				
				System.out.println("Opcion: "+ i );												// Se impirme el numero de la opcion.
				System.out.println(toString());										 			// Se llama al metodo toString de la clase madre.
																								// y se agrega el de esta misma				
			}			
					
	}
	
	public void selPeli()
	{
		
		System.out.println("\n\n\n\nSelecione su pelicula!\n");
		
		
		opt = leer.nextInt();
		
		System.out.print("Cargando datos de la pelicula: \n'"+ pelicula1[opt][0]+"'\n\n");
		
		System.out.println("\t¿Desea continuar?\n");
		System.out.println("\t 1 - Continuar. \n\t 0 - Cancelar.");
		
		opt = leer.nextInt();
		
		if(opt== 1)
		{
			
			// Instanciamos la clase boleto, y le pasamos los parametros de la pelicula
			// correspondientes a la pelicula seleccionada
			boleto tkt = new boleto(pelicula1[opt][0], pelicula1[opt][1], Integer.parseInt(pelicula1[opt][2]), Integer.parseInt(pelicula1[opt][3]));
			// Usando el objeto tkt(ticket), llamamos al metodo boletoPelicula
			tkt.boletoPelicula();			
		}
		else if(opt == 0)
		{	System.out.println("Regresando al menu previo!");
			menuEntrada mn = new menuEntrada(null, null, 0, 0);				
			mn.elegir();
		}
		
		
	}
	

	/*
	 * 	(non-Javadoc)
	 * @see cine.Pelicula#toString()
	 * Metodo toString de esta clase, solo cuenta con el precio de cada pelicula en el array.
	 */
	@Override
	public String toString()
	{
		return " Titulo: "+ super.titulo+"\n Director: "+super.director+"\n Duracion: "+super.duracion+"\n Costo: "+super.costo+"\n";
	}


}




