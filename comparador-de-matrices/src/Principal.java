import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Cesar Mata.
 * Numero de control: 18251109.
 */
public class Principal {

	public static void main(String[] args) {
		int llenadoMatrizUno;
		int llenadoMatrizDos;
		int valorEncontrado;
		int valorUno;
		int valorDos;
		int coincidencia;
		int incremento = 0;
		
		int[] matrizoUno = new int[4];
		int[] matrizDos = new int[4];
		int[] vectorResultado = new int[4];
		
		Scanner entrada = new Scanner(System.in);

		// Llenado de n�meros de la primer matriz.
		for (int i = 0; i < matrizoUno.length; i++) {
			System.out.println("Ingresa numeros la matriz 1: ");
			llenadoMatrizUno = entrada.nextInt();
			matrizoUno[i] = llenadoMatrizUno;
		}

		System.out.println("");
		System.out.println(" * * * * * * * * * * * * * * * * * * * *");

		// Llenado de n�meros de la segunda matriz.
		for (int i = 0; i < matrizDos.length; i++) {
			System.out.println("Ingresa numeros la matriz 2: ");
			llenadoMatrizDos = entrada.nextInt();
			matrizDos[i] = llenadoMatrizDos;
		}

		// Se comparan ambas matrices y se llena la matriz con el resultado
		for (int x = 0; x < matrizoUno.length; x++) {
			valorUno = matrizoUno[x];
			for (int y = 0; y < matrizDos.length; y++) {
				valorDos = matrizDos[y];				
				if (valorUno == valorDos) {
					coincidencia = valorDos;
					++incremento;
 				vectorResultado[incremento] = coincidencia;
				}
			}
		}
		
		// Impresi�n de las coincidencias.
		System.out.println("Valores coincidentes en ambas matrices:");
		int resultado;
		for(int z = 0; z < vectorResultado.length; z++){
			resultado = vectorResultado[z];
			if(resultado != 0){
				System.out.println(resultado = vectorResultado[z]);
			}
		}
	}

}