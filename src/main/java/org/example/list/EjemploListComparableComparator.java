package org.example.list;

import org.example.models.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Juan", 7));
        sa.add(new Alumno("Pablo", 9));
        sa.add(new Alumno("Micaela", 4));
        sa.add(new Alumno("Ivan", 10));
        sa.add(new Alumno("Franco", 2));
        sa.add(new Alumno("Franco", 6));
        sa.add(new Alumno("Ivan2", 10));
        //Collections.sort(sa, (a,b) -> a.getNota().compareTo(b.getNota()));
        //sa.sort((a,b) -> b.getNota().compareTo(a.getNota()));
        //sa.sort(Comparator.comparing((Alumno a) -> a.getNombre()));
        sa.sort(Comparator.comparing(Alumno::getNota).reversed());
        System.out.println(sa);

        /*sa.forEach(alumno -> System.out.println(alumno.getNombre() + ", Nota = " + alumno.getNota()));*/
    }
}
