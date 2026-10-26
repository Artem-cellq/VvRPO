package com.vvrpo.laba3;

import java.util.ArrayList;
import java.util.List;

import com.vvrpo.laba3.hotdog.Berlinka;
import com.vvrpo.laba3.hotdog.HotDog;
import com.vvrpo.laba3.hotdog.HunterDog;
import com.vvrpo.laba3.hotdog.MasterDog;
import com.vvrpo.laba3.order.Order;
import com.vvrpo.laba3.product.Bun;
import com.vvrpo.laba3.product.Sausage;
import com.vvrpo.laba3.product.Sauce;

/**
 * Console application demonstrating the hot-dog accounting classes.
 * <p>
 * The application:
 * <ul>
 *   <li>creates hot dogs of each type (HunterDog, MasterDog, Berlinka),</li>
 *   <li>sells every type of hot dog,</li>
 *   <li>calculates the total sum of all orders,</li>
 *   <li>counts the number of full orders,</li>
 *   <li>calculates the average cost of orders.</li>
 * </ul>
 * </p>
 *
 * @author Student
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        // Requirement 3: sell every type of hot dog
        HotDog hunterDog = new HunterDog();
        HotDog masterDog = new MasterDog();
        HotDog berlinka = new Berlinka();

        System.out.println("=== Продажа хот-догов ===");
        System.out.println(hunterDog);
        System.out.println(masterDog);
        System.out.println(berlinka);

        // Build several orders (hot dogs + optionally separate components)
        List<Order> orders = new ArrayList<>();

        Order order1 = new Order(1);
        order1.addItem(hunterDog);
        order1.addItem(new Sauce("Кетчуп (доп.)", 0.50)); // component sold separately
        orders.add(order1);

        Order order2 = new Order(2);
        order2.addItem(masterDog);
        orders.add(order2);

        Order order3 = new Order(3);
        order3.addItem(berlinka);
        order3.addItem(new Bun("Булочка ржаная (доп.)", 2.00)); // component sold separately
        orders.add(order3);

        Order order4 = new Order(4);
        order4.addItem(new Sausage("Сосиска молочная", 2.00)); // only components -> not full
        order4.addItem(new Sauce("Горчица", 0.40));
        orders.add(order4);

        Order order5 = new Order(5);
        order5.addItem(new HunterDog());
        order5.addItem(new MasterDog());
        orders.add(order5);

        // Print all orders
        System.out.println("\n=== Все заказы ===");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Requirement 4: total sum of all orders
        double totalSum = orders.stream().mapToDouble(Order::getTotal).sum();
        System.out.printf("\nОбщая сумма всех заказов: %.2f BYN%n", totalSum);

        // Requirement 5: number of full orders
        long fullOrders = orders.stream().filter(Order::isFull).count();
        System.out.println("Количество полных заказов: " + fullOrders);

        // Requirement 6: average cost of orders
        double averageCost = totalSum / orders.size();
        System.out.printf("Средняя стоимость заказа: %.2f BYN%n", averageCost);
    }
}
