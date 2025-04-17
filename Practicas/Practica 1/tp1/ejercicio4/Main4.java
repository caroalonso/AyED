package tp1.ejercicio4;

import static tp1.ejercicio4.Metodos4.uno;
import static tp1.ejercicio4.Metodos4.dos;

public class Main4 {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        Integer c = 3;
        Integer d = 4;

        uno(a,b); // 1,2
        dos(c,d); // 3,4

        System.out.println();
        System.out.println("DESPUES:");
        System.out.println("valor de a (int): " + a +"\n"+"valor de b (int): " + b) ;
        System.out.println("valor de c (integer): " + c +"\n"+"valor de d (integer) : " + d) ;
    }
}


// Inserte un breakpoint en las líneas donde se indica:  y=tmp
// ejecute en modo debug.

// ¿los valores que adoptan las variables x, y coinciden con los valores impresos por
// consola? No.

// RESPUESTA:
// Método uno (int x, int y)
// Tipo de Parámetros: int (primitivo)
// Comportamiento:
// Los parámetros x y ,se pasan por valor.
// Cualquier modificación de x y dentro del método afecta solo a las copias locales,
// no a las variables originales a y b.
// Por lo tanto, después de la llamada a uno(a, b),
// los valores de a y b en main seguirán siendo 1 y 2 respectivamente.

// Método dos (Integer x, Integer y)
// Tipo de Parámetros: Integer (Objeto)
// Comportamiento:
// Aunque Integer es una clase envolvente para el tipo primitivo int, sigue siendo inmutable, lo que significa
// que cualquier cambio en x y dentro del método no afectará los valores originales de c y d fuera del método.
// Similar al caso anterior, después de la llamada a dos(c, d),
// los valores de c y d en main seguirán siendo 3 y 4 respectivamente.

// DEPURACION Y BREAKPOINTS:
// Cuando insertas un breakpoint en las líneas y = tmp; dentro de ambos métodos (uno y dos)
// y ejecutas el programa en modo debug, verás lo siguiente:
//
// En el método uno(int x, int y):
// x y contendrán los valores que fueron pasados como argumentos (x = 1, y = 2).
// Después del intercambio (si ocurre), los valores de x y dentro del método habrán cambiado,
// pero estos cambios no se reflejarán en las variables a y b en main.
//
// En el método dos(Integer x, Integer y):
// x y contendrán referencias a objetos Integer con los valores 3 y 4.
// Si el intercambio ocurre, las referencias locales x y apuntarán a nuevos objetos Integer,
// pero las variables originales c y d en main permanecerán inmutables.
//
// CONCLUSION:
// Los valores de x y y dentro de los métodos uno y dos coincidirán
// con lo que esperas en el debug (cambian dentro del método si el intercambio ocurre),
// pero estos cambios no se reflejarán en los valores impresos por consola,
// que mostrarán los valores originales de a, b, c, y d debido al paso por valor en Java.
//
// RESUMEN:
// En Java, los tipos primitivos y los objetos inmutables como Integer se pasan por valor.
// Los cambios dentro de los métodos uno y dos no afectan las variables originales.
// Al ejecutar el código en modo debug, verás que x y cambian dentro del método,
// pero estos cambios no se reflejan en los valores originales impresos por consola.

