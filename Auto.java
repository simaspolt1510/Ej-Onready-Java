package Paquete;

public class Auto extends Vehiculo {
	int puertas;
	
		public Auto(String marca, String modelo, int puertas, double precio) {
			super(marca, modelo, precio);
			this.puertas = puertas;
		}
	
}
