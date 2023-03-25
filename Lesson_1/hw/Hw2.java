/*
 * Вывести все простые числа от 1 до 1000 
 */
package Lesson_1.hw;

import java.util.ArrayList;
import java.util.List;

public class Hw2 {
    public static void printSimpleNums() {
        List<Integer> list = new ArrayList<>();
        boolean k = false; 
        for (int i = 2; i < 1000; i++) { // бежим по всем числам
            for (int j = 2; j < i; j++) { // бежим по делителям
                k = true;
                if (i % j == 0) {
                    k = false;
                    break; // если хоть один делитель есть, то число не простое
                }

            }
            if (k == true) {
                //System.out.println(i);
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
