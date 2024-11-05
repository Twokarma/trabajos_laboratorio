package archivos;

import java.io.File;

public class eliminar_archivo {
	public static void eliminar(String nombre) {
		
		try {
			File archivo= new File(nombre+".txt");
			if(archivo.delete()) {
				System.out.println("Borrado exitoso");
			}else {
				System.out.println("Error en el borrado");
			}
		}catch(Exception error) {
			System.out.println("error"+error);
		}
		
	}
	
	public static void main(String[]args) {
		eliminar("mi_archivo_oscar");
	}
}
