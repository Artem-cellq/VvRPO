package com.vvrpo.laba3.product;

/**
 * Bun component of a hot dog.
 * <p>
 * Can be sold separately or as part of a hot dog.
 * </p>
 *
 * @author Student
 * @version 1.0
 */
public class Bun extends Component {

    /**
     * Constructs a bun with the given name and price.
     *
     * @param name  the name of the bun
     * @param price the price of the bun
     */
    public Bun(String name, double price) {
        super(name, price);
    }
}
