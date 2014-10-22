
/*
 * programa que lee una nota y escribe la calificación correspondiente
 */
import java.util.*;
public class Ejemplo3If {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double nota;
      System.out.println("Introduzca una nota entre 0 y 10: ");
      nota = sc.nextDouble();
      System.out.println("La calificación del alumno es ");
      if(nota < 0 || nota > 10)  //si la nota es menor que 0 o mayor que 10 entonces mostrara que no es valida
         System.out.println("Nota no válida");
      else if(nota==10)  //si no se cumple la condicion anterior y la nota es igual que 10 dira que es Maricula de honor
           System.out.println("Matrícula de Honor");
      else if (nota >= 9) //si no se cumplen las condiciones anteriores y ademas la nota es mayor o igual que 9, dira sobresaliente
           System.out.println("Sobresaliente");
      else if (nota >= 7)  //si no se cumplen las condiciones anteriores y ademas la nota es mayor o igual que 7, dira notable
           System.out.println("Notable");
      else if (nota >= 6)  //si no se cumplen las condiciones anteriores y ademas la nota es mayor o igual que 6, dira bien
           System.out.println("Bien");
      else if (nota >= 5)  //si no se cumplen las condiciones anteriores y ademas la nota es mayor o igual que 5, dira suficiente
           System.out.println("Suficiente");
      else
           System.out.println("Suspenso");//  si no se cumple ninguna condicion anterior dira que es suspenso, o sea si es menor que 5 y mayor o igual a 0
    }
}

