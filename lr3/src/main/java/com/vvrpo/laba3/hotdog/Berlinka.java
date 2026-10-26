package com.vvrpo.laba3.hotdog;

import java.util.Arrays;
import java.util.List;

import com.vvrpo.laba3.product.Bun;
import com.vvrpo.laba3.product.Component;
import com.vvrpo.laba3.product.Sausage;
import com.vvrpo.laba3.product.Sauce;
import com.vvrpo.laba3.product.Topping;

/**
 * Berlinka - variety of hot dog.
 * <p>
 * Composition: rye bun, hunter sausage, mustard, pickled cucumber, red onion.
 * </p>
 *
 * @author Student
 * @version 1.0
 */
public class Berlinka extends HotDog {

    /**
     * Constructs a Berlinka with its predefined components.
     */
    public Berlinka() {
        super("Berlinka", Arrays.asList(
                new Bun("Булочка ржаная", 2.00),
                new Sausage("Сосиска охотничья", 2.50),
                new Sauce("Горчица", 0.40),
                new Topping("Огурец маринованный", 0.60),
                new Topping("Лук красный", 0.50)
        ));
    }

    @Override
    public boolean isComplete() {
        List<Component> comps = getComponents();
        boolean hasBun = comps.stream().anyMatch(c -> c instanceof Bun);
        boolean hasSausage = comps.stream().anyMatch(c -> c instanceof Sausage);
        return hasBun && hasSausage;
    }
}
