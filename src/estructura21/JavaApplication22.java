 /*
 * Programa que muestra una tabla con las potencias de x (x x2 x3 x4)
 * para valores de x desde 1 hasta XMAX
 */
public class JavaApplication22 {
    public static void main(String[] args) {
        final int XMAX = 10;
        int x, n;
        //mostrar la cabecera de la tabla, con tabulaciones
        System.out.printf("%10s%10s%10s%10s%n", "x","x^2","x^3","x^4");

	/* este bucle muestra la cantidad de filas, comenzando con el valor uno 1 hasta que llegue al valor XMAX, 
	   incrementando 1 fila en cada vuelta  */
        for (x = 1; x <= XMAX; x++){   //filas

	     /* en este otro bucle se muestran las columnas, en este caso seran potencias, empezando con 1  hasta llegar a 4, 
		incrementando en uno en cada vuelta. Este bucle se ejecutara en cada fila, cada vuelta del bucle de las filas   */
             for (n = 1; n <= 4; n++){   //columnas

		  /* muestra por pantalla con tabulacion el resultado de una potencia, utilizando el metodo pow de la clase Math, 
		     dandole como parametros el numero(x) y su potencia(n)  */
                  System.out.printf("%10.0f", Math.pow(x,n));
             }
             System.out.println();
        }
    }
}
