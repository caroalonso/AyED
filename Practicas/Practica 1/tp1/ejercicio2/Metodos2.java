package tp1.ejercicio2;

public class Metodos2 {

// Método que devuelve un arreglo con los primeros n múltiplos de n
public static int[] generarMultiplos(int n) {
    int[] multiplos = new int[n];  //crea el vector de tamaño n vacio
    for (int i = 0; i < n; i++) {
        multiplos[i] = n * (i + 1); //guarda los primeros n múltiplos de n en el vector
    }
    return multiplos;
}
}
