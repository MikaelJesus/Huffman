package huffman;

import java.util.*;

public class Main {

    public static void main(String args[]) {
        String binario="";
        Scanner t = new Scanner(System.in);
        String valor="";
        System.out.print("Ingrasa Tu Cadena: ");
        valor = t.nextLine();
        System.out.println("Esta Es Tu Cadena: " + valor);
        Huffman huffman = new Huffman(valor);
        System.out.println("El Valor Binario Es: " + huffman.getConversor().getBinario());
        binario=huffman.getConversor().getBinario();
        Descomprime d=new Descomprime(binario);
        System.out.println(d.descomprimir());
    }
}
