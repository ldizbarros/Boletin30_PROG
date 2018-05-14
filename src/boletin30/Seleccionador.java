package boletin30;

public class Seleccionador extends SeleccionFutbol{

    public Seleccionador() {
    }

    public Seleccionador(int id, String nome, String apelidos, int edad) {
        super(id, nome, apelidos, edad);
    }
    
    public void seleccionarXogador(){
        System.out.println("O seleccionador seleciona un xogador");
    }

    @Override
    public void concentrarse() {
        System.out.println("O Seleccionador esta concentrandose");
    }

    @Override
    public void viajar() {
        System.out.println("O Seleccionador esta viaxando");
    }

    @Override
    public void entrenar() {
        System.out.println("O Seleccionador esta entrenando");
    }

    @Override
    public void jugarPartido() {
       System.out.println("O Seleccionador juega el partido");
    }
}
