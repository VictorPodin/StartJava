package Lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import Lesson_3.hw.*;
import Lesson_3.task.*;


public class Main {
    public static void main(String[] args) {
        //Task1.generateIntList();
        // ArrayList<String> poetry = new ArrayList<>();
        // poetry.add("Поэзия");
        // poetry.add("Евгений Онегин");
        // poetry.add("Облако в штанах");
        // ArrayList<String> prose = new ArrayList<>();
        // prose.add("Проза");
        // prose.add("Накануне");
        // prose.add("Война и мир");
        
        // Task2.fillLibrary(poetry);
        // Task2.fillLibrary(prose);
        //Task3.deleteIntFromList();
//Hw1
        //List<Integer> listOfNumbers  = new ArrayList<>();
        //listOfNumbers = Task1.generateIntList();
        List<Integer> list  = new ArrayList<>();
        Random random = new Random();
        list.add(random.nextInt(11));
        list.add(random.nextInt(11));
        list.add(random.nextInt(11));
        list.add(random.nextInt(11));
        //list.add(random.nextInt(11));
        //list.add(random.nextInt(11));
        //list.add(random.nextInt(11));
        //list.add(random.nextInt(11));
        System.out.println(list);
        Hw1.mergeSort(list);
        //int[] scr = new int[]{0,7,0,4,1,3};
        //test.mergeSort(scr);
        //System.out.println(Arrays.toString(scr));
    }
}
