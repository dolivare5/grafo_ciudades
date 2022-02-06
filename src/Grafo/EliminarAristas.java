
package Grafo;

public class EliminarAristas extends InsertarAristas{

    public EliminarAristas() {
    }    

    public boolean eliminarArista(int origen, int destino) {
        if (origen < ordenGrafo() && origen >= 0 && destino < ordenGrafo() && destino >= 0) {
            matriz[origen][destino] = infinito;
            return true;
        } else {
            return false;
        }
    }
}
