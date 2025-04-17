package tp1.ejercicio5;

public class Main5 {
    public static void main(String[] args) {

        int[] vector = {3, 4, 5, 8, 0};

        ///1
        Dato D1 = Calcular.incisoA(vector);
        System.out.println(D1.getMax());
        System.out.println(D1.getMin());
        System.out.println(D1.getProm());
        System.out.println();

        ////2
        Dato D2= new Dato();
        Calcular.incisoB(vector,D2);
        System.out.println(D2.getMax());
        System.out.println(D2.getMin());
        System.out.println(D2.getProm());
        System.out.println();

        ////3
        Calcular.incisoC(vector);  ///sin parametros??? *
        System.out.println(Calcular.getDato().getMax());
        System.out.println(Calcular.getDato().getMin());
        System.out.println(Calcular.getDato().getProm());


        // * solucion en la calse Calculadora declarar una variable tipo vector:
        //private static int[] vector;

        // en clase Calculadora crear metodo :

        // public static void setVector(int[] vec) {
        //  vector = vec;
        //}

        // entes de llamar incisoC desde el Main llamar Calculadora.setvector(vector);
        // dentro de metodo insicoC :

        //    public static void incisoC() {
        //        if (vector == null) {
        //            throw new IllegalStateException("Vector no ha sido inicializado");
        //        }
        //
        //        if (d3 == null) {
        //            d3 = new Dato(); // Inicializa d3 si es necesario
        //        }
        //
        //        Dato tempData = calcularValores(vector);
        //
        //        d3.setMax(tempData.getMax());
        //        d3.setMin(tempData.getMin());
        //        d3.setProm(tempData.getProm());
        //    }


    }
}
