 /*
 * Programa que lee números hasta que se lee un negativo y muestra la
 * suma de los números leídos
 */
import java.util.*;
public class Ejemplo1While {
    public static void main(String[] args) {
        int suma = 0, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();

	/*Inicio de bucle, mientras num sea mayor o igual que 0, 
	  se ejecutara lo que esta entre llaves 
	  hasta que num tenga un valor menor que 0.
	  Cuando sea menor que 0 terminara el bucle 
	  y seguira con el resto del programa
	*/
        while (num >= 0){
               suma = suma + num;
               System.out.print("Introduzca un número: ");
               num = sc.nextInt();
        }
	//al terminar el bucle mostrara la suma de los numeros introducidos
        System.out.println("La suma es: " + suma );
    }
}
