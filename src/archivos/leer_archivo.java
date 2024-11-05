package archivos;
import java.io.File; // importamos la clase archivo
import java.io.FileNotFoundException; // para manejar los errores en el archivo
import java.util.Scanner; // para leer el contenido por teclado

public class leer_archivo {
	
	
	public static void main(String []args) {
		try {
			File archivo= new File("mi_archivo.txt");
			Scanner leer= new Scanner(archivo);
			String datos = "";
			while (leer.hasNextLine()) {  // mientras el archivo tenga contenido va a seguir leyendo
				datos += leer.nextLine(); // principio de concatenacion
				
			}
			System.out.println(datos);
			leer.close();
		}catch( Exception e ) {
			System.out.println("Error de la lectura");
		}
	}
	
	
	/*
	public static void main(String []args) {
		try {
			File archivo= new File("mi_archivo.txt");
			Scanner leer= new Scanner(archivo);
			
			while (leer.hasNextLine()) {  // mientras el archivo tenga contenido va a seguir leyendo
				String datos = leer.nextLine();
				System.out.println(datos);
			}
			
			leer.close();
		}catch( Exception e ) {
			System.out.println();
		}
	}*/
	
}
