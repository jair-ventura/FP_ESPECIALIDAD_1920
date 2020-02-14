package enumerados;


public class familia {
	
	public enum miembro{PADRE,MADRE,HERMANO,HERMANA,ABUELO,ABUELA,TIO,TIA }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(miembro familia:miembro.values())
			System.out.println(familia);	

	}

}
