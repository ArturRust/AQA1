package org.example.Lesson_2;

import java.util.Arrays;

public class Method_6 {
    public static void arrayFilling(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
        }
        System.out.println(Arrays.toString(array));
    }
}
