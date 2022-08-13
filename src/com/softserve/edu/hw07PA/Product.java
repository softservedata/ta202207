package com.softserve.edu.hw07PA;

import java.util.Objects;

public class Product {
    // Fields:
    private String Name;
    private float Price;

    // Constructor:
    public Product(String name, float price) {
        this.Name = name;
        this.Price = price;
    }

  // Getters & Setters:
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    // Methods toString, equals:

    @Override
    public String toString() {
        return " Name: " +
                 Name +
                " | Price: " + Price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Float.compare(product.Price, Price) == 0 && Name.equals(product.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Price);
    }
}
