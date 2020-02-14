package arrays;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] par = new int[51];
		
		int numero = 0;
		int i = 0;

		do {
		   if ( numero%2 == 0 ) {  
		     par[i] = numero;   
		     numero++;   
		     i++;   
		   }
		   numero++; 
		} 
		
		while ( i <=50 ); 

		for (int i1=0; i1 <par.length; i1++) {
			   System.out.println("El numero "+par[i1]+" es par.");
			 
			   
		}
	}
}
