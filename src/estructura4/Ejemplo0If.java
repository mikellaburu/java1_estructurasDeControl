 /*
 * Programa que pide una nota por teclado y muestra si se ha aprobado o no
 */
import java.util.*;
public class Ejemplo0If {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        System.out.print("Nota: ");
        int nota = sc.nextInt();
        if (nota >= 5 ){  //Si la nota tiene valor igual o mayor que 5 muestra los mensajes que estan enter llaves
            System.out.println("Enorabuena!!");
            System.out.println("Has aprobado");
        }
        else  //en cualquier caso que nota no sea mayor o igual que 5 mostrara el siguiente mensaje
            System.out.println("Lo Siento, has suspendido");
    }
}
