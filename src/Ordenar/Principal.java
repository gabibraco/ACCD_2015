package Ordenar;



import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args)  {
		try{
		//Enlazamos con la otra clase
		Ordeno_Fichero cp =new Ordeno_Fichero();
		//Declaramos nuestros objetos
	
		File origen = new File("entrada.txt");
		File destino = new File("salida.txt");
		int codigo = 1;
		boolean f=false;
		// fin declaracion
		
		/*
		 * Inicializamos y creamos nuestro objeto scanner para pedir los parametros 
		 * por consola, a la cual se pasaremos una variable de tipo int.
		 */
		System.out.println ("Por favor introduzca el tipo de ordenacion(0;ascendente/1:descendente):");
        @SuppressWarnings("resource")
		Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        codigo = entradaEscaner.nextInt();

        /*
         * Inicializamos nuestra variable Boolean , la cual utilizaremos para poner una 
         * condicion. 	
         */
        f=(codigo==0)||(codigo==1);
		if(f==true){//valido que solo funcione para los valores 0 o 1
			try {
				cp.ordenarFichero(origen, destino,codigo);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}else{
			
			System.out.println("El codigo introducido no es valido");
		}
	}finally {
		
	}
}}


