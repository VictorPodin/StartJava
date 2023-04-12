package Lesson_6;

import java.util.HashSet;
import java.util.Set;

import Lesson_6.task.Cat;
import Lesson_6.task.Owner;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Podin Victor", "89104426133");

        Cat cat = new Cat("Edvard", 12, true, "Толстый", owner);
        // Owner owner2 = new Owner("Podin Victor", "89104426133");
        Cat cat2 = new Cat("Edvard", 12, true, "Толстый", owner);
        Cat cat3 = new Cat("Vaska", 12, true, "Толстый", owner);
        Cat cat4 = new Cat("Edvard", 12, true, "Толстый", owner);
        Cat cat5 = new Cat("Edvard", 12, true, "Толстый", owner);
        Cat cat6 = new Cat("Edvard", 12, true, "Толстый", owner);
        Cat cat7 = new Cat("Edvard", 12, true, "Толстый", owner);
        Cat cat8 = new Cat("Edvard", 12, true, "Толстый", owner);
        Cat cat9 = new Cat("Edvard", 12, true, "Толстый", owner);
        Cat cat10 = new Cat("Edvard", 12, true, "Толстый", owner);
        Cat cat11 = new Cat("Edvard", 12, true, "Толстый", owner);
        Cat cat12 = new Cat("Edvard", 12, true, "Толстый", owner);
        System.out.println(cat);
        Set<Cat> cats = new HashSet<>();
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);
        cats.add(cat7);
        cats.add(cat8);
        cats.add(cat9);
        cats.add(cat10);
        cats.add(cat11);
        cats.add(cat12);
        System.out.println(cats);
    }
}
