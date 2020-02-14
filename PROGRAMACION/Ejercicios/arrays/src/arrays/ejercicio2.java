package arrays;

public class ejercicio2 {

	    static int par (int t[], int pos)
	    
	    {
	       
	    	
	        if(pos<t.length) {
	            if(t[pos]%2==0)
	            {
	                System.out.println("El valor "+t[pos]+" es par");
	            }
	            
	            par(t,pos+1);
	        }
	        return 1;
	    }
	 

	    static int par (int t[])
	    {
	        return (par (t,0));
	    }
	 
	    public static void main(String[] args) {
	        
	    	// Definimos el array
	    	int []numero =new int [100];
	    
	 
	        par(numero);
	    }
	}