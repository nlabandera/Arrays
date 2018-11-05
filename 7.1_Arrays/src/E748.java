import java.util.*;

public class E748 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[] vector1 = new int[3];
		int[] vector2 = new int[3];
		
		int v1=0;
		int v2=0;
		
		for (int i=0; i<3; i++) {
		
		System.out.println("Introduce valores para vector 1: ");
		vector1[v1] = teclado.nextInt();
		
		}
		
		/*for (int j=0; j<3; j++) {
			System.out.println("Introduce valores para vector 2: ");
			vector2[v2] = teclado.nextInt();
		}*/
		
		System.out.println(v1++);
		//System.out.println(v2);
		
		

	}

}
