package ejercicios;

import java.util.Arrays;

public class Ej1 {

	public static void main(String[] args) {
		
		int tabla[]=new int [20];
		int indice=0;
	
		
		for(int i=0;i<20;i++) {
		tabla[i]=(int) (Math.random()*100);
		}		
		
		System.out.println("Tabla original -> " + Arrays.toString(tabla));
		
			while (indice<tabla.length) { //Mientras el indice sea menor que el largo de la tabla
				
				if(tabla[indice]%2!=0) { //verifico si el VALOR DE LA POSICION EN LA TABLA es IMPAR PORQUE LA CONDICION DICE !=*DISTINTO DE 0*
					
					System.arraycopy(tabla, indice+1, tabla, indice,tabla.length - indice-1); //copio la tabla desde una posicion mas adelante y la pego en la posicion anterior
				
					tabla=Arrays.copyOf(tabla, tabla.length-1); //copio la tabla con una posicion menos en la misma tabla 
				
				} else {//en caso de ser impar el 
					indice++;
					//System.out.println("No hay impares en la tabla");
				}
			}//fin del while
			System.out.println("Tabla sin impares -> " + Arrays.toString(tabla));

	}

}
