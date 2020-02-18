package pseint2;
import java.util.Scanner;
public class ejercicio7 {		//OCTAL//
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  numero =new Scanner (System.in);
		
		int cifra;
		System.out.println("Introduce decimales positivos");
		cifra=numero.nextInt();
		
		System.out.println("");
		octal(cifra);
		
	}
			
		public static void octal(int n) {
			if (n<8) System.out.print(1);
			else {
				octal(n/8);
				System.out.print(n%8);
							
			}
	}
}

