package com.List_Sort;

import java.util.Comparator;

/**
 * Created by ruben_cerpa on 7/06/17.
 */
public class nombreComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Persona per1 = (Persona)o1;
        Persona per2 = (Persona)o2;

        return per1.getNombre().compareTo(per2.getNombre());
        //return 0;
    }
}
