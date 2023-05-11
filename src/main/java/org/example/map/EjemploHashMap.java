package org.example.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Pedro");
        persona.put("apellido", "Ferreira");
        persona.put("edad", "24");
        persona.put("email", "pferreira@gmail.com");

        String nombre = persona.get("nombre");
        String apellido = persona.get("apellido");
        String edad = persona.get("edad");
        String email = persona.get("email");
        System.out.println(nombre + " " + apellido + " " + edad + " " + email);
        boolean b = persona.containsValue("Pedro");
        System.out.println("Contiene: " + b);

        Collection<String> valores = persona.values();
        for (String v: valores){
            System.out.println(v);
        }

        Set<String> valores2 = persona.keySet();
        for (String k: valores2){
            System.out.println("k = " + k);
        }

        for (Map.Entry<String, String> par: persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getValue());
        }
        System.out.println("=================================");
        for (String llave: persona.keySet()){
            String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }
        System.out.println("=================================");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });
        System.out.println("=================================");
        persona.replace("nombre", "Juan");
        System.out.println(persona);

        Map<String, Object> persona2 = new HashMap<>();
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
        System.out.println("El pais de " + persona2.get("nombre") + " es " + direccionPersona.get("pais"));
/*        persona2.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });*/
    }
}
