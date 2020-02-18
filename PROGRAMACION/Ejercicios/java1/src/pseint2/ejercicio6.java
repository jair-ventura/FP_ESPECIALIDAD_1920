package pseint2;
import java.util.Scanner;        //BINARIO//
public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numero =new Scanner (System.in);
		
		int cifra;
		System.out.println("Introduce decimales positivos: ");
		cifra=numero.nextInt();
		
		System.out.println("");
		binario(cifra);
	}
		public static void binario(int n) {
			if (n==1) System.out.print("1");
			else {
				binario(n/2);
				System.out.print(n%2);
			}
	}

}
