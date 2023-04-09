package org.example.Lesson_4;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food - n < 0) {
            System.out.println("В миске не может быть отрицательное количество еды!");
        } else {
            food -= n;
        }
    }

    public void addFood(int n) {
        food += n;
    }
}
