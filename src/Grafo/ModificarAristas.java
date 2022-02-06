
package Grafo;
public class ModificarAristas extends EliminarAristas{

    public ModificarAristas() {
        super();
    }    
    
    public boolean nodificarArista(int origen1, int destino1, int origen2, int destino2, int costo) {
        if (eliminarArista(origen1, destino1) == true) {
            if (insertarArista(origen2, destino2, costo) == true) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
}
