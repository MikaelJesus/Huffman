package huffman;

public class Conversor {

    private Nodo nodoRaiz;
    private char c;
    private char Arreglo[];
    private String binario = "";

    public Conversor(Nodo miNodo, char[] Arreglo) {
        String temp="";
        nodoRaiz = miNodo;
        this.Arreglo = Arreglo;
        for (int i = 0; i < Arreglo.length; i++) {
            temp = buscar(nodoRaiz, "", Arreglo[i]);
            binario += temp +"&"+ Arreglo[i];
            System.out.println("Valor " + (i + 1) + ": " + Arreglo[i] + " " + temp);
        }

    }

    public String buscar(Nodo nodoRaiz, String valor, char c) {
        String cadena = "";
        if (nodoRaiz != null) {
            if (nodoRaiz.izquierda != null) {
                cadena = buscar(nodoRaiz.izquierda, valor + "0", c);
            }
            if (nodoRaiz.c == c) {
                return valor;
            } else {
                if (cadena == "") {
                    return buscar(nodoRaiz.derecha, valor + "1", c);
                } else {
                    return cadena;
                }
            }
        } else {
            return "";
        }
    }

    //Getters & Setters
    public Nodo getNodoRaiz() {
        return nodoRaiz;
    }

    public void setNodoRaiz(Nodo nodoRaiz) {
        this.nodoRaiz = nodoRaiz;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public char[] getArreglo() {
        return Arreglo;
    }

    public void setArreglo(char[] Arreglo) {
        this.Arreglo = Arreglo;
    }

    public String getBinario() {
        return binario;
    }

    public void setBinario(String binario) {
        this.binario = binario;
    }

}
