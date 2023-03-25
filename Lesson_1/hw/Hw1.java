/*
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
 * n! (произведение чисел от 1 до n)
 */
package Lesson_1.hw;

import java.util.Scanner;

public class Hw1 {
    public static Integer inputDigit(){
        Integer num = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } 
        else {
            System.out.println("Вы ввели не целое число");
        }
        return num;
    }
   
    public static int getTriangleDig(int n){
        int tridig = 0;
            for (int i = 1; i <= n; i++) {
                tridig += i;
            }
        return tridig;
    }

    public static int getFactorial(int n){
        int factor = 1;
            for (int i = 1; i <= n; i++) {
                factor *= i;
            }
        return factor;
    }
}