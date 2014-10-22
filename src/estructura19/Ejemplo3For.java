
/*
 * programa que muestra el valor de a, b y su suma mientras que la suma de
 * ambas es menor de 10. En cada iteración el valor de a se incrementa en
 * 1 unidad y el de b en 2
 */
public class Ejemplo3For {
    public static void main(String[] args) {
        int a, b;
	/* en el siguiente bucle for se utilizan dos variables, a y b. comienza dando el valor 1 a las dos variables, 
	   mientras que la suma de a y b sea menor que 10, en cada vuelta se le suma 1 a la variable a, y 2 a la b.
	   En cada vuelta se muestra el valor que tienen a y b, y el resultado de la suma. */
        for(a = 1, b = 1; a + b < 10; a++, b+=2){
            System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a+b));
        }
    }
}

