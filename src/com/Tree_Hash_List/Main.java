package com.Tree_Hash_List;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
        Set<String> lista = new TreeSet<>(); // Permite elementos NO REPETIDOS Y ORDENADOS ASC por default
        lista.add("Ruben");
        lista.add("Ruben");
        lista.add("Cerpa");

        for (String s:lista) {
            System.out.println(s);
        }
        */
        Set<Persona> lista = new TreeSet<>(); // Permite elementos NO REPETIDOS Y ORDENADOS ASC por default
        lista.add(new Persona(1,"Ruben",23)); // Necesario implementar Comparable
        lista.add(new Persona(2,"Ruben",23));
        lista.add(new Persona(3,"Carol",20));

        for (Persona p:lista) {
            System.out.println(p.getNombre());
        }

    }

}

class Persona implements Comparable<Persona>{
    private int id;
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    int edad;

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override                                           // Metodos sobrescritos solo para el parametro NOMBRE
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;

        Persona persona = (Persona) o;

        return getNombre().equals(persona.getNombre());

    }

    @Override
    public int hashCode() {
        return getNombre().hashCode();
    }

    @Override
    public int compareTo(Persona o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
