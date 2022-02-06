package Objectos;

public class Nodo implements Comparable<Nodo> {
    Ciudad ciudad;
    int  distancia   = Integer.MAX_VALUE;
    Nodo procedencia = null;
    
    Nodo(Ciudad ciudad, int distancia, Nodo procedencia) {
        this.ciudad=ciudad; 
        this.distancia=distancia; 
        this.procedencia=procedencia; 
    }
    
    Nodo(Ciudad ciudad) {
        this(ciudad, 0, null); 
    }
    
    public int compareTo(Nodo ruta) {
        return this.distancia-ruta.distancia; 
    }
    
    public boolean equals(Object o) {
        Nodo tmp = (Nodo) o;
        if(tmp.ciudad==this.ciudad) return true;
        return false;
    }
}
