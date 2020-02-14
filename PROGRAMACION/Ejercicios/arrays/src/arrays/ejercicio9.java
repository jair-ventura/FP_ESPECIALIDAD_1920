package arrays;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] impar = new int[50];
		int numero = 0;
		int i = 0;

		do {
		   if ( numero%2 == 1 ) {  
		     impar[i] = numero;   
		     numero++;   
		     i++;   
		   }
		   numero++; 
		} 
		
		while ( i <=49 ); 

		for (int i1=0; i1 <impar.length; i1++) {
			   System.out.println("El numero "+impar[i1]+" es impar.");
			}
	}

}
