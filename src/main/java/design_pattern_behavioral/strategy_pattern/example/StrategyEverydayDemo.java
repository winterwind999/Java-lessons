package design_pattern_behavioral.strategy_pattern.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {
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

        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                }

                if (o1.getAge() < o2.getAge()) {
                    return -1;
                }

                return 0;
            }
        });

        System.out.println("\nSorted by age");
        for (Person person : people) {
            System.out.println(person.getName());
        }

        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("\nSorted by name");
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}

class Person {
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
}