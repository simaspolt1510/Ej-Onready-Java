package Paquete;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		//Dar formato precio ARS a los precios de las instancias:
		
		Locale locale = new Locale("es","AR");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		
		//Crear instancias
		Vehiculo vehiculos[] = {new Auto("Peugeot", "206", 4, 200000),new Moto("Honda", "Titan", "125c", 60000),new Auto("Peugeot", "208", 5, 250000),new Moto("Yamaha", "YBR", "160c", 80500.5)};
		
		//Impresi�n de instancias seg�n si es un auto o una moto:
	    for( Vehiculo v : vehiculos) {
	      if(v instanceof Auto) {
	    	 Auto va = (Auto)v;
			System.out.println("Marca: " + va.marca + " // " + "Modelo: " + va.modelo + " // " + "Puertas: " + va.puertas + " // " + "Precio: " + nf.format(va.precio)); 
			} else {
				Moto vm = (Moto)v;	
				System.out.println("Marca: " + vm.marca + " // " + "Modelo: " + vm.modelo + " // " + "Cilindrada: " + vm.cilindrada + " // " + "Precio: " + nf.format(vm.precio));
				}
	    }
		
	    System.out.println("==============================");
	    
	    //Ordenar el array "vehiculos" para obtener distintos datos solicitados a lo largo del ejercicio:
	    
	    Arrays.sort(vehiculos, new Comparator<Vehiculo>() {
	        @Override
	        public int compare(Vehiculo v1, Vehiculo v2) {
	            if ( v2.precio < v1.precio ) return -1;
	            else if ( v2.precio == v1.precio ) return 0;
	            else return 1;
	        }
	    });
	    
	    //Imprimir veh�culo m�s caro y m�s barato:
	    
	    System.out.println("Veh�culo m�s caro: " + vehiculos[0].marca + " " + vehiculos[0].modelo);
	    System.out.println("Veh�culo m�s barato: " + vehiculos[vehiculos.length-1].marca + " " + vehiculos[vehiculos.length-1].modelo);
	    	    
	    //Buscar veh�culo que en su modelo contenga la letra "Y" e imprimirlo:
	    
	    for(Vehiculo v : vehiculos) {
	        if(v.modelo.contains("Y")){
	          System.out.println("Veh�culo que contiene en el modelo la letra 'Y': "+ v.marca + " " + v.modelo + " " + nf.format(v.precio));
	        } else if(v.modelo.contains("y")) {
	        	System.out.println("Veh�culo que contiene en el modelo la letra 'Y': "+ v.marca + " " + v.modelo + " " + nf.format(v.precio));
	        }
	        
	      }
	    
	    System.out.println("==============================");
	    
	    //Ordenar vehiculos por precio de mayor a menor:	   
	    System.out.println("Veh�culos ordenados por precio de mayor a menor: ");
	    
	    for(Vehiculo v : vehiculos) {      
	        System.out.println(v.marca + " " + v.modelo);
	    }
	    	   
	}

}