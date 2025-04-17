package tp1.ejercicio11;

public class Respuesta {


    //1.Lista Enlazada (LinkedList)
    //Descripción:
    //Una lista enlazada permite almacenar elementos en una secuencia
    // en la que cada elemento apunta al siguiente. Esta estructura es útil si necesitas
    // insertar o eliminar paradas en cualquier punto de la lista con frecuencia,
    // ya que estas operaciones son eficientes en una lista enlazada.
    //Ventajas:
    //Inserción y eliminación eficiente.
    //Puede manejar una cantidad variable de paradas sin necesidad de redimensionar
    // como en las listas basadas en arrays.

    //2.ArrayList
    //Descripción:
    // Un ArrayList es una implementación de lista basada en arrays.
    // Es eficiente para acceder a elementos por índice y agregar elementos al final
    // de la lista, pero las inserciones y eliminaciones en el medio pueden ser costosas,
    // ya que requieren el desplazamiento de elementos.
    //Ventajas:
    //Acceso rápido a elementos por índice.
    //Ideal para cuando el tamaño de la lista no cambia con frecuencia.

    //3. Mapa (HashMap)
    //Descripción:
    // Si necesitas asociar información adicional con cada parada
    // (como horarios específicos o datos de ubicación),
    // un HashMap podría ser útil. Aunque no es la mejor opción para almacenar
    // una simple lista de paradas, puede ser útil si necesitas mapear cada
    // parada a un conjunto de datos.
    //Ventajas:
    //Acceso rápido a datos asociados a cada parada.
    //Ideal para búsquedas rápidas y asociaciones clave-valor.

    //ELECCION DE ESTRUCTURA DE DATOS:

    // Lista Enlazada:
    // es ideal si necesitas una estructura flexible para cambios
    // frecuentes en la lista de paradas.

    // ArrayList:
    // es adecuado si la lista de paradas cambia poco y necesitas
    // acceso rápido a elementos por índice.

    // HashMap:
    // es útil si necesitas asociar datos adicionales a cada parada.
    //Para la mayoría de las aplicaciones simples relacionadas
    // con paradas de colectivos, una lista enlazada o un ArrayList serán suficientes.
}
