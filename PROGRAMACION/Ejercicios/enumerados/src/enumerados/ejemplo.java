package enumerados;

public class ejemplo {


		public enum semaforo {ROJO,AMARILLO,VERDE};
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			semaforo s = semaforo.ROJO;
			 System.out.println(s);
			 
			 for (semaforo s2: semaforo.values())
			System.out.println(s2);
			}
}
