
package Grafo;
public class InsertarAristas  extends InsertarVertices{

    public InsertarAristas() {
        super();
    }
    
    public boolean insertarArista(int origen, int destino, int dato) {
        if (origen < ordenGrafo() && destino < ordenGrafo() && destino >= 0) {
            if (matriz[origen][destino] == infinito && matriz[origen][destino] != 0) {
                matriz[origen][destino] = dato;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
}
