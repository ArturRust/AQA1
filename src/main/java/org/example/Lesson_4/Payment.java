package org.example.Lesson_4;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    private final List<Item> items = new ArrayList<>();

    public void addItem(String name, double price, int quantity) {
        items.add(new Item(name, price, quantity));
    }

    public double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("Items purchased:");
        for (Item item : items) {
            System.out.println(item.getQuantity() + " x " + item.getName() + " @ $" + item.getPrice() + " each");
        }
        System.out.println("Total: $" + getTotal());
    }

    private class Item {

        private final String name;
        private final double price;
        private final int quantity;

        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }
}
