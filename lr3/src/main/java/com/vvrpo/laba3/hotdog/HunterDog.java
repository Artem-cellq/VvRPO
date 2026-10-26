package com.vvrpo.laba3.hotdog;

import java.util.Arrays;
import java.util.List;

import com.vvrpo.laba3.product.Bun;
import com.vvrpo.laba3.product.Component;
import com.vvrpo.laba3.product.Sausage;
import com.vvrpo.laba3.product.Sauce;
import com.vvrpo.laba3.product.Topping;

/**
 * HunterDog - variety of hot dog.
 * <p>
 * Composition: wheat bun, hunter sausage, ketchup, fresh onion.
 * </p>
 *
 * @author Student
 * @version 1.0
 */
public class HunterDog extends HotDog {

    /**
     * Constructs a HunterDog with its predefined components.
     */
    public HunterDog() {
        super("HunterDog", Arrays.asList(
                new Bun("Булочка пшеничная", 1.50),
                new Sausage("Сосиска охотничья", 2.50),
                new Sauce("Кетчуп", 0.50),
                new Topping("Лук свежий", 0.50)
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
