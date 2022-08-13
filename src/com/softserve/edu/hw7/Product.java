package com.softserve.edu.hw7;

//Homework 7 (from 08.08.2022)
//        1) Створити клас Product з такими полями: назва продукту та ціна.
//        Клас повинен містити конструктор, гетери та сетери, методu toString(), equals().
//        В методі main створити масив з п'яти екземплярів типу Product. Можна захардкодити, наприклад:
//        Product products = {new Product("Coffee", 80), new Product("Bread", 20), ...};
//        Вивести на екран продукти, які повторюються (натайпати, щоб співпадіння були).
//        Для коду використати пакет com.softserve.edu.hw7
//        Запушати код на github у свою вітку.


public class Product {
    private String productName;
    private double amount;

    public Product(String productName, double amount) {
        this.productName = productName;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "Product [name=" + productName + ", amount=" + amount + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Product other = (Product) obj;
        if (amount != other.amount) return false;
        if (productName == null) {
            if (other.productName != null) return false;
        } else if (!productName.equals(other.productName)) return false;
            return true;
        }

    }


