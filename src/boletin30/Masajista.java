package boletin30;

public class Masajista extends SeleccionFutbol{

    private String titulacion;
    private int anosExperiencia;

    public Masajista(String titulacion, int anosExperiencia) {
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public Masajista(String titulacion, int anosExperiencia, int id, String nome, String apelidos, int edad) {
        super(id, nome, apelidos, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Masajista --> Titulacion: " + titulacion + " - Anos de Experiencia: " + anosExperiencia;
    }
    
    public void darMasaje(){
        System.out.println("O masajista da masaje");
    }
    
    @Override
    public void concentrarse() {
        System.out.println("O masajista esta concentrandose");
    }

    @Override
    public void viajar() {
        System.out.println("O masajista esta viaxando");
    }

    @Override
    public void entrenar() {
        System.out.println("O masajista esta entrenando");
    }

    @Override
    public void jugarPartido() {
       System.out.println("O masajista juega el partido");
    }
}
