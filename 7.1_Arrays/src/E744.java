import java.util.*;

public class E744 {

	


	public static void main(String[] args)  {
		
		Scanner teclado = new Scanner(System.in);
		
		int i = 1;
		
		
		for(i=0; i<=12; i++) {
			
		
			String[] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		
			System.out.println("Intruduzca el número del mes:");
			i=teclado.nextInt();
			
			System.out.println("El mes " +i +" es " +mes[i-1]);
			
		
			
		
		}
		
		
	}

}
