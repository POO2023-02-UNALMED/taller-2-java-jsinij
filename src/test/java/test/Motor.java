package test;
import java.util.Arrays;

public class Motor {
	    int numeroCilindros;
	    String tipo;
	    String registro;

	    Motor(int numeroCilindros, String tipo, String registro) {
	        this.numeroCilindros = numeroCilindros;
	        this.tipo = tipo;
	        this.registro = registro;
	    }

	    void cambiarRegistro(String nuRegistro) {
	        this.registro = nuRegistro;
	    }

	    void asignarTipo(String nuTipo) {
	        String[] tiposPermitidos = {"electrico", "gasolina"};
	        if (Arrays.asList(tiposPermitidos).contains(nuTipo.toLowerCase())) {
	            this.tipo = nuTipo;
	        }
	    }
	}

