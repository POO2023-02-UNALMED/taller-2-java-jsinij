package test;
import java.util.Arrays;

public class Asiento {
	 String color;
	 int precio;
	 String registro;

	 public Asiento(String color, int precio, String registro) {
	        this.color = color;
	        this.precio = precio;
	        this.registro = registro;
	        }

	 public void cambiarColor(String color) {
	        String[] coloresPermitidos = {"negro", "amarillo", "verde", "rojo", "blanco"};
	        if (Arrays.asList(coloresPermitidos).contains(color.toLowerCase())) {
	            this.color = color;
	        }
	    }
}
