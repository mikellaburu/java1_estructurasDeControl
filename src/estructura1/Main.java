 /* Programa que lea dos números por teclado y los muestre por pantalla.
 */
import java.util.*;  //Importa todas las clases del paquete java.util de la API de Java
public class Main { //Empieza la Clase, primera letra siempre en mayuscula
    public static void main(String[] args){//empieza la ejecucion del programa con el método main()
       
        int n1, n2; //declaración de variables n1 y n2
        Scanner sc = new Scanner(System.in);  //Se crea el objeto Scanner, para poder guardar le introducido por teclado(entrada standar, por eso System.in) 
       
        System.out.println("Introduce un número entero: ");  //Imprime la frase por pantalla
	//leer el primer número
        n1 = sc.nextInt();      //lee un entero por teclado
        
        System.out.println("Introduce otro número entero: ");  //Imprime la frase por pantalla
	//leer el segundo número
        n2 = sc.nextInt();      //lee un entero por teclado
       
        //mostrar resultado
        System.out.println("Ha introducido los números: " + n1 + " y " + n2);  //Imprime la frase que esta entre comillas por pantalla, concatenando los valores que tienen n1 y n2
    }
}
