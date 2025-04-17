package tp3.ejercicio4;

public class AreaEmpresa {
    private String id;
    private int demora;

    public AreaEmpresa(String id , int demora){
        this.id=id;
        this.demora=demora;
    }

    public int getDemora(){
        return this.demora;
    }
}
