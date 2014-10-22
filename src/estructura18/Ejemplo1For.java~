
/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
public class Ejemplo1For {
    public static void main(String[] args) {
        final int VALOR_INICIAL = 10; // limite inf. tabla
        final int VALOR_FINAL = 100; // limite sup. tabla
        final int PASO = 10 ; // incremento
        int fahrenheit;
        double celsius;
        fahrenheit = VALOR_INICIAL;
        System.out.printf("Fahrenheit \t Celsius \n");

	/* este bucle comienza asignando VALOR_INICIAL a la variable entera fahrenheit, 
	   hasta que fahrenheit sea menor o igual que VALOR_FINAL, y a fahrenheit 
	   se le ira sumando el valor que tiene la variable PASO en cada vuelta. 
	   Ademas se ejecutaran las sentencias que hay entre llaves en cada vuelta. */
        for (fahrenheit = VALOR_INICIAL; fahrenheit <= VALOR_FINAL; fahrenheit+= PASO){
             celsius = 5*(fahrenheit - 32)/9.0;
             System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
        }
    }
}

