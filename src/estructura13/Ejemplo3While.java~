 /*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
public class Ejemplo3While {
    public static void main(String[] args) {
	//declaracion y asignacion de variables CONSTANTES, por eso tienen el nombre entero en mayuscula
        final int VALOR_INICIAL = 10;  // limite inf. tabla
        final int VALOR_FINAL = 100;  // limite sup. tabla
        final int PASO = 10 ; // incremento

	//declaracion de variables, fahrenheit entero y celsius decimal
        int fahrenheit;
        double celsius;

	//a fahrenheit se le asigna el valor de la constante VALOR_INICIAL
        fahrenheit = VALOR_INICIAL;
        System.out.printf("Fahrenheit \t Celsius \n");

	/* mientras fahrenheit sea menor o igual que VALOR_FINAL ejecutara una y otra vez lo que este entre llaves, 
	   hasta que fahrenheit sea mayor que VALOR_FINAL, en este caso 100
	*/
        while (fahrenheit <= VALOR_FINAL ){
		//a celsius se le asigna el valor que corresponde al siguiente calculo
               celsius = 5*(fahrenheit - 32)/9.0;
		/* en la siguiente linea se da una distancia tabulacion con lo que esta entre comillas, y en la primera 
		   columna mostraria el valor que tenga fahrenheit, y en la segunda el de celsius  */
               System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
		//en cada vuelta se le suma al valor que tenga fahrenheit el valor de PASO
               fahrenheit += PASO;
        }
    }
}
