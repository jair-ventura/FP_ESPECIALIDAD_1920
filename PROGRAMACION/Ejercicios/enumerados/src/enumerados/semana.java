package enumerados;


public class semana {

		public enum dia {LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO};
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			 
			 for (dia laboral: dia.values())
			System.out.println(laboral);
			}


	}


