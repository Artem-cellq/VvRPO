package com.vvrpo.laba3.product;

/**
 * Sausage component of a hot dog.
 * <p>
 * Can be sold separately or as part of a hot dog.
 * </p>
 *
 * @author Student
 * @version 1.0
 */
public class Sausage extends Component {

    /**
     * Constructs a sausage with the given name and price.
     *
     * @param name  the name of the sausage
     * @param price the price of the sausage
     */
    public Sausage(String name, double price) {
        super(name, price);
    }
}
