package com.vvrpo.laba3.product;

/**
 * Abstract base class representing a product that can be sold.
 * <p>
 * Defines the common fields {@code name} and {@code price} shared by all
 * products in the hot-dog accounting system (both hot dogs and separate
 * components).
 * </p>
 *
 * @author Student
 * @version 1.0
 */
public abstract class Product {
    private String name;
    private double price;

    /**
     * Constructs a product with the given name and price.
     *
     * @param name  the name of the product
     * @param price the price of the product
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Returns the name of the product.
     *
     * @return the product name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the product.
     *
     * @param name the new product name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the price of the product.
     *
     * @return the product price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the product.
     *
     * @param price the new product price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f BYN", name, price);
    }
}
