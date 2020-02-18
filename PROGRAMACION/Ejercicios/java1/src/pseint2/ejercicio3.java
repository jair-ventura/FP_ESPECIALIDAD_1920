package pseint2;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner factorial = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num=factorial.nextInt(); 
		
		//mostramos resultados
		System.out.println("El factorial de: "+num+" es "+factorial(num));
		
	}
		
		public static double factorial(int n) {
			
		double aux=1;
		for(int i=2 ; i <= n ; i++) {
		aux *=i;
		}
		return aux;
			
		}

		
	}
	
