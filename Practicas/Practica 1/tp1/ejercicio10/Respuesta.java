package tp1.ejercicio10;

public class Respuesta {

    // SOLUCION :
    // Uso de dos colas para manejar los diferentes niveles de prioridad:

    // Cola de alta prioridad: Para personas con prioridad (mujeres embarazadas, personas con movilidad reducida, y mayores de 70 años).
    // Cola de baja prioridad: Para las demás personas.

    // EXPLICACION:

    // Clase Cliente:
    // Define un cliente y sus atributos.

    // Clase Banco:
    // Usa dos colas (colaPrioritaria y colaGeneral) para manejar la prioridad.
    // agregarCliente coloca al cliente en la cola correspondiente según si es prioritario o no.
    // atenderCliente primero atiende a los clientes de la cola prioritaria,
    // y luego a los de la cola general si hay clientes en espera.

    // Clase Main:
    // Prueba la funcionalidad del banco agregando y atendiendo a clientes.

    // Este enfoque asegura que las personas con prioridad sean atendidas
    // antes que las demás, aunque no utilices una cola de prioridad real.
}
