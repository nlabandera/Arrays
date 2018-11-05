import java.util.*;
import java.lang.*;
public class E743 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int i = 1;
		int [] mes = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for (i=0; i<12; i++) {	
			
			System.out.println("Introduzca número del mes:");
			
			int j = teclado.nextInt();
			
			System.out.println("El mes " +j +" tiene " +mes[j-1] +" días.");
		}
		
		
		

	}

}
