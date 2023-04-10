/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя.
 */
package Lesson_4.hw;

import java.util.LinkedList;

public class Hw2 {
    public static LinkedList<String> linklist = new LinkedList<>();

    public static void run() {

        linklist.add("первый ");
        linklist.add("второй ");
        linklist.add("третий ");
        linklist.add("четвертый ");
        linklist.add("пятый ");
        linklist.add("шестой ");
        linklist.add("седьмой ");
        System.out.println(linklist);

        enqueue("Восьмой в конец ");
        System.out.println(linklist);

        String dequed = dequeue();
        System.out.println("Удаляем: " + dequed);
        System.out.println(linklist);

        String first = first();
        System.out.println("Первый в очереди: " + first);
        System.out.println(linklist);
    }

    public static void enqueue(String string) {
        linklist.add(string);
    }

    public static String dequeue() {
        return linklist.removeFirst();
    }

    public static String first() {
        return linklist.getFirst();
    }
}
