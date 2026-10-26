package com.vvrpo.laba3.product;

/**
 * Component of a hot dog (bun, sausage, sauce, topping).
 * <p>
 * Components can be sold separately as well as included in a hot dog.
 * This demonstrates composition: a {@link com.vvrpo.laba3.hotdog.HotDog}
 * is composed of several {@link Component}s.
 * </p>
 *
 * @author Student
 * @version 1.0
 */
public abstract class Component extends Product {

    /**
     * Constructs a component with the given name and price.
     *
     * @param name  the name of the component
     * @param price the price of the component
     */
    public Component(String name, double price) {
        super(name, price);
    }
}
