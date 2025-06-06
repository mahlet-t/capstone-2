/**
 * Represents a topping for a sandwich (such as meat, cheese, or regular toppings).
 * Handles the calculation of the topping price based on size and whether it's extra.
 */
package com.pluralsight.models;
public class Topping {
    private final String name;
    private final String type;
    private final boolean isExtra;
    private final int size;

   // Constructor to initialize a topping.
    public Topping(String name, String type, boolean isExtra, int size) {
        this.name=name;
        this.type = type;
        this.isExtra = isExtra;
        this.size = size;
    }
    public String getName() {
        return name;
    }

    /** Calculates and returns the price of
     * the topping base on its type,size,and if it's extra
     * return the price of the topping
     */
    public double getPrice() {
        double price = 0;
        if (type.equalsIgnoreCase("Meat")) {
            if (size == 4) {
                price += 1.00;
            } else if (size == 8) {
                price += 2.00;
            } else if (size == 12) {
                price += 3;
            }
            if (isExtra && size == 4) {
                price += 0.50;
            } else if (isExtra && size == 8) {
                price += 1.00;
            } else if (isExtra && size == 12) {
                price += 1.50;
            }

        } else if (type.equalsIgnoreCase("Cheeses")) {

            if (size == 4) {
                price += 0.75;
            } else if (size == 8) {
                price += 1.50;
            } else if (size == 12) {
                price += 2.25;
            }
            if (isExtra && size == 4) {
                price += 0.30;
            } else if (isExtra && size == 8) {
                price += 0.60;
            } else if (isExtra && size == 12) {
                price += 0.90;
            }
        }
        return price;
    }
    @Override
    public String toString() {
        return   name;
    }
}
