/*
 * 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
 */

package Lesson_4.task;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task5 {
        public static void printStack(int[] array ) {
            int length  = array.length;
            Stack<Integer> arrayStack = new Stack<>();
            Queue<Integer> arrayQue = new LinkedList<>();
            Deque<Integer> arrayDeque = new LinkedList<>();
    
            for (int i = 0; i < length; i++) {
                arrayStack.push(array[i]);
                arrayQue.add(array[i]);
                arrayDeque.push(array[i]);
            }
            System.out.println(arrayStack);
            System.out.println(arrayQue);
            System.out.println(arrayDeque);
        }
    }

