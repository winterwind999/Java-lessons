package design_pattern_behavioral.template_pattern.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TemplateEverydayDemo {
    static void main() {
        Person bryan = new Person("bryan", 39);
        Person mark = new Person("mark", 41);
        Person chris = new Person("chris", 38);

        List<Person> people = new ArrayList<>();
        people.add(bryan);
        people.add(mark);
        people.add(chris);

        System.out.println("Not sorted");
        for (Person person : people) {
            System.out.println(person.getName());
        }

        Collections.sort(people);

        System.out.println("\nSorted by age");
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age) {
            return 1;
        }

        if (this.age < o.age) {
            return -1;
        }

        return 0;
    }
}