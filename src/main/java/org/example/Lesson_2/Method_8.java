package org.example.Lesson_2;

public class Method_8 {
    public static void fillingSquareArray(int size){
        int[][] sqrArray = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : 2;
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }
}
