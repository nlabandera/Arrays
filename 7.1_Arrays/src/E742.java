import java.util.*;

//NO ESTA TERMINADO

public class E742 {

	public static void main(String[] args) {
		// Pide al usuario 8 nums y muestra cual es el num máx y min
		
		Scanner teclado = new Scanner (System.in);
		
		final int SIZE = 8;
		
		int[] numeros = new int [SIZE];
		int i;
		int total=0;
		
		for(i = 0 ; i<SIZE ; i++) {
			
			System.out.println("Intruduzca dato "+i+": ");
			numeros[i] = teclado.nextInt();
			
		}
		int mayor = numeros[0];
		int menor = numeros[0];
		for (i=0; i<SIZE; i++) {
			
			if (numeros[i]>mayor) {
				mayor=numeros[i];
				
			}
			if (numeros[i]<menor){
				menor=numeros[i];
			}
		}
		System.out.println("El mayor es: "+mayor);
		System.out.println("El menor es: "+menor);
			

	}

}
