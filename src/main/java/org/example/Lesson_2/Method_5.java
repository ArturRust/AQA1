package org.example.Lesson_2;

import java.util.Arrays;

public class Method_5 {
    public static void changeNumeric(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (array[i] == 0)? 1 : 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
