package com.br.TestedAplication.TestedAplication.dom;

import java.util.ArrayList;

public class ShoppingCart {
    //addToCart, finalValueCart, removeBookCart
    private ArrayList<Book> items;
    private double total;

    public ShoppingCart() {
        items = new ArrayList<Book>();
        total = 0.0;
    }

    public void add(Book b){
        items.add(b);
        total += b.price;
    }

    public void remove(Book b){
        items.remove(b);
        total -= b.price;
    }

    public void clear(Book b){
        items.clear();
        total = 0.00;
    }

    public double getTotal(){
        return total;
    }

}
