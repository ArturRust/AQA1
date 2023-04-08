package org.example.Lesson_2;

public class Method_7 {
    public static int[] checkAndMultiplyByTwo(int[] array,int number){
        for (int i = 0; i < array.length; i++) {
            if (array[i]<number){
                array[i]*=2;
            }
        }
        return array;
    }
}
