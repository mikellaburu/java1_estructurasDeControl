 /*
 * Programa que dibuja un rectángulo sólido de asteriscos.
 * El número de filas y columnas se pide por teclado
 */
import java.util.*;
public class Ejemplo1BuclesAnidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        //leer número de filas una y otra vez mientras que sea un número menor que 1, o sea pedira de nuevo si es 0 o menor, hasta que sea 1 o mayor
        do{
           System.out.print("Introduce número de filas: ");
           filas = sc.nextInt();
        }while(filas<1);

        //leer número de columnas hasta que sea un número mayor que 0, o sea pedira de nuevo si es 0 o menor
        do{
           System.out.print("Introduce número de columnas: ");
           columnas = sc.nextInt();
        }while(columnas<1);

	/* este bucle depende del numero de filas, comienza con 1(variable i), y hasta que llegue al numero de filas introducido, 
	   se añadira una vuelta mas. La variable i se declara dentro de la sentencia for, 
	   por lo que tiene la vida solo mientras este dentro del bucle   */
        for(int i = 1; i<=filas; i++){    //filas

	    /* este bucle depende del numero de columnas, comienza con 1(variable j), y hasta que llegue al numero de columnas introducido, 
	       se añadira una vuelta mas. La variable j se declara dentro de la sentencia for, 
	       por lo que tiene la vida solo mientras este dentro del bucle.
		Ademas este bucle de columnas se hara por cada fila que haya, ya que esta dentro del bucle de filas   */
            for(int j = 1; j<=columnas; j++){   //columnas
                 System.out.print(" * ");
            }
            System.out.println();
        }
       
    }
}
