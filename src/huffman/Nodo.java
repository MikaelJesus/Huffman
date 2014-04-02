package huffman;

public class Nodo {

    public int frecuencia;
    public char c;
    public String normal;

    
    public Nodo izquierda;
    public Nodo derecha;

    public Nodo(int frecuencia, char c, Nodo izquierda, Nodo derecha) {
        this.frecuencia = frecuencia;
        this.c = c;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public Nodo() {

    }

    public Nodo agregarNodo(Nodo nodo1, Nodo nodo2) {
        if (nodo1.frecuencia < nodo2.frecuencia) {
            izquierda = nodo1;
            derecha = nodo2;
        } else {
            derecha = nodo1;
            izquierda = nodo2;
        }
        frecuencia = nodo1.frecuencia + nodo2.frecuencia;

        return this;
    }

    //Getters & Setters
    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }

}
