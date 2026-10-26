package com.vvrpo.laba3.hotdog;

import java.util.Arrays;
import java.util.List;

import com.vvrpo.laba3.product.Bun;
import com.vvrpo.laba3.product.Component;
import com.vvrpo.laba3.product.Sausage;
import com.vvrpo.laba3.product.Sauce;
import com.vvrpo.laba3.product.Topping;

/**
 * MasterDog - variety of hot dog.
 * <p>
 * Composition: sesame bun, milk sausage, mayonnaise, cheese.
 * </p>
 *
 * @author Student
 * @version 1.0
 */
public class MasterDog extends HotDog {

    /**
     * Constructs a MasterDog with its predefined components.
     */
    public MasterDog() {
        super("MasterDog", Arrays.asList(
                new Bun("Булочка с кунжутом", 2.00),
                new Sausage("Сосиска молочная", 2.00),
                new Sauce("Майонез", 0.40),
                new Topping("Сыр", 1.00)
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
