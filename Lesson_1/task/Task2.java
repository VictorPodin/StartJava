package Lesson_1.task;

public class Task2 {
    // 110111
    public static int run(int[] array) {
        int maxcount = 0;
        int count = 0;
        for (int i : array) {
            if (i == 1) {
                count++;
            } else {
                if (maxcount < count) {
                    maxcount = count;
                }
                count = 0;
            }
        }
        if(count > maxcount){
            maxcount = count;
        }
        return maxcount;
    }
}
