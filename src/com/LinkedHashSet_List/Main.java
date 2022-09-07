package com.LinkedHashSet_List;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Set<Persona> lista = new LinkedHashSet<>(); // Para no tener elementos duplicados CON ORDEN
        lista.add(new Persona(1,"Ruben",23)); // Sobrescribiendo el los metodos equal and hashCode
        lista.add(new Persona(1,"Ruben",23));
        lista.add(new Persona(4,"Carol",20));


        for (Persona p:lista) {
            System.out.println(p.getNombre());
        }

    }

}

class Persona {
    int id;
    String nombre;

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
    public boolean equals(Object o) {                   // Y sirven para detectar elementos similares en parametros
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;

        Persona persona = (Persona) o;

        return getNombre().equals(persona.getNombre());

    }

    @Override
    public int hashCode() {
        return getNombre().hashCode();
    }
}
