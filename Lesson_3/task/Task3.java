/*
 * Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа. 
Пройти по списку, найти и удалить целые числа.
 */
package Lesson_3.task;

import java.util.ArrayList;

public class Task3 {
    public static void deleteIntFromList() {
        //ArrayList<String> string = new ArrayList<>();
        ArrayList string = new ArrayList<Integer>();
        string.add("hurra!");
        string.add(5);
        string.add("hola!");
        string.add(4);
        string.add("privet!");
        string.add(6);
        System.out.println(string);
        for (int i = 0; i < string.size(); i++) {
            if(string.get(i) instanceof Integer) string.remove(string.get(i));
        }
        System.out.println(string);
    }
}
