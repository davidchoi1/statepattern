package order;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();

        order.printStatus(); // Processing State

        order.next();
        order.printStatus(); // Shipped State

        order.next();
        order.printStatus(); // Delivered State

        order.cancel(); // Cannot cancel, already delivered
        order.printStatus(); // Still in Delivered State
    }
}
