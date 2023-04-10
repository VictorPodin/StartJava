/*
 * Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернёет «перевёрнутый» список.
 */

package Lesson_4.hw;

import java.util.LinkedList;

public class Hw1 {
    public static void run() {
        LinkedList<String> linklist = new LinkedList<>();
        linklist.push("первый ");
        linklist.push("второй ");
        linklist.push("третий ");
        linklist.push("четвертый ");
        linklist.push("пятый ");
        linklist.push("шестой ");
        linklist.push("седьмой ");
        System.out.println(linklist);

        System.out.println(reverseLinkedList(linklist));
        // Collections.reverse(linklist); // Как говорится, не изобретаем велосипед, но
        // попрубуем и метод
        // System.out.println(linklist);

    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
        LinkedList<String> reversedLinkedList = new LinkedList<String>();
        for (int i = list.size(); i > 0; i--)
            reversedLinkedList.add(list.get(i - 1));

        return reversedLinkedList;
    }

}
