package ComparatorAndComparable;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(){

    }

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Name: "+name+"\t Age: "+age);
    }

    @Override
    public String toString() {
        return "Comparator.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person p = (Person) obj;
            return this.age == p.age && name.equals(p.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Polo",21);
        p1.print();

        Person p2 = new Person("Polo",21);


        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.equals(p2));;// in this statement p2 is pointing to ojbect and p2 is pointing to this

        System.out.println(Objects.hash(2));
    }
}
