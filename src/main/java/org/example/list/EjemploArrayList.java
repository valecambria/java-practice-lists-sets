package org.example.list;

import org.example.models.Alumno;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        al.add(new Alumno("Juan", 7));
        al.add(new Alumno("Pablo", 9));
        al.add(new Alumno("Micaela", 4));
        al.add(new Alumno("Ivan", 10));
        al.add(2,new Alumno("Franco", 2));
        al.set(3,new Alumno("Franco", 6));
        al.add(new Alumno("Ivan2", 10));
        System.out.println(al + " size: " + al.size());
        //al.remove(new Alumno("Juan", 7));
        al.remove(0);
        System.out.println(al + " size: " + al.size());
        boolean b = al.contains(new Alumno("Juan", 7));
        System.out.println("Contiene a Juan? " + b);

        Object a[] = al.toArray();
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
