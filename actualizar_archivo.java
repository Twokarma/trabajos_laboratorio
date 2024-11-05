package archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class actualizar_archivo {
	public static void sobreescribir_archivo(String texto) {
        try {
			
			// en este caso va a sobreescribir encima del archivo ya creado
			FileWriter escribir= new FileWriter("mi_archivo.txt"); 
			// se puede colocar un nombre que no existe, java lo va a crear
			escribir.write(texto);
			escribir.close();
			System.out.println("Edicion correcta");
			
		}catch(IOException error) {// se puede colocar error o e, depende de uno mismo
			System.out.println("Error de escritura");
		}
	}
	
	
	public static void Escribir_archivo(String texto,int valor) {
         try {
			
			// en este caso va a sobreescribir encima del archivo ya creado
			FileWriter escribir= new FileWriter("mi_archivo.txt",true);
			escribir.write(texto);
			escribir.close();
			System.out.println("Edicion correcta");
			
		}catch(IOException error) {// se puede colocar error o e, depende de uno mismo
			System.out.println("Error de escritura");
		}
	}
	
	
	
	
	public static void main(String[]args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el texto: ");
		String texto = leer.nextLine();  //no lolvidar agregar el nextline para que tome los espacios tambien
		//sobreescribir_archivo(texto);
		Escribir_archivo(texto,1);
		
		
		leer.close();
		
		
	}
	
	/*
	 * try {
			
			// en este caso va a sobreescribir encima del archivo ya creado
			FileWriter escribir= new FileWriter("mi_archivo.txt");
			escribir.write("Podemos escribir archivos desde our programa eclipse");
			escribir.close();
			System.out.println("Edicion correcta");
			
		}catch(IOException error) {// se puede colocar error o e, depende de uno mismo
			System.out.println("Error de escritura");
		}*/
}
