package huffman;

public class Huffman {

    private char Arreglo[];

    private int tabla[] = new int[0x7f];
    private Nodo Nodo[];
    private int izquierdaDeLaTabla = 0;
    private Arbol Arbol;
    private int longitudDelNodo = 0;
    private Conversor conversor;

    public Huffman(String valor) {
        frecuenciaDeLaTabla(valor);
        organizar();
        conversor = new Conversor(crearArbol(), Arreglo);
    }

    public void frecuenciaDeLaTabla(String valor) {
        Arreglo = valor.toCharArray();
        for (int i = 0; i < Arreglo.length; i++) {
            tabla[obtenerAscii(Arreglo[i])] += 1;
        }
    }

    public int obtenerAscii(char valor) {
        return valor & 0x7f;
    }

    public void organizar() {
        int contador = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > 0) {
                contador++;
            }
        }

        izquierdaDeLaTabla = contador;
        contador = 0;
        Nodo = new Nodo[izquierdaDeLaTabla];

        for (int i = 0; i < 127; i++) {
            if (tabla[i] != 0) {
                Nodo[contador] = new Nodo(tabla[i], (char) i, null, null);
                contador++;
            }
        }
        longitudDelNodo = Nodo.length;
        sort();

    }

    public Nodo crearArbol() {
        for (int i = 1; i < longitudDelNodo; i++) {
            try {
                if (Nodo[1].frecuencia >= Nodo[0].frecuencia) {
                    Arbol = new Arbol(Nodo[0], Nodo[i]);
                    Nodo[0] = Arbol;
                    moverNodos(i, longitudDelNodo);
                    longitudDelNodo -= 1;
                    i -= 1;
                    sort();
                } else {
                    if (i + 1 < longitudDelNodo) {
                        Arbol = new Arbol(Nodo[i], Nodo[i + 1]);
                        Nodo[1] = Arbol;
                        moverNodos(i + 1, longitudDelNodo);
                        sort();
                        longitudDelNodo -= 1;
                        i -= 1;
                    } else {
                        Nodo[1] = Nodo[i];
                        Nodo[0] = new Arbol(Nodo[0], Nodo[1]);
                    }
                }
            } catch (Exception e) {

            }
        }
        return Nodo[0];
    }

    private void moverNodos(int index, int length) {
        try {
            for (int i = index; i < length; i++) {
                Nodo[i] = Nodo[i + 1];
            }

        } catch (Exception e) {

        }
    }

    private void sort() {
        Nodo temp;
        for (int i = longitudDelNodo - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (Nodo[j].frecuencia > Nodo[j + 1].frecuencia) {
                    temp = Nodo[j + 1];
                    Nodo[j + 1] = Nodo[j];
                    Nodo[j] = temp;
                }

                if (Nodo[j].frecuencia == Nodo[j + 1].frecuencia && Nodo[j].izquierda != null) {
                    temp = Nodo[j + 1];
                    Nodo[j + 1] = Nodo[j];
                    Nodo[j] = temp;
                }
            }
        }
    }

    //Getters & Setters
    public char[] getArreglo() {
        return Arreglo;
    }

    public void setArreglo(char[] Arreglo) {
        this.Arreglo = Arreglo;
    }

    public int[] getTabla() {
        return tabla;
    }

    public void setTabla(int[] tabla) {
        this.tabla = tabla;
    }

    public Nodo[] getNodo() {
        return Nodo;
    }

    public void setNodo(Nodo[] Nodo) {
        this.Nodo = Nodo;
    }

    public int getIzquierdaDeLaTabla() {
        return izquierdaDeLaTabla;
    }

    public void setIzquierdaDeLaTabla(int izquierdaDeLaTabla) {
        this.izquierdaDeLaTabla = izquierdaDeLaTabla;
    }

    public Arbol getArbol() {
        return Arbol;
    }

    public void setArbol(Arbol Arbol) {
        this.Arbol = Arbol;
    }

    public int getLongitudDelNodo() {
        return longitudDelNodo;
    }

    public void setLongitudDelNodo(int longitudDelNodo) {
        this.longitudDelNodo = longitudDelNodo;
    }

    public Conversor getConversor() {
        return conversor;
    }

    public void setConversor(Conversor conversor) {
        this.conversor = conversor;
    }
}
