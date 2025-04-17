package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Metodos7 {
    public static void metodoDyE(){

        // Crear una lista de estudiantes 1
        List <Estudiante> estudiantes = new ArrayList<>();

        // Agregar 3 estudiantes a la lista de estudiantes 1
        estudiantes.add(new Estudiante("Juan", 20));
        estudiantes.add(new Estudiante("María", 22));
        estudiantes.add(new Estudiante("Carlos", 21));

        // Crear un copia de la lista estudiantes en una nueva lista de estudiantes2
        List<Estudiante> estudiantes2 = new ArrayList<>(estudiantes);

        // Imprimir las listas de estudiantes
        System.out.println("Lista de Estudiantes 1:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.toString());
        }

        System.out.println();

        // Imprimir las listas de estudiantes2
        System.out.println("Lista de Estudiantes 2:");
        for (Estudiante estudiante : estudiantes2) {
            System.out.println(estudiante.toString());
        }

        // Modifico datos de 1 solo estudiante de la lista estudiantes
        Estudiante estudiante = estudiantes.get(1);
        estudiante.setNombre("Juancito");
        estudiante.setEdad(23);

        System.out.println();

        // Imprimir las listas de estudiantes
        System.out.println("Lista de Estudiantes 1 modificada:");
        for (Estudiante est : estudiantes) {
            System.out.println(est.toString());
        }

        System.out.println();

        // Imprimir las listas de estudiantes2
        System.out.println("Lista de Estudiantes 2 sin modificar: ");
        for (Estudiante estu : estudiantes2) {
            System.out.println(estu.toString());
        }

        //--------- INSICO B Y C --------------------------------------------------

        // CONCLUSION :cuando se modifica el objeto en una lista se modifica tambien el objeto
        // de la lista copiada .

        // DIFERENTES FORMAS DE COPIAR UNA LISTA:
        //
        // 1.USAR EL CONSTRUCTOR DEL ARRAYLIST:
        // ArrayList<String> peliculas_copiadas1 = new ArrayList<String>(peliculas);
        //
        // Descripción:
        // Se crea una nueva instancia de ArrayList pasando la lista original
        // como argumento al constructor.
        // Copia superficial:
        // Este método realiza una copia superficial de la lista original.
        // Es decir, los elementos de la nueva lista son referencias a los mismos objetos
        // que se encuentran en la lista original. Si los elementos son objetos mutables
        // y se modifican, estos cambios afectarán a ambos ArrayList.
        // Ventaja:
        // Es un método directo y simple para crear una copia de la lista original.
        // Rendimiento:
        // Por lo general, es eficiente porque copia la estructura interna del ArrayList directamente
        //
        // 2.USAR METODO ADDALL:
        // ArrayList<String> peliculas_copiadas2 = new ArrayList<>();
        // peliculas_copiadas2.addAll(peliculas);
        //
        // Descripción:
        // Se crea una nueva instancia de ArrayList vacía y luego se agregan
        // todos los elementos de la lista original usando el método addAll.
        // Copia superficial:
        // Similar al uso del constructor, este método también realiza una copia
        // superficial de la lista. Los elementos referenciados en ambas listas son los mismos.
        // Ventaja:
        // Ofrece mayor flexibilidad, ya que permite agregar elementos a una lista existente que
        // podría haber sido previamente manipulada o creada de forma personalizada.
        // Rendimiento:
        // Es similar en rendimiento al constructor, pero puede ser ligeramente menos
        // eficiente debido a la operación adicional de agregar todos los elementos.
        //
        // 3.USAR METODO CLONE:
        // ArrayList<String> peliculas_clonadas = (ArrayList<String>) peliculas.clone();
        //
        // Descripción:
        // Clona el ArrayList original creando una nueva lista con la misma estructura y contenido.
        // Copia superficial:
        // Al igual que los métodos anteriores, clone() realiza una copia superficial.
        // Los elementos en la lista clonada son referencias a los mismos objetos que en
        // la lista original.
        // Ventaja:
        // Es un método rápido y conveniente para clonar una lista que ya implementa Cloneable.
        // Desventaja:
        // clone() es un método específico de la clase ArrayList, por lo que no es aplicable a
        // listas en general o a otras implementaciones de la interfaz List.
        // Rendimiento:
        // Este método suele ser muy rápido, pero su rendimiento puede depender de la
        // implementación específica de clone() en la clase ArrayList.

        // RESUMEN DE DIFERENCIAS:
        // Flexibilidad:
        // Constructor y addAll pueden ser utilizados con cualquier implementación de
        // la interfaz List, no solo con ArrayList.
        // clone solo está disponible para clases que implementan Cloneable, como ArrayList.
        // Rendimiento:
        // En términos generales, todas las opciones deberían tener un rendimiento
        // similar para la mayoría de los casos, aunque el constructor y clone pueden
        // ser ligeramente más rápidos debido a la menor cantidad de operaciones involucradas.
        // Uso de memoria:
        // En todas las opciones, se crea un nuevo ArrayList que tiene su propia copia
        // de la estructura interna (el array que almacena los elementos). Sin embargo,
        // dado que la copia es superficial, los elementos en ambas listas apuntan a
        // los mismos objetos en la memoria.
        // Aplicabilidad:
        // Constructor y addAll son métodos más versátiles porque funcionan con cualquier
        // lista que implemente la interfaz List, no solo con ArrayList.
        // clone es específico de ArrayList y otras clases que implementan Cloneable,
        // por lo que su uso está limitado a esas clases.

        //------- FIN INSICO B Y C --------------------------------------------------

        //------ INCISO E ------------------------------------------------------------
        System.out.println();

        //creacion de nuevo estudiante
        Estudiante nuevo = new Estudiante("Ana", 4);

        // Verificar si el estudiante ya está en la lista de estudiantes
        if (!estudiantes.contains(nuevo)) {
            estudiantes.add(nuevo);
        } else {
            System.out.println("El estudiante ya está en la lista: " + nuevo);
        }
        //------ FIN INCISO E ----------------------------------------------------------

    }

//------ INCISO F --------------------------------------------------
public static boolean esCapicua ( ArrayList <Integer> l){

    int inicio = 0;
    int fin = l.size() - 1;

    // Comparar elementos desde los extremos hacia el centro
    while (inicio < fin) {
        int elementoInicio = l.get(inicio);
        int elementoFin = l.get(fin);

        if (elementoInicio != elementoFin) {
            return false; // Si los elementos no coinciden, no es capicúa
        }

        inicio++;
        fin--;
    }

    return true; // Si no se encuentran discrepancias, es capicúa
}
//------ FIN INCISO F -----------------------------------------------


//------ INCISO G --------------------------------------------------
public static List<Integer> calcularSucesion (int n) {
        List<Integer> sucesion = new ArrayList<>(); //creo arraylist
        calcularSucesionRecursiva(n, sucesion); //mando n y arraylist
        return sucesion;
    }

private static void calcularSucesionRecursiva (int n, List<Integer> sucesion) {

    sucesion.add(n);  // Agrega el número actual a la lista

    if (n == 1) {
        return;  // Caso base: Si n es 1, terminamos la recursión
    }

    if (n % 2 == 0) {
        calcularSucesionRecursiva(n / 2, sucesion);  // Si n es par, dividimos por 2
    } else {
        calcularSucesionRecursiva(3 * n + 1, sucesion);  // Si n es impar, multiplicamos por 3 y sumamos 1
    }
}
//------ FIN INCISO  G ------------------------------------------


//------ INCISO H -----------------------------------------------
static void invertir (ArrayList<Integer> lis, int inicio, int fin) {
    // Caso base: si inicio es mayor o igual a fin, no hacemos nada
    if (inicio >= fin) {
        return;
    }

    // Intercambiamos los elementos en las posiciones inicio y fin
    int temp = lis.get(inicio);
    lis.set(inicio, lis.get(fin));
    lis.set(fin, temp);

    // Llamada recursiva para invertir los elementos restantes
    invertir(lis, inicio + 1, fin - 1);
}
//------ FIN INCISO H ------------------------------------------


//------- INCISO I ---------------------------------------------
   public static int sumarLinkedList(LinkedList<Integer> lista){

       // Caso base: si la lista está vacía, la suma es 0
       if (lista.isEmpty()) {
           return 0;
       }

       // elimina y devuelve el primer elemento de la lista.
       int firstElement = lista.removeFirst();

       // Suma el primer elemento al resultado de la suma del resto de la lista
       return firstElement + sumarLinkedList(lista);
       }
//------ FIN INCISO I -------------------------------------------

//--------- INCISO J -------------------------------------------
public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {

    ArrayList<Integer> listaCombinada = new ArrayList<>();
    int i = 0;
    int j = 0;

    // Recorrer ambas listas mientras haya elementos en ambas
    while (i < lista1.size() && j < lista2.size()) {

        if (lista1.get(i) < lista2.get(j)) {
            listaCombinada.add(lista1.get(i));
            i++;
        } else {
            listaCombinada.add(lista2.get(j));
            j++;
        }

    }

    // Agregar los elementos restantes de lista1 (si los hay)
    while (i < lista1.size()) {
        listaCombinada.add(lista1.get(i));
        i++;
    }

    // Agregar los elementos restantes de lista2 (si los hay)
    while (j < lista2.size()) {
        listaCombinada.add(lista2.get(j));
        j++;
    }

    return listaCombinada;
}
//------ FIN INCISO J -------------------------------------------
}

