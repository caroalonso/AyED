package tp1.ejercicio4;

public class Metodos4 {
    public static void uno (int x, int y) {
        System.out.println("ANTES:");
        System.out.println("valor de a (int): " + x +"\n"+ "valor de b (int): " + y);
        if (x < y) {
            int tmp = x ;
            x = y ;
            y = tmp;
        }
    }
    public static void dos (Integer x, Integer y) {
        System.out.println("valor de c (integer): " + x +"\n"+ "valor de d (integer): " + y);
        if (x < y) {
            int tmp = x ;
            x = y ;
            y = tmp;
        }
    }
}
