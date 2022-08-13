package com.softserve.hw7;

import java.util.Objects;

public class Product {
    private String product_name;
    private int price;

    public Product(String product_name, int price) {
        this.product_name = product_name;
        this.price = price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_name='" + product_name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(product_name, product.product_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_name, price);
    }
}
