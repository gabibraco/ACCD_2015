package Ordenar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Ordeno_Fichero extends Principal {
		
	public void ordenarFichero ( File origen, File destino,int codigo)throws IOException {
		try {
			/*
			 * Iniciamos la declaracion de nuestras variables (ArrayList,
			 * FileReader,BufferedReader,FileWriter,BufferedWriter) que nos 
			 * permitiran Leer y Escribir las lineas de nuestros archivos
			 * en forma de Bytes.
			 */
			LinkedList<String> lista = new LinkedList<String>();
		
			FileReader fr = new FileReader(origen);
			BufferedReader br = new BufferedReader(fr);
		
			FileWriter fw = new FileWriter(destino);
			PrintWriter pw = new PrintWriter(fw);
		
			String linea = null;
			
			//Fin de la declaracion de variables
			
			/*
			 * Inicio de la lectura de nuestro fichero de entrada, ponemos
			 * null en el while para poder leer linea a linea y no caracter 
			 * por caracter, y lo añadimos a nuestro array lista
			 */
			while ((linea = br.readLine()) != null){
				lista.add(linea);
			}
		/* 
		 * Ordenamos la lista con el método sort de la clase Collections 
		 * cuando es igual a 0 nos lo coloca de manera descendente segun la ordenacion 
		 * alfabetica,y con la funcion Collections.sort(lista,Collections.reverseOrder() 
		 * conseguimos ordenarla alfabeticamente de forma inversa empezando por la z.
		 * NOTA: si lo que qusiesemos es ordenarlo de manera natural con sort lo ordenamos
		 * y con reverse invertimos esa ordenacion.
		 * 
		 * */
			if(codigo==0){
				Collections.sort(lista);

			}else{
				Collections.sort(lista,Collections.reverseOrder());	
			}
		/* 
		 * Escribimos en el fichero de salida a traves del Iterator , definiendo una variable 
		 * de tipo String donde recogeremos los datos.  
		 */
			Iterator iter = lista.iterator();
			String cadena;
			while (iter.hasNext()){
				cadena = (String) iter.next();
				pw.println(cadena);
				System.out.println(cadena);
			}
		/* Cerramos los flujos de los ficheros */
		br.close();
		fr.close();
		pw.close();
		fw.close();
		/*Realizamos los catch para las excepciones . La primera sino se encuentra el fichero
		 *y la segunda por un error entrada I y salida O
		 */
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("No se ha encontrado el fichero");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

		



