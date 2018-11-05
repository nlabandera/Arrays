import java.util.*;

public class Ejemplo_4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        
		final int SIZE = 5;
 
        int[] datos = new int[SIZE];
        for (int i=0; i<SIZE; i++)
        {
            System.out.print( "Deme el dato "+i+": " );
            datos[i] = teclado.nextInt();
        }
 
        for (int i=SIZE-1; i>=0; i--)
        {
            System.out.println( "El dato "+ i +" vale " + datos[i] );
        }

	}

}
