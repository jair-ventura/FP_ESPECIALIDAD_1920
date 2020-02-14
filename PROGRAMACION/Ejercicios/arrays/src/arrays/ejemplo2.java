package arrays;

public class ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 /*String [] paises=new String[8];
		
		paises [0]="España";
		paises [1]="Mexico";
		paises [2]="Colombia";
		paises [3]="Peru";
		paises [4]="Chile";
		paises [5]="Argentina";
		paises [6]="Ecuador";
		paises [7]="Venezuela";
	/*
	/*	for(int i=0; i<paises.length;i++) {
			System.out.println("Pais "+ (i+1) +" " + paises[i]);
			
		}
	*/
		String [] paises= {"España","Mexico","Colombia","Peru","Chile","Argentina","Ecuador","Venezuela"};
		
		for(String elemento:paises) {
			System.out.println("Pais: "+ elemento);
			
		}
		
		
		
	}

}
