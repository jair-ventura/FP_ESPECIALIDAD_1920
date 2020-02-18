package pseint2;
import java.util.Scanner;
public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  operacion =new Scanner (System.in);
		
		int num,num1;
		int num2,num3,num4,num5;
		System.out.println("Introduce la primera cifra:");
		num=operacion.nextInt();
		
		System.out.println("Introduce la segunda cifra:");
		num1=operacion.nextInt();
		
		num2=num+num1;
		num3=num-num1;
		num4=num*num1;
		num5=num/num1;
		
		System.out.println("La suma es: "+num2);
		System.out.println("La resta es: "+num3);
		System.out.println("La division es: "+num4);
		System.out.println("La multiplicacion es: "+num5);
		
		
	}
}
