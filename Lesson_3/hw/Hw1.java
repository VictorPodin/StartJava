/*
 * Реализовать алгоритм сортировки слиянием
 */

package Lesson_3.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hw1 {
    //public static List<Integer> sortArrayByMerge(List<Integer> list) {
       //List<Integer> mergedlist = new ArrayList<>();
        //int size = list.size();

       // return mergedlist;
    ///
    
    public static List<Integer> mergeSort(List<Integer> list) {
        
        if (list.size() <= 1) {
            return list;
        }
        List<Integer> left = list.subList(0, list.size()/2);
        System.out.println(left);
        List<Integer> right = list.subList(list.size()/2, list.size());
        System.out.println(right);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        int resIn = 0, leftIn = 0, rightIn = 0;
        List<Integer> result = new ArrayList<>(5);
        System.out.println(result);

        while (leftIn < left.size() && rightIn < right.size())
            if (left.get(leftIn) < right.get(rightIn)) {
                result.add(resIn++, left.get(leftIn++));
                System.out.println(result);
            }
            else {
                result.add(resIn++, right.get(rightIn++));
                System.out.println(result);
            }

        while (resIn < result.size())
            if (leftIn != left.size()) {
                result.add(resIn++, left.get(leftIn++));
                System.out.println(result);
            }
            else {
                result.add(resIn++, right.get(rightIn++));
                System.out.println(result);
            }
        System.out.println(result); 
        return result;
    }    
        
    


    
}
