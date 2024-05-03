package coffee.order;

import java.util.LinkedHashMap;
import java.util.Map;


public class CoffeeOrderBoard {
    private LinkedHashMap<Integer, Order> orders = new LinkedHashMap<>();
    private int counter = 0;

    public void add(String name) {
        int number = counter + 1;
        counter++;
        orders.put(number, new Order(name, number));
    }

    public void deliver() {
        int firstKey = orders.keySet().iterator().next();
        orders.remove(firstKey);
    }

    public void deliver(int number) {
        if (orders.containsKey(number)) {
            orders.remove(number);
        }
    }

    public void draw() {
        orders.forEach((number, order) -> System.out.println(number + " | " + order.getName()));
    }
}
