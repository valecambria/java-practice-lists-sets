package org.example;

import org.example.models.Alumno;

import java.lang.reflect.Array;
import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        //List<Alumno> sa = new ArrayList<>();
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Juan", 7));
        sa.add(new Alumno("Pablo", 9));
        sa.add(new Alumno("Micaela", 4));
        sa.add(new Alumno("Ivan", 10));
        sa.add(new Alumno("Franco", 2));
        sa.add(new Alumno("Franco", 6));
        sa.add(new Alumno("Ivan2", 10));
        //System.out.println(sa);


          for (Alumno a : sa){
              System.out.println(a.getNombre() + ", Nota = " + a.getNota());
        }
          //Usando while e iterator
        System.out.println("Usando while e iterator");
          Iterator<Alumno> it = sa.iterator();
          while (it.hasNext()){
              Alumno a = it.next();
              System.out.println(a.getNombre() + ", Nota = " + a.getNota());
          }

        System.out.println("Usando lambda");
          sa.forEach(alumno -> System.out.println(alumno.getNombre() + ", Nota = " + alumno.getNota()));

/*        System.out.println("Usando el loop for clásico");
        for (int i = 0 ; i<sa.size(); i++){
            Alumno a = sa.get(i);
            System.out.println(a.getNombre() + ", Nota = " + a.getNota());
        }*/
    }
}
