package huffman;

import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        String valor="";
        System.out.print("Ingrasa Tu Cadena: ");
        valor = t.nextLine();
        System.out.println("Esta Es Tu Cadena: " + valor);
        Huffman huffman = new Huffman(valor);
        System.out.println("El Valor Binario Es: " + huffman.getConversor().getBinario());
    }
}
