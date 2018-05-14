package boletin30;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    
    private int id;
    private String nome;
    private String apelidos;
    private int edad;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nome, String apelidos, int edad) {
        this.id = id;
        this.nome = nome;
        this.apelidos = apelidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Integrante Seleccion:\n"
                + " ID: " + id + " -- Nome: " + nome + " -- Apelidos: " + apelidos + " -- Edad:" + edad;
    }
}
