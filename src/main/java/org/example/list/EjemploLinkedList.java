package org.example.list;

import org.example.models.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> al = new LinkedList<>();
        al.add(new Alumno("Juan", 7));
        al.add(new Alumno("Pablo", 9));
        al.add(new Alumno("Micaela", 4));
        al.add(new Alumno("Ivan", 10));
        al.add(new Alumno("Franco", 2));
        al.add(new Alumno("Franco", 6));
        al.add(new Alumno("Ivan2", 10));
        al.addFirst(new Alumno("Francisco", 8));
        al.addLast(new Alumno("Jorge", 1));
        System.out.println(al);
        //System.out.println("El primero es: " + al.getFirst());
        //System.out.println("El último es: " + al.peekLast()); //No lanza excepción a diferencia de los get
        //System.out.println("El alumno con indice 2 es: " + al.get(2));
        al.pollFirst(); //recibe y elimina el primer elemento de la lista y retorna null si esta vacio a diferencia del remove
        al.removeLast();
        //System.out.println(al);
        //System.out.println("El primero es: " + al.getFirst());
        //System.out.println("El último es: " + al.peekLast());
        ListIterator<Alumno> li = al.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println("previous ======================");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
