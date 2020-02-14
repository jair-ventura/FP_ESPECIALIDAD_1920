package enumerados;



public class marca {

	
	public enum marc {FERRARI,AUDI,OPEL,RENAULT,CITROEN,PEGEOUT}
	
	public static void main(String[] args) {


		for(marc marca:marc.values())
			System.out.println(marca);	

	}

}
