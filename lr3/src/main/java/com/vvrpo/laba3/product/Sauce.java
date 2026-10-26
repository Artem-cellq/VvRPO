package com.vvrpo.laba3.product;

/**
 * Sauce component of a hot dog.
 * <p>
 * Can be sold separately or as part of a hot dog.
 * </p>
 *
 * @author Student
 * @version 1.0
 */
public class Sauce extends Component {

    /**
     * Constructs a sauce with the given name and price.
     *
     * @param name  the name of the sauce
     * @param price the price of the sauce
     */
    public Sauce(String name, double price) {
        super(name, price);
    }
}
