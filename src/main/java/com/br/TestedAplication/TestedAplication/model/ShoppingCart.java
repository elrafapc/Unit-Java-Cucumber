package com.br.TestedAplication.TestedAplication.model;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Book> items;
    private double total;

    public ShoppingCart() {
        items = new ArrayList<Book>();
        total = 0.0;
    }

    public void add(Book b) {
        items.add(b);
        total += b.price;
    }

    public void remove(Book b) {
        items.remove(b);
        total -= b.price;
    }

    public void clear() {
        items.clear();
        total = 0.00;
    }

    public int countItems() {
        return items.size();
    }

    public double getTotal() {
        return total;
    }

}
