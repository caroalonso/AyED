package tp1.ejercicio7;

public class RespuestaByC {
    // B.Si en lugar de usar un ArrayList en el inciso anterior hubiera usado un LinkedList ¿Qué
    // diferencia encuentra respecto de la implementación? Justifique

    // RESPUESTA B:

    // La diferencia principal entre usar un ArrayList y un LinkedList en la implementación
    // radica en cómo se almacenan y manejan los elementos internamente,
    // lo que afecta el rendimiento en ciertas operaciones.
    //
    // 1.ESTRUCTURA INTERNA:
    // ArrayList:
    // Implementado internamente como un arreglo dinámico.
    // Los elementos se almacenan en un bloque contiguo de memoria.
    // Acceso a elementos por índice es muy rápido (O(1)), ya que se puede calcular directamente
    // la dirección de memoria del elemento.
    // LinkedList:
    // Implementado como una lista doblemente enlazada.
    // Cada elemento (nodo) contiene un valor y referencias (punteros) al nodo anterior y al siguiente.
    // El acceso a elementos por índice es más lento (O(n)) porque se debe recorrer la lista desde el inicio o el final hasta llegar al elemento deseado.
    //
    // 2.INSERCION Y ELIMINACIONI:
    // ArrayList:
    // Añadir elementos al final de la lista es rápido (O(1)) a menos que el arreglo
    // interno necesite ser redimensionado, en cuyo caso es O(n).
    // Insertar o eliminar elementos en cualquier posición distinta del final es más
    // costoso (O(n)) debido a que es necesario desplazar elementos para mantener el arreglo contiguo.
    // LinkedList:
    // Insertar o eliminar elementos en cualquier posición es más eficiente (O(1)) si ya
    // se tiene la referencia al nodo, ya que solo se necesita ajustar los punteros de los nodos
    // adyacentes.
    // Sin embargo, encontrar la posición de inserción o eliminación es O(n), ya que la lista debe
    // recorrerse desde el inicio o el final.

    // 3.USO DE MEMORIA:
    // ArrayList:
    // Usa menos memoria por elemento, ya que solo almacena los datos y el tamaño del arreglo.
    // Sin embargo, puede desperdiciar memoria si el arreglo se redimensiona para crecer más de
    // lo necesario.
    // LinkedList:
    // Usa más memoria por elemento debido al almacenamiento de los punteros adicionales
    // (a los nodos anterior y siguiente).
    // No hay necesidad de redimensionar, por lo que la memoria se asigna de manera más directa
    // en relación con el número de elementos.

    // 4.APLICCIONES EN EL CONTEXTO DEL EJERCICIO:
    // ArrayList:
    // Si la operación principal es añadir elementos al final de la lista y acceder a
    // ellos por índice (como en el ejemplo donde se agregan números a la lista y luego se imprimen),
    // un ArrayList sería más eficiente en cuanto a tiempo de ejecución.
    // LinkedList:
    // Si se espera realizar muchas inserciones o eliminaciones en posiciones arbitrarias
    // (especialmente al principio o en el medio de la lista), un LinkedList podría ser más
    // eficiente, ya que estas operaciones no requieren el desplazamiento de elementos.
    //
    // 5.JUSTIFICACION:
    // La elección entre ArrayList y LinkedList depende de las operaciones predominantes
    // que se realicen sobre la lista.
    // Si se prioriza el acceso rápido por índice y se espera que la mayoría de las operaciones
    // sean añadidos al final, un ArrayList es preferible.
    // Por otro lado, si la lista va a experimentar muchas inserciones y eliminaciones en
    // diferentes posiciones, un LinkedList podría ofrecer un mejor rendimiento.
    //
    // En el ejercicio , como la operación principal es añadir elementos al final
    // y luego acceder a ellos para imprimirlos,un ArrayList sería generalmente más eficiente.
    // Sin embargo, si se requiere modificar o insertar elementos en el medio de la lista
    // con frecuencia, un LinkedList podría ser más adecuado.

    // C. ¿Existen otras alternativas para recorrer los elementos de la lista del punto 7a.?

    // RESPUESTA C:

    // Sí, existen varias alternativas para recorrer los elementos de una lista en Java,
    // tanto para ArrayList como para LinkedList.
    //
    // Algunas de las opciones más comunes:
    //-----------------------------------------------------------------
    // FOR CLASICO:
    // for (int i = 0; i < lista.size(); i++) {
    //    System.out.println(lista.get(i));
    // }
    //
    // Ventaja:
    // Permite acceso a los elementos por su índice, lo que es útil
    // si necesitas manipular elementos en función de su posición.
    // Desventaja:
    // En una LinkedList, el acceso por índice es menos
    // eficiente porque requiere recorrer la lista desde el inicio para cada acceso.
    //
    //-----------------------------------------------------------------
    // FOREACH:
    // for (Integer numero : lista) {
    //    System.out.println(numero);
    // }
    //
    // Ventaja:
    // Es más legible y no requiere preocuparse por los índices.
    // Funciona bien tanto con ArrayList como con LinkedList.
    // Desventaja:
    // No tienes acceso directo al índice del elemento actual.
    //
    //-----------------------------------------------------------------
    // ITERATOR:
    // Iterator<Integer> it = lista.iterator();
    // while (it.hasNext()) {
    //    System.out.println(it.next());
    // }
    //
    // Ventaja:
    // Proporciona una forma segura de recorrer la lista, especialmente
    // útil si necesitas eliminar elementos durante la iteración.
    // Desventaja:
    // Es más verboso que el bucle for-each y no tiene acceso directo a los índices.
    //
    //-----------------------------------------------------------------
    // LISTITERADOR:
    // ListIterator<Integer> listIt = lista.listIterator();
    // while (listIt.hasNext()) {
    //    System.out.println(listIt.next());
    // }
    //
    // Ventaja:
    // Permite recorrer la lista en ambas direcciones (hacia adelante y hacia atrás).
    // También permite modificar elementos durante la iteración.
    // Desventaja:
    // Es más complejo que un simple Iterator y generalmente se usa cuando necesitas
    // iterar en ambas direcciones o modificar la lista durante la iteración.
    //
    //-----------------------------------------------------------------
    // FOREACH (JAVA 8+):
    // lista.forEach(numero -> System.out.println(numero));
    //
    // Ventaja:
    // Es conciso y utiliza expresiones lambda, lo que puede hacer que el
    // código sea más limpio y fácil de leer.
    // Desventaja:
    // No tiene acceso directo a los índices y puede ser menos familiar para quienes
    // no están acostumbrados a la sintaxis lambda.
    //
    //-----------------------------------------------------------------
    // STREAMS (JAVA 8+):
    // lista.stream().forEach(System.out::println);
    //
    // Ventaja:
    // Ideal para trabajar con operaciones funcionales y permite realizar
    // operaciones más complejas como filtrado, mapeo, y reducción durante la iteración.
    // Desventaja:
    // Puede ser un poco más complicado para operaciones simples,
    // y no tiene acceso a los índices.
    //
    //-----------------------------------------------------------------
    // PARALLELSTREAM (JAVA 8+):
    // lista.parallelStream().forEach(System.out::println);
    //
    // Ventaja:
    // Permite recorrer la lista en paralelo, lo que puede ser más rápido en
    // listas muy grandes en sistemas con múltiples núcleos.
    // Desventaja:
    // La salida puede no estar en el mismo orden que los elementos en la lista,
    // lo que podría no ser deseable en todos los casos.
    //----------------------------------------------------------------
}
