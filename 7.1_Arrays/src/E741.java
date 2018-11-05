import java.util.*;

public class E741 {

	public static void main(String[] args) {
		
		//---- El usuario introdice hasta 5 datos y calcula su media
		
		Scanner teclado = new Scanner(System.in);
		
		final int SIZE = 5;
		int[] datos = new int[SIZE];
		double sumaTotal = 0;
		int i;
		
		
		for(i=0; i<SIZE; i++) {
			System.out.print("Dime dato "+i+": ");
			datos[i] = teclado.nextInt();
			sumaTotal += datos[i];
			
		}
		
		double media = sumaTotal/SIZE;	
		System.out.println("La media es: " + media);
		
		//for(i=0; i>media; i++)
		//System.out.println(datos[i]>media);
		
		
		
	}

}
