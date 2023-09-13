package Model;

import java.util.ArrayList;

public class Inventory extends Object{
//    access modifiers such as public, private, protected, default (no modifier) change whether this variable
//    is accessible outside of this class
    public String name;
    public double price;

    public Inventory(){

    }
    public Inventory(String name, double price){
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
