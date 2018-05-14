package boletin30;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {
    List <SeleccionFutbol> listaIntegrantes = new ArrayList();
    
    public List <SeleccionFutbol> crarArray(){
        SeleccionFutbol futbolista = new Futbolista(11,"central",1111,"Pedro","Lopez",22);
        SeleccionFutbol entrenador = new Entrenador(1500,2222,"Pepe","Perez",22);
        SeleccionFutbol masajista = new Masajista("Fisioterapeuta",4,3333,"Lola","Lopez",22);
        SeleccionFutbol seleccionador = new Seleccionador(4444,"Ramiro","Lopez",22);
        
        listaIntegrantes.add(futbolista);
        listaIntegrantes.add(masajista);
        listaIntegrantes.add(entrenador);
        listaIntegrantes.add(seleccionador);
        
        return listaIntegrantes;
    }
    
    public void mostrarIntegrantes(){
        List <SeleccionFutbol> integrantes =  crarArray();
        
        for(SeleccionFutbol el:integrantes){
            System.out.println( el.toString());
           
        }
    }
}
