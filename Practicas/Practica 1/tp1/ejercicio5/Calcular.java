package tp1.ejercicio5;

public class Calcular {
private static Dato d3; //variable estatica de tipo dato

public static Dato calcularValores (int [] vec) {

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int sum = 0;

    for (int valor : vec) {
        if (valor < min) {
            min = valor;
        }
        if (valor > max) {
            max = valor;
        }
        sum += valor;
    }

    double prom = sum/vec.length;

    Dato D = new Dato();
    D.setMax(max);
    D.setMin(min);
    D.setProm(prom);

    return D;
}


//INCISO A
public static Dato incisoA (int [] vec) {

    return calcularValores(vec);
}


//INCISO B
public static void incisoB (int [] vec, Dato D2) {

    Dato tempData = calcularValores(vec);

    D2.setMax(tempData.getMax());
    D2.setMin(tempData.getMin());
    D2.setProm(tempData.getProm());
    //no hace falta return se modifica el objeto por referencia.
}

//INCISO C
public static void incisoC(int[] vec) {

    if (d3 == null) {   // Inicializa d3 si es necesario
        d3 = new Dato();
    }

    Dato tempData = calcularValores(vec);

    d3.setMax(tempData.getMax());
    d3.setMin(tempData.getMin());
    d3.setProm(tempData.getProm());
}

public static Dato getDato() {
    return d3;
}


}


