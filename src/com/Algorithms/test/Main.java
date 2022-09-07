package com.Algorithms.test;

import java.util.*;

/**
 * Created by ruben_cerpa on 16/06/17.
 */
public class Main {



    public static void main(String[] args) {

        /*Scanner in = new Scanner(System.in);
        //int n = 4;//in.nextInt();
        StringBuilder str;
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        //String[] grid = new String[]{"1112", "1912", "1892", "1234"};
        String[] grid = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }*/

        Scanner in = new Scanner(System.in);

        String str = in.next();
        StringBuilder strb = new StringBuilder(str);
        System.out.println(strb);
        System.out.println(strb.append('X'));
        System.out.println(strb.charAt(1));
        System.out.println(strb.indexOf("as"));
        System.out.println(strb.substring(2,4));
        System.out.println(strb.delete(0,5));
        System.out.println(strb.insert(0,"Ruben"));
        System.out.println(strb.length());
        strb.trimToSize();
        System.out.println(strb);
        strb.setLength(2);
        System.out.println(strb);
        int a=0;
        for (int i = 0; i < str.length(); i++) {
            a=(str.charAt(i)==97)?a+1:a;
        }
        System.out.println(a);

        // List Interface

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Vector<Integer> vector = new Vector<Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        // Queue Interface

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();

        // Set Interface

        HashSet<Integer> hashSet = new HashSet<Integer>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        SortedSet sortedSet;
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        // Map Interface
        Map<Integer,String> map = new HashMap<Integer,String>();

        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(1);

        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return 0;
            }
        });

        Iterator it = treeSet.iterator();
        while (it.hasNext())
            System.out.println(it.next());


    }

}
final class Finaltest{
    int a=0;

}
