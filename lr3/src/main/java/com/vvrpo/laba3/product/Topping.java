package com.vvrpo.laba3.product;

/**
 * Topping component of a hot dog (e.g. onion, cheese, cucumber).
 * <p>
 * Can be sold separately or as part of a hot dog.
 * </p>
 *
 * @author Student
 * @version 1.0
 */
public class Topping extends Component {

    /**
     * Constructs a topping with the given name and price.
     *
     * @param name  the name of the topping
     * @param price the price of the topping
     */
    public Topping(String name, double price) {
        super(name, price);
    }
}
