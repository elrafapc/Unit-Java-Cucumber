package com.br.TestedAplication.TestedAplication;

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

    double getTotal(){
        return total;
    }

}
