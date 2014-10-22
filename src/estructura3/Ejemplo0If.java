 /*
 * Programa que pide una nota por teclado y muestra un mensaje si la nota es
 * mayor o igual que 5
 */
import java.util.*;  //Importa todas las clases del paquete java.util de la API de Java
public class Ejemplo0If {  //Empieza la Clase, primera letra siempre en mayuscula
    public static void main( String[] args ){    //empieza la ejecucion del programa con el método main()
        Scanner sc = new Scanner( System.in );   //Se crea el objeto Scanner, para poder guardar le introducido por teclado(entrada standar, por eso System.in)
        System.out.print("Nota: ");  //Imprime la frase por pantalla
        int nota = sc.nextInt();  //declara la variable de tipo entero nota y le asigna el valor introducido por pantalla
        if (nota >= 5 ){  //si  la nota es mayor o igual que 5 hara lo que este entre las siguientes llaves
            System.out.println("Enorabuena!!");  //Imprime la frase por pantalla
            System.out.println("Has aprobado");  //Imprime la frase por pantalla
        }  //fin if
    }  //fin ejecucion(main)
}  //fin clase
