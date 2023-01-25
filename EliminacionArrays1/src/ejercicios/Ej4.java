package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		int numUser;
		int tabla[]= new int [20];
		int indice=0;
		Scanner lee = new Scanner(System.in);
		for(int i=0; i<tabla.length;i++) {
			tabla[i]= (int)(Math.random()*10);
		}//fin del for
		
		System.out.println(Arrays.toString(tabla));
		System.out.println("Por favor introduzca un numero: ");
		numUser=lee.nextInt();
		
		while(indice<tabla.length) {
			
			if (tabla[indice]>numUser) {
				
				tabla = borrar(tabla, indice);
				} else {// sin esto NO FUNCIONA
					indice++;
				}//fin del if
			
		}//fin del while
		System.out.println(Arrays.toString(tabla));
	}//fin del main
	public static int[] borrar(int[] tabla, int indice) {
		if (indice >= 0) {
			System.arraycopy(tabla, indice + 1, tabla, indice, tabla.length - indice - 1);
		}

		tabla = Arrays.copyOf(tabla, tabla.length - 1);
		return tabla;
	}//fin del metodo
	}


