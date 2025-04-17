package tp2.ejercicio9;

public class Contenedor {
    private int suma;
    private int diferencia;

    public Contenedor() {
        this.suma = 0;
        this.diferencia = 0;
    }

    public void setSuma(int suma) {
        this.suma=suma;
    }

    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }

    public int getSuma() {
        return this.suma;
    }

    public int getDiferencia() {
        return this.diferencia;
    }
}
