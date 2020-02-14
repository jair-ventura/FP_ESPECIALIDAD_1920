package arrays;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int [] suma= new int[11];
        
        
		suma[0]=5;
		suma[1]=38;
		suma[2]=15;
		suma[3]=92;
		suma[4]=71;
		suma[5]=92;
		suma[6]=71;
		suma[7]=92;
		suma[8]=71;
		suma[9]=92;
		suma[10]=71;
		
		for(int i=0;i<suma.length;i++) {
			
		System.out.println(i+" + "+suma[i]+" = "+(i+suma[i]));
		
         }
}
	}

