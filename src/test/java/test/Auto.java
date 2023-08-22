package test;

public class Auto {
	static int cantidadCreados = 0;
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    String registro;

    Auto(String modelo, int precio, Asiento[] asientos, String marca, Motor motor, String registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
        cantidadCreados++;
    }

    int cantidadAsientos() {
        int count = 0;
        for (Asiento asientoObj : asientos) {
            if (asientoObj instanceof Asiento) {
                count++;
            }
        }
        return count;
    }

    String verificarIntegridad() {
        if (this.motor.registro.equals(this.registro)) {
            for (Asiento asientoObj : asientos) {
                if (asientoObj instanceof Asiento && !asientoObj.registro.equals(this.registro)) {
                    return "Las piezas no son originales";
                }
            }
            return "Auto original";
        } else {
            return "Las piezas no son originales";
        }
    }
}

