package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		boolean salida = false;
		int tabla[] = new int[10];
		int opcion;
		Scanner lee = new Scanner(System.in);
		int indice = 0;
		int valorBorrar;

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100);
		} // fin del for

		do {
			System.out.println("1) Mostrar valores \n" + "2) Eliminar valor \n" + "3) Salir");
			System.out.println("Por favor introduzca la opcion que desee: ");
			opcion = lee.nextInt();

			switch (opcion) {
			case 1:
				System.out.println(Arrays.toString(tabla));
				break;

			case 2:

				System.out.println("Introduzca el valor que desea borrar: ");
				valorBorrar = lee.nextInt();

				indice = busqueda(tabla, indice, valorBorrar);

				tabla = borrar(tabla, indice);
				break;

			case 3:

				salida = true;
				break;
			}// fin del switch

		} // fin del do
		while (!salida);

	}
	public static int busqueda(int[] tabla, int indice, int valorBorrar) {
		while (indice < tabla.length && valorBorrar != tabla[indice]) {
			indice++;
		} // fin del while

		if (indice < tabla.length) {
			System.out.println(indice);
		} else {
			System.out.println("el valor no esta en la tabla");
		} // fin del if
		return indice;
	}

	/**
	 * @param tabla
	 * @param indice
	 * @return
	 */
	public static int[] borrar(int[] tabla, int indice) {
		if (indice >= 0) {
			System.arraycopy(tabla, indice + 1, tabla, indice, tabla.length - indice - 1);
		}

		tabla = Arrays.copyOf(tabla, tabla.length - 1);
		return tabla;
	}//fin del metodo
}
