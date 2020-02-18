package pseint2;

import java.util.Scanner;
public class ejercicio5 {
	
	 public static void main(String[] args) {
		 //Funcion principal
		 
		 Scanner invertir =new Scanner(System.in);
		 
		 int numero;
		 int invertido=0;
		 int resto;
		 
		 System.out.println("Escribe un numero: ");
		 numero=invertir.nextInt();
		 	
		 	while (numero > 0) {
		 	resto = numero % 10;
		 	invertido = invertido* 10 + resto;
		 	numero =numero/ 10;
		 	}
		 	
		System.out.println("Numero invertido "+invertido);	
		 	 	
	 }
}
