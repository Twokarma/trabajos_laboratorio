package archivos;

import java.util.*;
public class Principal {
	
	public static String leer() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese texto");
		String contendio= leer.nextLine();
		return contendio;
	}
	public static void menu() {

		System.out.println("-----------------------------------");
		System.out.println("1. crear un arhivo");
		System.out.println("2. sobreescribir al archivo");
		System.out.println("3. agregar datos al archivo");
		System.out.println("4. eliminar archivo");
		System.out.println("5. salir del menu");
		System.out.println("-----------------------------------");
		int opcion= Integer.parseInt(leer());
		switch(opcion){
		case 1:
			System.out.println("Ingrese nombre ");
			String nombre =leer();
			crear_archivo.crear_archivo(nombre);
					
			break;
		case 2 :
			System.out.println("-------------------------");
			String texto = leer();;
			actualizar_archivo.sobreescribir_archivo(texto);
			break;
		case 3:
			System.out.println("-------------------------");
			String texto_add= leer();
			actualizar_archivo.Escribir_archivo(texto_add, 0);
			break;
		case 4:
			System.out.println("-------------------------");
			String nombre_ar= leer();
			eliminar_archivo.eliminar(nombre_ar);
			break;
		case 5:
			break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		menu();
		
	}

}
