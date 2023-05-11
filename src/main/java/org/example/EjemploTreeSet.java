package org.example;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        //Revertir el Set forma 1
        Set<String> ts = new TreeSet<>((a,b) -> b.compareTo(a));
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        System.out.println(ts);
        //Revertir el set forma 2
        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(2);
        numeros.add(5);
        System.out.println(numeros);
    }
}
