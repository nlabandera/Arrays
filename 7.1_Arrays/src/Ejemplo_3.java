import java.util.*;

public class Ejemplo_3 {

	public static void main(String[] args) {
		//----- El usuario introduce los valores del array
		
		Scanner teclado = new Scanner(System.in);
		 
        int[] datos = new int[3];
        
        for (int i=0; i<3; i++)
        {
            System.out.print( "Deme el dato "+i+": " );
            datos[i] = teclado.nextInt();
        }
        
        for (int i=2; i>=0; i--)
        {
            System.out.println( "El dato "+ i +" vale " + datos[i] );
        }

	}

}
