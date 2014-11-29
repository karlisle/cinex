package cine;

import java.util.ArrayList;


public class Golosinas 
{
	// Array en que contendra los datos de lasgolosinas
	// nombre, tipo, descripcion, precio, 
	String golosinas[][] = 
			{
			{"Palomitas", "Normales","Solo palomitas normales y naturales", "20"},
			{"Gaseosa", "Chica","Gaseosa sabor Cola", "15"},
			{"Chocolate", "Chico","Chocolate amargo","12"}  
			};
	
	protected String nombre;
	protected String tipo;
	protected String descripcion;
	protected int precio;
	
	ArrayList<String> compra = new ArrayList<String>();											// Declaramos una instancia de ArrayList, u array dinámico
	
	private Eleccion elegir = new Eleccion();												// Hacemos una instancia de la clase elegir
	protected int opt;																		// Aqui se almacena la eleccion.
	private menuEntrada mn = new menuEntrada(null, null, 0, 0);								// Instanciamos la clase menuEntrada
	private boleto tkt = new boleto(null, null, 0, 0);										// Instanciamos la clase boleto
	
	protected void golosina()
	{
		System.out.println("\n\nOk, esta en la sección de golosinas!\n");
		
				
		for (int i = 0; i<golosinas.length; i++)
		{
			nombre = golosinas[i][0];
			tipo = golosinas[i][1];
			descripcion = golosinas[i][2];
			precio = Integer.parseInt(golosinas[i][3]);	
			
			System.out.println("Opcion "+ i);
			System.out.println(toString());
			
		}
		
	}
	/*
	 * En este metodo cargamos las difernets golosinas antes de fenerar el tecket de pago
	 */
	protected void cargar()
	{
		golosina();																						// Mostramos el menú de golosinas
		
		opt = elegir.elegir();																			// Llamamos al metodo elegir de la clase Eleccion
		System.out.println("Ok, ha seleccionado: "+golosinas[opt][0]+"!\n");								// Indicamos que producto se ha seleccionado
		compra.add(golosinas[opt][0]);
		compra.add(golosinas[opt][3]);
		
		
		System.out.println("¿Cargar a la cuenta?");
		System.out.println("Seleccione 3, para terminar de comprar!");
		
		opt = elegir.sino();																			// Llamamos al metodo sino de la case Eleccion
		
		
		if(opt == 1)																					// Comparamos el resultado de la eleccion
		{
			System.out.println("Ok, el producto se cargara en la cuenta");
			// Cargar el total y la opción
			
			
			System.out.println("¿Seguir comprando?");
			opt = elegir.sino();																		// Nuevamente llamamos al metodo sino.			
			
			if(opt == 1)																				// Si la eleccion es 1 o si, continuamos
			{
				cargar();																				// Se llama al metodo golosina, que despliega el menu
																										// de golosinas existentes
			}
			else if(opt == 2)																			// Si la eleccion fue 'n'o o '0', regresamos al menu de golosinas
			{
				System.out.println("Regresando al menú de golosinas!");
				cargar();
			}
			else if(opt == 3)
			{
				System.out.println("Generando su ticket de pago.\n Espere!!");						
				//System.out.println(compra);
				tkt.boletoGolosina(compra);
				System.out.println("Regresando al menú principal!");				
				mn.elegir(); 																				// Llamamos al metodo elegir de la clase menuEntrada
				
			}
		}
		else if(opt == 2)																				// Si se elige no cargar a la cuenta, regresamos al menu golosinas
		{
			System.out.println("Regresando al menú de golosinas");
			cargar();
		}
		
		else if(opt == 3)																				// Si la elección fue terminar 0 '3', regresamos al menu principal
		{
			System.out.println("Generando su ticket de pago.\n Espere!!");						
			//System.out.println(compra);
			tkt.boletoGolosina(compra);
			System.out.println("Regresando al menú principal!");				
			mn.elegir(); 																				// Llamamos al metodo elegir de la clase menuEntrada
				
		}
	}
		
	@Override
	public String toString()
	{
		return " Producto: "+nombre+"\n Tipo: "+tipo+"\n Precio: "+ precio+"\n";
		
	}

}
