package order;

public class ShippedState implements OrderState {
    private Order order;

    public ShippedState(Order order) {
        this.order = order;
    }

    @Override
    public void next() {
        order.setState(new DeliveredState(order));
    }

    @Override
    public void previous() {
        order.setState(new ProcessingState(order));
    }

    @Override
    public void cancel() {
        order.setState(new CancelledState(order));
    }

    @Override
    public void printStatus() {
        System.out.println("Order is shipped.");
    }
}

