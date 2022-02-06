package Objectos;

import java.util.*;

public class Grafo {
    List<Ciudad> nodos = new LinkedList<>();
    int[][] matriz;  // Matriz de distancias entre nodos
    String  rutaMasCorta;
    List<Nodo>  listos=null;   
    int infinito = 9999;
    public Grafo() {
        
    }

    public void insertarVertice(Ciudad nuevoVertice) {
        nodos.add(nuevoVertice);
        matriz = new int [nodos.size()][nodos.size()];
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
 
    public boolean insertarArista(int origen, int destino, int dato) {
        if (origen < nodos.size() && destino < nodos.size() && destino >= 0) {
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
    
    private int posicionNodo(Ciudad nodo) {
        for(int i=0; i<nodos.size(); i++) {
            if(nodos.get(i)==nodo){
                return i;
            }
        }
        return -1;
    }
    
    public String encontrarRutaMinimaDijkstra(Ciudad inicio, Ciudad fin) {
        // calcula la ruta mas corta del inicio a las demas ciudades
        encontrarRutaMinimaDijkstra(inicio);
        // recupera el nodo final de la lista de terminados
        Nodo tmp = new Nodo(fin);
        if(!listos.contains(tmp)) {
            System.out.println("Error, nodo no alcanzable");
            return "Bye";
        }
        tmp = listos.get(listos.indexOf(tmp));
        int distancia = tmp.distancia;  
        // crea una pila para almacenar la ruta desde el nodo final al origen
        Stack<Nodo> pila = new Stack<Nodo>();
        while(tmp != null) {
            pila.add(tmp);
            tmp = tmp.procedencia;
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
        Nodo            ni = new Nodo(inicio);          // nodo inicial
         
        listos = new LinkedList<Nodo>();// lista de nodos ya revisados
        cola.add(ni);                   // Agregar nodo inicial a la cola de prioridad
        while(!cola.isEmpty()) {        // mientras que la cola no esta vacia
            Nodo tmp = cola.poll();     // saca el primer elemento
            listos.add(tmp);            // lo manda a la lista de terminados
            int p = posicionNodo(tmp.ciudad);   
            for(int j=0; j<matriz[p].length; j++) {  // revisa los nodos hijos del nodo tmp
                if(matriz[p][j]==0) continue;        // si no hay conexion no lo evalua
                if(estaTerminado(j)) continue;      // si ya fue agregado a la lista de terminados
                Nodo nod = new Nodo(nodos.get(j),tmp.distancia+matriz[p][j],tmp);
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
        Nodo tmp = new Nodo(nodos.get(j));
        return listos.contains(tmp);
    }
 
   
 
   
    
    public static void main(String[] args) {
        
        Grafo g = new Grafo();
        Ciudad a = new Ciudad(1234, "Barranquilla", 2345, 2345);
        Ciudad b = new Ciudad(1234, "Cartagena", 2345, 2345);
        Ciudad c = new Ciudad(1234, "Bogota", 2345, 2345);
        Ciudad d = new Ciudad(1234, "Santa Marta", 2345, 2345);
        Ciudad e = new Ciudad(1234, "Bucaramanga", 2345, 2345);
        Ciudad f = new Ciudad(1234, "Valledupar", 2345, 2345);
        g.insertarVertice(a);
        g.insertarVertice(b);
        g.insertarVertice(c);
        g.insertarVertice(d);
        g.insertarVertice(e);
        g.insertarVertice(f);
        g.insertarArista(0,1, 3);
        g.insertarArista(0,4, 6);
        g.insertarArista(0,5,10);
        g.insertarArista(1,2, 5);
        g.insertarArista(1,4, 2);
        g.insertarArista(2,3, 8);
        g.insertarArista(2,4, 9);
        g.insertarArista(2,5, 7);
        g.insertarArista(3,5, 4);
        g.insertarArista(4, 5, 4);
        String respuesta = g.encontrarRutaMinimaDijkstra(a, f);
        System.out.println(respuesta);
    }

}
