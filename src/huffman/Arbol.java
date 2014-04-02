package huffman;

public class Arbol extends Nodo {

    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public Arbol(Nodo nodo1, Nodo nodo2) {
        raiz = super.agregarNodo(nodo1, nodo2);
    }

    public void insertarNodo(int freq, char c) {
        raiz.frecuencia = freq;
        raiz.c = c;
        raiz.izquierda = null;
        raiz.derecha = null;
    }
    public void insertarIzquierda(Nodo izquierda,String valor) {
        this.raiz.normal=valor;
        this.raiz.izquierda = izquierda;
    }
    
    public void insertarDerecha(Nodo derecha,String valor) {
        this.raiz.normal=valor;
        this.raiz.derecha = derecha;
    }
    public void insertarNodo(Nodo node,String valor) {
        this.raiz.frecuencia = node.frecuencia;
        this.raiz.normal = valor;
        this.raiz.izquierda = null;
        this.raiz.derecha = null;
    }

    public void insertarNodo(int frecuancia, char c, Nodo izquierda, Nodo derecha) {
        raiz.frecuencia = frecuancia;
        raiz.c = c;
        this.raiz.izquierda = izquierda;
        this.raiz.derecha = derecha;
    }

    public void insertarNodo(Nodo node) {
        this.raiz.frecuencia = node.frecuencia;
        this.raiz.c = node.c;
        this.raiz.izquierda = node.izquierda;
        this.raiz.derecha = node.derecha;
    }

    public void insertarNodo(Nodo nodo1, Nodo nodo2) {
        raiz = super.agregarNodo(nodo1, nodo2);
    }

    //Getters & Setters
    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
}
