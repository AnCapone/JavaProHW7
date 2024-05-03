import coffee.order.CoffeeOrderBoard;

public class Main {
    public static void main(String[] args) {

        CoffeeOrderBoard coffeeOrders = new CoffeeOrderBoard();
        coffeeOrders.add("Bob");
        coffeeOrders.add("Charlie");
        coffeeOrders.add("David");
        coffeeOrders.add("Eve");
        coffeeOrders.add("Frank");
        coffeeOrders.add("Grace");
        coffeeOrders.draw();
        System.out.println();
        coffeeOrders.deliver();
        coffeeOrders.add("Heidi");
        coffeeOrders.draw();
        System.out.println();
        coffeeOrders.deliver(3);
        coffeeOrders.add("Ivan");
        coffeeOrders.deliver();
        coffeeOrders.deliver(5);
        coffeeOrders.deliver(8);
        coffeeOrders.deliver(9);
        coffeeOrders.draw();

    }
}