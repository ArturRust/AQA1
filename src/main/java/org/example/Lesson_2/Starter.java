package org.example.Lesson_2;

public class Starter {
    private static final int[] ArrayOne = new int[]{3, 5,6,1};
    private static final int[] ArrayTwo = new int[100];
    private static final int[] ArrayThree = new int[]{ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    private static final int[] ArrayFour = new int[]{1, 0,0,1};
    public static void main(String[] args) {
        Method_1.check(10,3);
        Method_2.checkOfPositive(5);
        Method_3.checker(10);
        Method_4.print("as",2);
        Method_Visokos.visokos(2325);
        Method_5.changeNumeric(ArrayFour);
        Method_6.arrayFilling(ArrayTwo);
        Method_7.checkAndMultiplyByTwo(ArrayThree,6);
        Method_8.fillingSquareArray(3);
        Method_9.createArray(5,2);
        Method_10.shiftArray(ArrayOne,-2);
    }
}
