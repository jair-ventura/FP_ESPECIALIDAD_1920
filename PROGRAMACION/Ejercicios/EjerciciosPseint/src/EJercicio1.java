import java.util.Scanner;
public class EJercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    	
		        Scanner teclado=new Scanner(System.in);
		        
		        int num1,num2;
		        
		        System.out.print("Ingrese el primer valor: ");
		        num1=teclado.nextInt();
		        System.out.print("Ingrese el segundo valor: ");
		        num2=teclado.nextInt();
		        System.out.print("el numero mayor es: ");
		        if (num1>num2) {
		            System.out.print(num1);
		        } else {
		            System.out.print(num2);
		        }
		    }
		

	}


