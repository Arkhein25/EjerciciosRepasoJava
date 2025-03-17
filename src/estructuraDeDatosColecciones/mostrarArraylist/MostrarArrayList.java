package estructuraDeDatosColecciones.mostrarArraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MostrarArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> entero = new ArrayList<>();
        entero.add(1);
        entero.add(2);
        entero.add(3);
        entero.add(4);
        entero.add(5);
        entero.add(6);
        entero.add(7);
        entero.add(8);
        entero.add(9);
        entero.add(10);
        System.out.println("*** Colección de numeros Array List ***");
        System.out.println("imprimiendo coleccion de numeros: " + entero);
        System.out.println();
        //buscando un elemento en el array list
        System.out.println("*** Mostrando si el numero 5 esta en el arreglo ***");
        System.out.println("Se encuentra el numero 5 en el arreglo: " + entero.contains(5));
        System.out.println();
        //invertir lista de elementos
        System.out.println("*** Invirtiendo lista ***");
        Collections.reverse(entero);
        System.out.println("Lista invertida: " + entero);
        System.out.println();
        //eliminando elemento de la lista
        System.out.println("*** Eliminando elemento de la lista ***");
        Collections.reverse(entero);
        entero.remove(Integer.valueOf(10));
        System.out.println("Lista sin el elemento eliminado: " + entero);

    }
}
