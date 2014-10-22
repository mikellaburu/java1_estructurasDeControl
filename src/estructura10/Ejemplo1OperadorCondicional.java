
 /*
  * programa que pide un número por teclado y calcula si es par o impar
  */
import java.util.*;
public class Ejemplo1OperadorCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;      
        System.out.println("Introduzca numero: ");
        num = sc.nextInt();

	/*Se imprimira por pantalla PAR o IMPAR, dependiendo del valor booleano que devuelva la comparacion (num%2)==0, 
	  que hace lo siguiente: calcula el resto(mod) de num y comprueba si es igual que 0. Si se cumple la condicion mostrara PAR 
	  por que es la primera opcion (la 0, teniendo en cuenta que se cuenta a partir de 0), que en java es true,
	  y IMPAR si es 1, porque es la segunda opcion o false. Estas opciones se separan con':', es lo que indica 
	  cual tendria true(la que esta antes), y cual false (la que esta despues).
	  Es una manera de poner una condicion en una linea, pero no es muy clara a la vista
	*/
        System.out.println((num%2)==0 ? "PAR" : "IMPAR");
    }
}

