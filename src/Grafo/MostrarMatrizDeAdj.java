package Grafo;
import Objectos.Ciudad;
import java.util.ArrayList;
public class MostrarMatrizDeAdj extends ModificarAristas{
    public MostrarMatrizDeAdj() {
        super();
    }
    
    public ArrayList<String> mostrar() {
        ArrayList datos = new ArrayList<>();
        for (int i = 0; i < ordenGrafo(); i++) {
            ArrayList<String> dat = new ArrayList<>();
            for (int j = 0; j < ordenGrafo(); j++) {                
                if (matriz[i][j]==infinito && matriz[i][j]==0) {
                    dat.add("0");
                }else{
                    if (matriz[i][j]==infinito) {
                        dat.add("-");
                    }else{
                        dat.add(String.valueOf(matriz[i][j]));
                    }
                }
            }
            datos.add(dat);
        }
        return datos;
    }
    
    public Ciudad informacionDelVertice(int posicion) {
        return vertices.get(posicion);
    }
    
    public ArrayList<String> mostrarVerticesAdyacentes(int origen){
        ArrayList<String> resultado = new ArrayList<>();
        for (int i = 0; i < ordenGrafo(); i++) {
            if (matriz[origen][i]!=0 && matriz[origen][i]!= infinito) {
                resultado.add((String) informacionDelVertice(origen).getNombreCiudad());
                resultado.add(informacionDelVertice(i).getNombreCiudad());
                resultado.add(String.valueOf(matriz[origen][i]));
            }
        }
        return resultado;
    }
    
}
