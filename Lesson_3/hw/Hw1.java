/*
 * Реализовать алгоритм сортировки слиянием
 * void sort(comparator)
 */

package Lesson_3.hw;

import java.util.ArrayList;
import java.util.List;

public class Hw1 {
    public static void sortArrayByMerge(List<Integer> list) {
        ArrayList<Integer> mergedlist = new ArrayList<>(list);
        mergedlist.sort(null); //Алгоритм Тима Петерса Timsort слиянием
        System.out.println(mergedlist);
        // в инете нашел другое, но для коллекций применить не смог, потратил кучу времени... реализация в test.java
    }
     
}

        
    


    

