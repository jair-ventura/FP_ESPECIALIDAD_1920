package pseint2;
import java.util.Scanner;

public class ejercicio13 {  				//EJEMPLO DE MAS DE 5 DIGITOS//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner num  = new Scanner(System.in);
				
			int numero=0;
			System.out.println("Introduce un numero: ");
			numero=num.nextInt();
	
			
			
			      int d�gitos = 0;
			      while ( numero > 0 ) {
			          numero /=10;
			          d�gitos++;
			          if (d�gitos ==5) ;
			      }
			      if (d�gitos ==5) System.out.println("El n�mero tiene 5 o m�s d�gitos");
			   
				else {
						System.out.println("Tiene menos de 5 digitos");
		}
	}
			
}
