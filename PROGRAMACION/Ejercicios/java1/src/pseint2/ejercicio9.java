package pseint2;

import java.util.Scanner;

public class ejercicio9 {

	
	    public static void main(String[]args){
	        Scanner PrimosAnt = new Scanner(System.in);
	        
	       int numero;
	       System.out.println("Introduce una cifra: ");
	       numero=PrimosAnt.nextInt();
	       
	       int B=numero;
	       int C=0;
	       int D=0;
	       int contador=numero;
	       
	       while (numero>0) {
	    	   B=numero;
	    	   C=0;
	    	   D=0;
	    	   
	      while (B>0)
	    {
	    	  D=D+1;
	    	  if (numero % D == 0) {
	    		  C=C+1;
	    	  }
	    	  
	    	  B=B-1;
	    }
	      if (C <= 2)
	      {
	    	  System.out.println("Numero primos anteriores al numero son: " +numero);
	    	  contador++;
	      }
	      numero--;   
	    		   
	    	   }
	       }
}