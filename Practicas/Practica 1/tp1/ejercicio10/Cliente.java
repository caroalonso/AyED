package tp1.ejercicio10;

public class Cliente {
    private String nombre;
    private boolean esEmbarazada;
    private boolean tieneMovilidadReducida;
    private int edad;

    public Cliente(String nombre, boolean esEmbarazada, boolean tieneMovilidadReducida, int edad) {
        this.nombre = nombre;
        this.esEmbarazada = esEmbarazada;
        this.tieneMovilidadReducida = tieneMovilidadReducida;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esPrioritario() {
        return esEmbarazada || tieneMovilidadReducida || edad >= 70;
    }
}


