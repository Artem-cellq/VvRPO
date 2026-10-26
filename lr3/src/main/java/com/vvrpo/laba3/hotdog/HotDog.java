package com.vvrpo.laba3.hotdog;

import java.util.ArrayList;
import java.util.List;

import com.vvrpo.laba3.product.Component;
import com.vvrpo.laba3.product.Product;

/**
 * Abstract class representing a hot dog composed of components.
 * <p>
 * A hot dog is a {@link Product} built from several {@link Component}s
 * (bun, sausage, sauce, toppings). Its price is calculated as the sum of
 * the prices of its components.
 * </p>
 *
 * @author Student
 * @version 1.0
 */
public abstract class HotDog extends Product {
    private final List<Component> components;

    /**
     * Constructs a hot dog with the given name and components.
     *
     * @param name       the name of the hot dog
     * @param components the list of components the hot dog consists of
     */
    public HotDog(String name, List<Component> components) {
        super(name, calculatePrice(components));
        this.components = new ArrayList<>(components);
    }

    /**
     * Calculates the total price of a hot dog as the sum of its components.
     *
     * @param components the list of components
     * @return the summed price
     */
    private static double calculatePrice(List<Component> components) {
        return components.stream().mapToDouble(Component::getPrice).sum();
    }

    /**
     * Returns a copy of the list of components of this hot dog.
     *
     * @return the list of components
     */
    public List<Component> getComponents() {
        return new ArrayList<>(components);
    }

    /**
     * Adds an extra component to the hot dog and increases its price.
     *
     * @param component the component to add
     */
    public void addComponent(Component component) {
        components.add(component);
        setPrice(getPrice() + component.getPrice());
    }

    /**
     * Checks whether the hot dog is complete.
     * <p>
     * A hot dog is considered complete if it contains at least one bun and
     * one sausage.
     * </p>
     *
     * @return {@code true} if the hot dog is complete, {@code false} otherwise
     */
    public abstract boolean isComplete();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" [");
        for (int i = 0; i < components.size(); i++) {
            sb.append(components.get(i).getName());
            if (i < components.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
