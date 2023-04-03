/*
 * Заполнить список десятью случайными числами. 
Отсортировать список методом sort() и вывести его на экран.
 */
package Lesson_3.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static List<Integer> generateIntList() {
        List<Integer> listOfNumbers  = new ArrayList<>();
        Random random = new Random();
        listOfNumbers.add(random.nextInt(11));
        listOfNumbers.add(random.nextInt(11));
        listOfNumbers.add(random.nextInt(11));
        listOfNumbers.add(random.nextInt(11));
        listOfNumbers.add(random.nextInt(11));
        listOfNumbers.add(random.nextInt(11));
        listOfNumbers.add(random.nextInt(11));
        listOfNumbers.add(random.nextInt(11));
        System.out.println(listOfNumbers);
        return listOfNumbers;
        //Collections.sort(listOfNumbers);
    }
}
