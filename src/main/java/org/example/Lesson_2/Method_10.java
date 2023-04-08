package org.example.Lesson_2;

public class Method_10 {
    public static void shiftArray(int[] arr, int n) {
        int len = arr.length;
        // если n отрицательное, то преобразуем его в положительное смещение
        n = (n % len + len) % len;
        reverseArray(arr, 0, len-1);
        reverseArray(arr, 0, n-1);
        reverseArray(arr, n, len-1);
        printArray(arr);
    }

    // метод для переворачивания части массива от l до r включительно
    public static void reverseArray(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    // метод для вывода массива на консоль
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
