package pseint2;
import java.util.Scanner;        //BIANRIO, OCTAL y HEXADECIMAL//

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner operaciones =new Scanner(System.in);
		
		int num;
		System.out.println("Introduce una cifra: ");
		num=operaciones.nextInt();
		
		int n=num;
		String binario=Integer.toBinaryString(n);
		String octal=Integer.toOctalString(n);
		String hexadecimal=Integer.toHexString(n);
		
	
		System.out.println("En Binario: "+binario);
		System.out.println("En Octal: "+octal);
		System.out.println("En Hexadecimal: "+hexadecimal);
		
		
	}

}

