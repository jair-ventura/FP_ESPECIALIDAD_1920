package arrays;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce 10 números: ");
        
        int NumerosIntroducidos=0;
        
        int[] suma=new int[10];
        

        int i=0;
        int resultado =0;
        

        
        
        do{
            NumerosIntroducidos=scan.nextInt();
 
            if(NumerosIntroducidos<=9){
                suma[i]=NumerosIntroducidos;
                i++;
            }
        }while(NumerosIntroducidos!=0);
        
         resultado = NumerosIntroducidos;
      
}
}



