package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		int numUser;
		int tabla[]=new int[10];
		int indice=0;
			Scanner lee = new Scanner(System.in);
			
		System.out.println("Por favor introduzca los numeros que quiere introducir en la tabla: ");
		for(int i=0;i<tabla.length;i++) {
			tabla[i] = lee.nextInt();
		}
		
		while(indice<tabla.length) {//mientras el indice que vamos a controlar manualmente sea menor a la longitud de la tabla
			//si tabla[indice] que es igual a 0 por lo que tenemos inicado arriba
			if(EsPrimo(tabla[indice])) { //verifico si el VALOR DE LA POSICION EN LA TABLA es PRIMO con la funcion
				
				System.arraycopy(tabla, indice+1, tabla, indice,tabla.length - indice-1); //copio la tabla desde una posicion mas adelante y la pego en la posicion anterior
			
				tabla=Arrays.copyOf(tabla, tabla.length-1); //copio la tabla con una posicion menos en la misma tabla 
			
			} else {//en caso de nos ser primo el indice incremental 
				indice++;
				
			}
		}//fin del while		

		System.out.println("la tabla sin numeros primos es "+Arrays.toString(tabla));

	}
	 public static boolean EsPrimo(int num1) {
	    	boolean primo = true; //declaramos este boolean llamado primo que equivale a true
	    	
	    	for (int i = 2; i<num1; i++) {
	    		
	    		//En cada vuelta del for va a dividir el numero introducido entre i, 
	    		//si en algun caso resulta ser 0 pues el numero no es primo
	    		if (num1 % i == 0) {
	    			//entonces nuestro boolean pasa a ser false
	    			primo = false;
	    		}
	    	}
	    return primo;//solicitamos que devuelva primo
	    }
}
