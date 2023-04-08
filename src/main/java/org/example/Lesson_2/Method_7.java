package org.example.Lesson_2;

import java.util.Arrays;

public class Method_7 {
    public static void checkAndMultiplyByTwo(int[] array,int number){
        for (int i = 0; i < array.length; i++) {
            if (array[i]<number){
                array[i]*=2;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
