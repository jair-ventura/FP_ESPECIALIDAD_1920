package enumerados;



public class meses {



		public enum mes {ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,DICIEMBRE};
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		
		
			 for (mes meses: mes.values())
			System.out.println(meses);
			}


	}