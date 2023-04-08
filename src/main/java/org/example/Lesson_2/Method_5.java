package org.example.Lesson_2;

public class Method_5 {
    public static int[] changeNumeric(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (array[i] == 0)? 1 : 0;
        }
        return array;
    }
}
