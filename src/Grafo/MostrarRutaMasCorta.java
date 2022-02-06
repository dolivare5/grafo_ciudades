package Grafo;

import Objectos.Ciudad;
import java.util.*;

public class MostrarRutaMasCorta extends MostrarVertices {
    List<Nodo>  nodosRecorridos=null; 
    
   private int posicionNodo(Ciudad nodo) {
        for(int i=0; i<vertices.size(); i++) {
            if(vertices.get(i)==nodo){
                return i;
            }
        }
        return -1;
    }
    public String encontrarRutaMinimaDijkstra(Ciudad inicio, Ciudad fin) {
        // calcula la ruta mas corta del inicio a las demas ciudades
        encontrarRutaMinimaDijkstra(inicio);
        // recupera el nodo final de la lista de terminados
        Nodo vertice = new Nodo(fin);
        if(!nodosRecorridos.contains(vertice)) {
            System.out.println("Error, nodo no alcanzable");
            return "Bye";
        }
        vertice = nodosRecorridos.get(nodosRecorridos.indexOf(vertice));
        int distancia = vertice.distancia;  
        // crea una pila para almacenar la ruta desde el nodo final al origen
        Stack<Nodo> pila = new Stack<Nodo>();
        while(vertice != null) {
            pila.add(vertice);
            vertice = vertice.procedencia;
        }
        String ruta = "";
        // recorre la pila para armar la ruta en el orden correcto
        while(!pila.isEmpty()){
            ruta+=(pila.pop().ciudad.getNombreCiudad() + " ");
        }
        return distancia + "KM Recorridos | La Mejor Ruta es: " + ruta;
    }
    // encuentra la ruta mas corta desde el nodo inicial a todos los demas
    public void encontrarRutaMinimaDijkstra(Ciudad inicio) {
        Queue<Nodo>   cola = new PriorityQueue<Nodo>(); // cola de prioridad
        Nodo nodoInicial = new Nodo(inicio);          // nodo inicial
        nodosRecorridos = new LinkedList<Nodo>();// lista de nodos ya revisados
        cola.add(nodoInicial);                   // Agregar nodo inicial a la cola de prioridad
        while(!cola.isEmpty()) {        // mientras que la cola no esta vacia
            Nodo tmp = cola.poll();     // saca el primer elemento
            nodosRecorridos.add(tmp);            // lo manda a la lista de terminados
            int i = posicionNodo(tmp.ciudad);   
            for(int j=0; j<matriz[i].length; j++) {  // revisa los nodos hijos del nodo tmp
                if(matriz[i][j]==0) continue;        // si no hay conexion no lo evalua
                if(estaTerminado(j)) continue;      // si ya fue agregado a la lista de terminados
                Nodo nod = new Nodo(vertices.get(j),tmp.distancia+matriz[i][j],tmp);
                // si no esta en la cola de prioridad, lo agrega
                if(!cola.contains(nod)) {
                    cola.add(nod);
                    continue;
                }
                // si ya esta� en la cola de prioridad actualiza la distancia menor
                for(Nodo x: cola) {
                    // si la distancia en la cola es mayor que la distancia calculada
                    if(x.ciudad==nod.ciudad && x.distancia > nod.distancia) {
                        cola.remove(x); // remueve el nodo de la cola
                        cola.add(nod);  // agrega el nodo con la nueva distancia
                        break;          // no sigue revisando
                    }
                }
            }
        }
    }
    // verifica si un nodo ya esta en lista de terminados
    public boolean estaTerminado(int j) {
        Nodo vertice = new Nodo(vertices.get(j));
        return nodosRecorridos.contains(vertice);
    }
 
}
