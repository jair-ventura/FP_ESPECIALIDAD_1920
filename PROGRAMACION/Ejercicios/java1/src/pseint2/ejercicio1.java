package pseint2;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner numero = new Scanner(System.in); 
		
		double num1;
		double num2;
		int resultado;
		
		System.out.println("Introduce numero: ");
		num1=numero.nextInt();
		System.out.println("Introduce numero: ");
		num2=numero.nextInt();
		
		resultado=(int) (num1+num2);
		System.out.println(num1+ " + "+num2+"" +" = " +resultado);
		
	}

}
