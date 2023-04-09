package org.example.Lesson_5;

import java.util.ArrayList;

class Fruit {
}

class Apple extends Fruit {
}

class Orange extends Fruit {
}

class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            if (fruit instanceof Apple) {
                weight += 1.0f;
            } else if (fruit instanceof Orange) {
                weight += 1.5f;
            }
        }
        return weight;
    }

    public boolean compare(Box<?> otherBox) {
        return this.getWeight() == otherBox.getWeight();
    }

    public void transferFruits(Box<T> otherBox) {
        if (this == otherBox) {
            return;
        }
        for (T fruit : fruits) {
            if (otherBox.fruits.isEmpty() || otherBox.fruits.get(0).getClass() == fruit.getClass()) {

                otherBox.addFruit(fruit);
            } else {
                throw new IllegalArgumentException("Нельзя пересыпать фрукты разных типов в одну коробку!");
            }
        }
        fruits.clear();
    }
}
