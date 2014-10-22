 /*
 * Programa que muestra un saludo distinto según la hora introducida
 */
import java.util.*;
public class Ejemplo2If {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int hora;
      System.out.println("Introduzca una hora (un valor entero): ");
      hora = sc.nextInt();
      if (hora >= 0 && hora < 12)  //si la hora introducida por teclado es mayor o igual que 0, y menor que 12, muestra el siguiente mensaje
          System.out.println("Buenos días");
      else if (hora >= 12 && hora < 21)  //si no cumple la condicion anterior y ademas la hora es mayor o igual que 12 y menor que 21 mostrara el siguiente mensaje
           System.out.println("Buenas tardes");
      else if (hora >= 21 && hora < 24) // si tampoco se cumple la condicion anterior y ademas la hora es mayor que 21 y menor que 24 mostrara el siguiente mensaje
            System.out.println("Buenas noches");
      else  //si no se cumple ninguna de las condiciones anteriores dira que la hora no es valida, por ejemplo si es mayor o igual a 24 o si el numero es negativo
            System.out.println("Hora no válida");
    }
}
