/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Home
 */

public class controlador {
    public static double its = 0;
    public static double ea = 0;
    public void guardar(String nombre, String contenido){
			File archivo = new File(nombre);
			
				FileWriter fw = null;
				BufferedWriter bw = null;
				try {
					fw = new FileWriter(archivo);
					bw = new BufferedWriter(fw);
					bw.write(contenido);
			        //bw.newLine(); //metodo del buffer para agregar retorno y cambio de linea
				} catch (IOException e) {
					System.out.println("Error: " + e.getMessage());
				} finally {
						try {
							bw.close();
							fw.close();
						} catch (IOException e) {
							System.out.println("Error: " + e.getMessage());
						}
				}
			
		}

		public String leer(String nombre){

		File archivo = new File(nombre); //Cargar el archivo a leer
		String contenido="";
		Scanner s = null;
		try {
			s = new Scanner(archivo); //Lectura del archivo
			// Lectura linea por linea
			while (s.hasNextLine()) {
				contenido= s.nextLine(); // Almacenar una linea en un String
				//contenido  += linea + "\n"; // acumular la linea extraida
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
		// Cerramos el archivo si se pudo o no se pudo leer
			try {
				s.close();
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		return contenido;
	}

	public boolean existe(String nombre){
		File archivo = new File(nombre); 
		return archivo.exists();
	}
        public void incremento(int var, double inc){
            switch(var){
                case 1:
                    its+=inc;
                    break;
                case 2:
                    ea+=inc;
                    break;
            }
        }

    public double getIts() {
        return its;
    }

    public double getEa() {
        return ea;
    }
        
}
