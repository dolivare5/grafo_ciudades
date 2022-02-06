package Grafo;
import Objectos.Ciudad;
import java.util.LinkedList;
import java.util.List;
public class InsertarVertices {

    protected int matriz[][] = new int[100][100];
    protected List<Ciudad> vertices = new LinkedList<>();
    int infinito = 99999;

    public InsertarVertices() {
    }

    public void insertarVertice(Ciudad nuevoVertice) {
        vertices.add(nuevoVertice);
        matriz = new int [vertices.size()][vertices.size()];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i != j) {
                    matriz[i][j] = infinito;
                }
                if (i==j) {
                    matriz[i][j]=0;
                }
            }
        }
    }
    
    public int ordenGrafo() {
        return vertices.size();
    }
}
