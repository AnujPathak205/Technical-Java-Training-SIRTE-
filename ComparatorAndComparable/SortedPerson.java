package ComparatorAndComparable;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {
    public static void main(String[] args) {
        Comparator<Person> nameComp = (p1, p2) -> p1.getName().compareTo(p2.getName());
        Comparator<Person> ageComp = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());
        Comparator<Person> nameAgeComp = (p1, p2) -> {
            if(p1.getName().equals(p2.getName())){
                return Integer.compare(p1.getAge(),p2.getAge());
            }else{
                return p1.getName().compareTo(p2.getName());
            }
        };

        TreeSet<Person> people = new TreeSet<>();

        people.add(new Person("Lili",22));
        people.add(new Person("Polo",21));
        people.add(new Person("Sam",19));
        people.add(new Person("Ani",100));
        people.add(new Person("Lili",29));

        for(Person p:people) {
            System.out.println(p);
        }
    }
}
