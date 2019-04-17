package Paquete;

public class Moto extends Vehiculo{
	String cilindrada;
	
		public Moto(String marca, String modelo, String cilindrada, double precio) {
			super(marca, modelo, precio);
			this.cilindrada = cilindrada;
		}
}
