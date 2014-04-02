/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffman;

/**
 *
 * @author Alumnos
 */
public class Descomprime {

    private String binario = "";
    private String normal = "";
    private Nodo nodoRaiz;
    private Nodo Nodo;
    private Arbol arbol;

    public Descomprime(String binario) {
        this.binario = binario;
    }

    public String descomprimir() {
        arbol = new Arbol();
        for (int i = 0; i < binario.length(); i++) {
            if (binario.substring(i, i) == "0") {

                arbol.insertarDerecha(Nodo, "1");
            } else {
                if (binario.substring(i, i) == "1") {

                    arbol.insertarIzquierda(Nodo, "0");
                } else {
                    if (binario.substring(i, i) == "&") {
                        arbol.insertarNodo(Nodo, binario.substring(i + 1, i + 1));
                        normal = normal + binario.substring(i + 1, i + 1);
                    }
                }
            }
        }
        return normal;
    }

    //Getters & Setters
}
