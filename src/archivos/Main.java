package archivos;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crear_archivo cr = new crear_archivo();
		Scanner leer = new Scanner(System.in);
		
		String nom= leer.next();
		System.out.println("Ingrese nombre para el archivo: "+nom);
		
		cr.crear_archivo(nom);
		
		leer.close();
	}

}
