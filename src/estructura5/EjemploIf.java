 /*
 * programa que pide un número por teclado y calcula si es par o impar
 */
import java.util.*;
public class EjemploIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;      
        System.out.println("Introduzca numero: ");
        num = sc.nextInt();
        if ((num%2)==0) //Si el resto de la division de num entre 2 es 0, dice que es par
           System.out.println("PAR");
        else  //si el resto no es 0 dira impar
            System.out.println("IMPAR");
    }
}
