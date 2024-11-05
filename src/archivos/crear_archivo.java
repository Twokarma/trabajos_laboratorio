package archivos;


import java.io.File;// importa la clase que nos permitira interactuar con los archivos
import java.io.IOException;
import java.util.Scanner;
import java.io.*; // se llama a todas las clases de io 
public class crear_archivo {
	
	public static void crear_archivo(String nom) {
		try {
			File archivo= new File("C:\\Users\\Clases\\Desktop\\mis videos\\"+nom+".txt");   
			
			if(archivo.createNewFile()) {
				System.out.println("Archivo creado correctamente");
			}else {
				System.out.println("El archivo ya existe");
			}
		}catch(IOException error) {// se puede colocar error o e, depende de uno mismo
			System.out.println("Error durante la craecion");
		}
	}
	
	
	
	
	public static void main(String[]args) {
		Scanner leer = new Scanner(System.in);
		String nombre= leer.next();
		crear_archivo(nombre);
		
		/*
		try {
			File archivo= new File("C:\\Users\\Clases\\Desktop\\mis videos\\archivo_oscar.txt");   // 
			
			if(archivo.createNewFile()) {
				System.out.println("Archivo creado correctamente");
			}else {
				System.out.println("El archivo ya existe");
			}
		}catch(IOException error) {// se puede colocar error o e, depende de uno mismo
			System.out.println("Error durante");
		}
		*/
	}
	
}
