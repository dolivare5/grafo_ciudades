package Grafo;

import Objectos.Ciudad;
import java.util.ArrayList;

/**
 *
 * @author deive
 */
public class MostrarVertices extends MostrarMatrizDeAdj{

    public MostrarVertices() {
    }
    public ArrayList<String> mostrarInfoVertices(){
        ArrayList<String> resultado = new ArrayList<>();
        for (int i = 0; i < ordenGrafo(); i++) {
            Ciudad ciudad = (Ciudad)(informacionDelVertice(i));
            resultado.add(ciudad.toString());
        }
        return resultado;
    }
    public ArrayList<Ciudad> mostrarVertices(){
        ArrayList<Ciudad> resultado = new ArrayList<>();
        for (int i = 0; i < ordenGrafo(); i++) {
            Ciudad ciudad = (Ciudad)(informacionDelVertice(i));
            resultado.add(ciudad);
        }
        return resultado;
    }
    
    
    
    
}
