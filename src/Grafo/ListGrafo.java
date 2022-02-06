package Grafo;
import Objectos.Ciudad;
import java.util.ArrayList;

public class ListGrafo extends MostrarRutaMasCorta{    
    
    public ListGrafo(){
        super();
    }
    public ArrayList<String> mostrarRutas(){
        ArrayList<String> resultado = new ArrayList<>();
        for (int i = 0; i < ordenGrafo(); i++) {
            Ciudad ciudad = (Ciudad)(informacionDelVertice(i));
            resultado.add(ciudad.toString());
        }
        return resultado;
    }
    
}
