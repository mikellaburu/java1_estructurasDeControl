 /*
 * Programa que lee dos números de tipo double por teclado
 * y muestra su suma, resta y multiplicación.
 */
import java.util.*;  //Importa todas las clases del paquete java.util de la API de Java
public class Main {  //Empieza la Clase, primera letra siempre en mayuscula
    public static void main(String[] args){  //empieza la ejecucion del programa con el método main()
        Scanner sc = new Scanner(System.in);  //Se crea el objeto Scanner, para poder guardar le introducido por teclado(entrada standar, por eso System.in)
        double numero1, numero2;  //se decalran las variables de tipo decimal numero1 y numero2
        System.out.println("Introduce el primer número:");  //Se imprime por salida standar(pantalla System.out), lo que esta entre comillas
        numero1 = sc.nextDouble();  //a numero1 se le asigna el valor decimal introducido por teclado
        System.out.println("Introduce el segundo número:");  //Imprime la frase por pantalla
        numero2 = sc.nextDouble();  //a numero2 se le asigna el valor decimal introducido por teclado
        System.out.println("Números introducido: " + numero1 + "  " + numero2);//Imprime la frase que esta entre comillas por pantalla, concatenando los valores que tienen numero1 y numero2
        System.out.println
          (numero1 + " + " + numero2 + " = " + (numero1+numero2));  //imprime los valores de numero1 y numero2, y la suma de ellos
        System.out.println
          (numero1 + " - " + numero2 + " = " + (numero1-numero2));  //imprime los valores de numero1 y numero2, y la resta de ellos
        System.out.println
          (numero1 + " * " + numero2 + " = " + numero1*numero2);  //imprime los valores de numero1 y numero2, y la multiplicacion de ellos
    }  //fin de ejecucion(main)
}  //fin de clase
