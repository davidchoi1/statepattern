package order;

public class DeliveredState implements OrderState {
    private Order order;

    public DeliveredState(Order order) {
        this.order = order;
    }

    @Override
    public void next() {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void previous() {
        order.setState(new ShippedState(order));
    }

    @Override
    public void cancel() {
        System.out.println("Order is already delivered and cannot be cancelled.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is delivered to the customer.");
    }
}

