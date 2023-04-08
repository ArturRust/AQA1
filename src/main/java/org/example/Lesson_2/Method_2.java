package org.example.Lesson_2;

public class Method_2 {
    private static final int[] ArrayOne = new int[]{3, 5,6,1};
    private static final int[] ArrayTwo = new int[100];
    private static final int[] ArrayThree = new int[]{ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(MethodSeven.checkAndMultiplyByTwo(ArrayThree,6)));
//        Method8.fillingSquareArray(3);
//        Method9.createArray(5, 8);
        Method_10.shiftArray(ArrayOne,-2);
    }
    public static void checkOfPositive(int a){
        if (a>=0){
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
}
