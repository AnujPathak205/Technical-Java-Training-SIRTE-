package CollectionAPIs;

import java.util.*;

/**
    * Collection APIs:
        * Provides all well known data structures in the industry
        * Shortfalls of array: It is fixed in size
        * It is introduced to overcome the shortfalls of arrays.
        * It provides classes which are implementation of various well known data structures
        *
 */

public class Demo {
    public static void main(String[] args) {
        //LinkedList
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Microsoft");
        ll.add("Google");
        ll.add("Apple");
        ll.add("Oracle");
        ll.add(2,"Apache");

        System.out.println("\n-- Iteration using for loop");
        for(int i = 0;i < ll.size();i++) {
            System.out.println(ll.get(i));
        }

        System.out.println("\n-- Iterating using Iterator");
        Iterator<String> itr = ll.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\n-- Iterating using for-each");
        for(String e:ll) {
            System.out.println(e);
        }


        //ArrayList
        ArrayList<String> al = new ArrayList<>();
        al.add("IBM");
        al.add("Apple");
        al.add("JBoss");

        al.addAll(ll);

        System.out.println("\n-- Iterating over merged collection");
        for(String e: al)
            System.out.println(e);

        HashSet<String> set = new HashSet<String>(al);
        System.out.println("\n-- Iterating over set collection");
        for(String e:set)
            System.out.println(e);

        TreeSet<String> tree = new TreeSet<>(set);
        System.out.println("\n-- Iterating over sorted collection");
        for(String e:tree) {
            System.out.println(e);
        }
    }
}
