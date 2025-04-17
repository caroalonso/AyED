package tp1.ejercicio3;

public class Test {
    public static void main(String[] args) {


        //agrego 2 estudiantes al vector
        Estudiante [] estudiantes = {
            (new Estudiante("Juan","Perez","comision 1","juan@gmail.com","123")),
            (new Estudiante("Carlos","Alvarez","comision 2","carlos@gmail.com","456"))
        };

        //agrego 3 profesores al vector
        Profesor [] profesores = {
            (new Profesor("Pedro","Gomez","pedro@gmail.com","catedra 1","Informatica")),
            (new Profesor("Maria","Martinez","maria@gmail.com","catedra 2","Informatica")),
            (new Profesor("Lucia","Lopez","lucia@gmail.com","catedra 1","Informatica"))
        };

        System.out.println("Estudiantes:");
        for (Estudiante es : estudiantes) {
            System.out.print( es.tusDatos() + "\n");
        }

        System.out.println();

        System.out.println("Profesores:");
        for (Profesor pr : profesores) {
            System.out.print( pr.tusDatos() + "\n");
        }

    }
}
