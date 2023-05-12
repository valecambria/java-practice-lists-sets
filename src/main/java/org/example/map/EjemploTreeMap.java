package org.example.map;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {

        Map<String, Object> persona2 = new TreeMap<>(Comparator.comparing(String::length).reversed());
        persona2.put("nombre", "Fernando");
        persona2.put("apellido", "Gonzalez");
        persona2.put("edad", "20");
        persona2.put("email", "fgzlez@gmail.com");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "Argentina");
        direccion.put("provincia", "Cordoba");
        direccion.put("ciudad", "Rio Cuarto");
        direccion.put("cp", "5800");

        persona2.put("direccion", direccion);
        Map<String, String> direccionPersona = (Map<String, String>) persona2.get("direccion");
        String pais = direccionPersona.get("pais");
        String provincia = direccionPersona.get("provincia");
        String ciudad = direccionPersona.get("ciudad");
        String cp = direccionPersona.get("cp");

        System.out.println("persona2 = " + persona2);
    }
}
