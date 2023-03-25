/*
 * Реализовать простой калькулятор 
 * Использовать сканнер: Scanner scanner = new Scanner(System.in); 
 * String enter = scanner.next(); int i = Integer.parseInt(enter);
 */
package Lesson_1.hw;

import java.util.List;
import java.util.Scanner;

public class Hw3 {
    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите через пробел 2 числа и оператор:");
        System.out.println("доступные операторы: *, /, +, -");
        System.out.println("Например 2 * 4");
        String digit1 = scanner.next();
        int a = Integer.parseInt(digit1);
        String operator = scanner.next();
        String digit2 = scanner.next();
        int b = Integer.parseInt(digit2);
        scanner.close();
        switch (operator) {
            case "*": 
                System.out.println(a*b);
                break;
            case "/": 
                System.out.println(a/b);
                break;
            case "+": 
                System.out.println(a+b);
                break;
            case "-": 
                System.out.println(a-b);
                break;
            default: 
                System.out.println("что-то пошло не так");
        }
    }
}
