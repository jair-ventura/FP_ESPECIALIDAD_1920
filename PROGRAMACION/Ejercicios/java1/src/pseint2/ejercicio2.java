package pseint2;

import java.util.Scanner;

public class ejercicio2 {
	
	 public static void main(String[] args) {
		 //Funcion principal
		 
		 Scanner primo = new Scanner(System.in);
			
		 	int numero=0;
		 	int num;
			int i;
			
			
			System.out.println("Ingrese numero: ");
	        num=primo.nextInt();
	        
	        for(i=1;i<(num+1);i++){
	        if(num%i==0){
	            numero++;
	           }
	        }
	        if(numero>2){
	        	
	             System.out.println("El numero no es Primo");
	             
	           }else{
	        	   
	               System.out.println("El numero si es Primo");
	        }
	    }
		
		}

