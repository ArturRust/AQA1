package org.example;


public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        printColor();
        checkSumSign();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 5;
        int b = 3;
        if (a+b>=0){
            System.out.println("Сумма положительная");
        }
        else System.out.println("Сумма отрицательная");
    }

    public static void printColor(){
        int value = 85;
        if (value<=0){
            System.out.println("Красный");
        } else if (value<100 && value>0){
            System.out.println("Желтый");
        } else System.out.println("Красный");
    }

    public static void compareNumbers(){
        int a = 5;
        int b = 3;
        if (a>=b){
            System.out.println("a >= b");
        } else
            System.out.println("a < b");
    }
}