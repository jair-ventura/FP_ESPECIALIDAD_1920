package pseint2;
									//HEXADECIMAL//
import java.util.Scanner;
public class ejercicio8 {
			 
	    public static void main(String[] args) {
	    	
	   Scanner hex = new Scanner(System.in);
	  	
	   int numero;
	   System.out.println("Introduce un numero decimal positivo: ");
	   numero=hex.nextInt();
	    
	   System.out.print("");
	   hexadecimal(numero);
	   
	    }
	    
	    public static void hexadecimal(int n) {
	    	if (n<16) {
	    	if (n == 10) System.out.print("A");
	    	if (n == 11) System.out.print("B");
	    	if (n == 12) System.out.print("C");
	    	if (n == 13) System.out.print("D");
	    	if (n == 14) System.out.print("E");
	    	if (n == 15) System.out.print("F");
	    	}
	    	else {
	    		hexadecimal(n/16);
	    		System.out.print(n%16);
	    		
	    		}
	    	}
	 }
	
	    
	   
	   
	   
	    


 