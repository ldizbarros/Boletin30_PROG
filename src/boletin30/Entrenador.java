package boletin30;

public class Entrenador extends SeleccionFutbol{
    
    private int idFederacion;

    public Entrenador(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(int idFederacion, int id, String nome, String apelidos, int edad) {
        super(id, nome, apelidos, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Entrenador --> idFederacion: " + idFederacion;
    }

    public void planificarEntrenamiento(){
        System.out.println("O entrenador planfica o entrenamento");
    }

    @Override
    public void concentrarse() {
        System.out.println("O entrenador esta concentrandose");
    }

    @Override
    public void viajar() {
        System.out.println("O entrenador esta viaxando");
    }

    @Override
    public void entrenar() {
        System.out.println("O entrenador esta entrenando");
    }

    @Override
    public void jugarPartido() {
       System.out.println("O entrenador juega el partido");
    }
    
}
