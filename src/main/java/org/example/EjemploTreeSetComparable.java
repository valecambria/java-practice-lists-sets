package org.example;

import org.example.models.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        Set<Alumno> sa = new TreeSet<>((a,b) -> b.getNota().compareTo(a.getNota()));
        sa.add(new Alumno("Juan", 7));
        sa.add(new Alumno("Pablo", 9));
        sa.add(new Alumno("Micaela", 4));
        sa.add(new Alumno("Ivan", 10));
        sa.add(new Alumno("Franco", 2));
        System.out.println(sa);
    }
}
