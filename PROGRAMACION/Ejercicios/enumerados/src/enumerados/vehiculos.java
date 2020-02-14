package enumerados;



public class vehiculos {

	
		public enum vehiculo {COCHE,BICICLETA,TREN,MOTO,BUS,CICLOMOTOR}
		
		public static void main(String[] args) {
			
			
		 for (vehiculo coche: vehiculo.values())
		System.out.println(coche);
		}
}