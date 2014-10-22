 /*
 * Programa que lee un número entre 1 y 10 ambos incluidos
 */
import java.util.*;
public class Ejemplo2DoWhile {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner( System.in );

	/* en el siguiente bucle do-while se pedira un numero entero una y otra vez mientras sea menor que 1 o mayor que 10, 
	   o sea que hasta que el numero introducido sea entre 1 y 10, seguira pidiendo  */
        do {
            System.out.print("Escribe un número entre 1 y 10: ");
            n = sc.nextInt();
        }while (n<1 || n >10);
        System.out.println("Ha introducido: " + n);
    }
}
