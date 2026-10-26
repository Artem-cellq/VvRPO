package com.vvrpo.laba3.order;

import java.util.ArrayList;
import java.util.List;

import com.vvrpo.laba3.hotdog.HotDog;
import com.vvrpo.laba3.product.Product;

/**
 * Order containing products: hot dogs and/or separate components.
 * <p>
 * Provides methods to calculate the total order sum and determine whether
 * the order is "full". An order is considered full if it contains at least
 * one hot dog; an order consisting only of separate components is not full.
 * </p>
 *
 * @author Student
 * @version 1.0
 */
public class Order {
    private final int id;
    private final List<Product> items;

    /**
     * Constructs an order with the given identifier.
     *
     * @param id the order identifier
     */
    public Order(int id) {
        this.id = id;
        this.items = new ArrayList<>();
    }

    /**
     * Returns the order identifier.
     *
     * @return the order id
     */
    public int getId() {
        return id;
    }

    /**
     * Adds a product (hot dog or separate component) to the order.
     *
     * @param item the product to add
     */
    public void addItem(Product item) {
        items.add(item);
    }

    /**
     * Returns a copy of the list of products in this order.
     *
     * @return the list of order items
     */
    public List<Product> getItems() {
        return new ArrayList<>(items);
    }

    /**
     * Calculates the total cost of the order.
     *
     * @return total cost of all items in the order
     */
    public double getTotal() {
        return items.stream().mapToDouble(Product::getPrice).sum();
    }

    /**
     * Checks whether the order is full.
     * <p>
     * An order is full if it contains at least one hot dog. An order
     * consisting only of separate components is not full.
     * </p>
     *
     * @return {@code true} if the order is full, {@code false} otherwise
     */
    public boolean isFull() {
        return items.stream().anyMatch(HotDog.class::isInstance);
    }

    /**
     * Returns the number of items in the order.
     *
     * @return the item count
     */
    public int getItemCount() {
        return items.size();
    }

    @Override
    public String toString() {
        return String.format(
                "Заказ #%d: %d позиций, итог %.2f BYN, %s",
                id, getItemCount(), getTotal(),
                isFull() ? "полный" : "неполный");
    }
}
