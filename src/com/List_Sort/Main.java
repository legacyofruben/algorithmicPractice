package com.List_Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Persona> list = new ArrayList<Persona>();
        list.add(new Persona(1,"Ruben",25));
        list.add(new Persona(2,"Carol",20));
        list.add(new Persona(3,"Anahi",30));


        //Collections.sort(list,new nombreComparator()); //Metodo de ordenamiento
        /*Collections.sort(list, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                int result;
                if(o1.getEdad()>o2.getEdad()){
                    result=1; // Valor positivo
                }else{
                    if(o1.getEdad()==o2.getEdad()){
                        result=0; // Valores iguales
                    }else{
                        result=-1; // Valor negativo
                    }
                }
                return result;
            }
        });*/

        Collections.sort(list);

        for (Persona p:list)
        {
            System.out.println(p.getNombre()+" "+p.getEdad());
        }
        //System.out.println(list);

    }

}
class Persona implements Comparable<Persona>{
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

    @Override
    public int compareTo(Persona p) {
        return this.getEdad()-p.getEdad();
    }
}