//package array;

public class EjemploInternet {

  /**
   * Muestra por pantalla todos los elementos de un array de n�meros enteros
   * separados por un espacio.
   * 
   * @param x array unidimiensional de n�meros enteros
   */
	


  public static void muestraArrayInt(int x[]) {
    
	  for (int n : x) {
      
		  System.out.print(n + " ");
    
	  }
   
	  System.out.println();
  
  }

  /**
   * Crea un array y lo rellena con valores aleatorios dentro de un rango.
   * <p>
   * Por ejemplo, <code>generaArrayInt(100, 10, 30)</code> devolver�a un array
   * de 100 n�meros generados al azar comprendidos entre 10 y 30.
   * 
   * @param n      n�mero de elementos que contendr� el array
   * @param minimo l�mite inferior del intervalo de n�meros aleatorios
   * @param maximo l�mite superior del intervalo de n�meros aleatorios
   * @return       array relleno con valores aleatorios dentro del rango
   *               definido por <code>minimo</code> y <code>maximo</code>
   */
  public static int[] generaArrayInt(int n, int minimo, int maximo) {
    int[] x = new int[n];

    for(int i = 0; i < n; i++) {
      x[i] = (int)(Math.random()*(maximo - minimo + 1) + minimo);
    }
      
    return x;
  }

  /**
   * Devuelve el m�nimo (el n�mero m�s peque�o) del array que se pasa como
   * par�metro.
   * 
   * @param x array unidimiensional de n�meros enteros
   * @return  el n�mero m�s peque�o encontrado en el array que se pasa como
   *          parametro
   */
  public static int minimoArrayInt(int[] x) {
    int minimo = Integer.MAX_VALUE;
    
    for (int n : x) {
      if (n < minimo) {
        minimo = n;
      }
    }
    return minimo;
  }

  /**
   * Devuelve el m�ximo (el n�mero m�s grande) del array que se pasa como
   * par�metro.
   * 
   * @param x array unidimiensional de n�meros enteros
   * @return  el n�mero m�s grande encontrado en el array que se pasa como
   *          parametro
   */
  public static int maximoArrayInt(int[] x) {
    int maximo = Integer.MIN_VALUE;
    
    for (int n : x) {
      if (n > maximo) {
        maximo = n;
      }
    }
      
    return maximo;
  }
  
  /**
   * Devuelve la media aritm�tica de los n�meros contenidos en el array que se
   * pasa como par�metro.
   * 
   * @param x array unidimiensional de n�meros enteros
   * @return  media aritm�tica de los n�meros contenidos en el array que se pasa
   *          como par�metro
   */
  public static double mediaArrayInt(int[] x) {
    int suma = 0;
    
    for (int n : x) {
      suma += n;
    }
      
    return (double)suma / x.length;
  }
  
  /**
   * Nos dice si un determindado valor est� o no dentro de un array de n�meros
   * enteros.
   * 
   * @param x array unidimiensional de n�meros enteros
   * @param n n�meros entero que se buscar� dentro del array
   * @return  verdadero si <code>n</code> se encuentra en el array
   *          <code>x</code> en caso contrario.
   */
  public static boolean estaEnArrayInt(int[] x, int n) {
    for (int numero : x) {
      if (numero == n) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Devuelve la posici�n (el �ndice) de la primera ocurrencia de un n�mero
   * dentro de un array.
   *
   * @param x array unidimiensional de n�meros enteros
   * @param n n�meros entero que se buscar� dentro del array
   * @return  posici�n (�ndice) de la primera ocurrencia del n�mero
   *          <code>n</code> dentro del array <code>x</code> o -1 en caso de
   *          no encontrarse el n�mero
   */
  public static int posicionEnArrayInt(int[] x, int n) {
    for(int i = 0; i < x.length; i++) {
      if (x[i] == n) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Le da la vuelta a un array. Los primeros n�meros estar�n al final y
   * viceversa.
   *
   * @param x array unidimiensional de n�meros enteros
   * @return  array volteada con los primeros n�meros al final y viceversa
   */
  public static int[] volteaArrayInt(int[] x) {
    int[] a = new int[x.length];
    
    for(int i = 0; i < x.length; i++) {
      a[x.length - i - 1] = x[i];
    }
      
    return a;
  }
  
  /**
   * Devuelve un array rotada <code>n</code> posiciones a la derecha tomando
   * como referencia el array que se pasa como par�metro. Los n�meros que van
   * saliendo por la derecha vuelven a entrar por la izquierda.
   *
   * @param x array unidimiensional de n�meros enteros
   * @param n n�mero de movimientos (rotaciones hacia la derecha) a realizar
   * @return  array rotada <code>n</code> posiciones a la derecha
   */
  public static int[] rotaDerechaArrayInt(int[] x, int n) {
    
    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (n-- > 0) {
      aux = a[a.length - 1];
      for(i = a.length - 1; i > 0; i--) {
        a[i] = a[i - 1];
      }
      a[0] = aux;
    }
      
    return a;
  }
  
  /**
   * Devuelve un array rotada <code>n</code> posiciones a la izquierda tomando
   * como referencia el array que se pasa como par�metro. Los n�meros que van
   * saliendo por la izquierda vuelven a entrar por la derecha.
   *
   * @param x array unidimiensional de n�meros enteros
   * @param n n�mero de movimientos (rotaciones hacia la izquierda) a realizar
   * @return  array rotada <code>n</code> posiciones a la izquierda
   */
  public static int[] rotaIzquierdaArrayInt(int[] x, int n) {
    
    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (n-- > 0) {
      aux = a[0];
      for(i = 0; i < a.length - 1; i++) {
        a[i] = a[i + 1];
      }
      a[a.length - 1] = aux;
    }
      
    return a;
  }
}
