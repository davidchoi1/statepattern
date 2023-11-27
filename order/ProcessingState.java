package order;

public class ProcessingState implements OrderState {
    private Order order;

    public ProcessingState(Order order) {
        this.order = order;
    }

    @Override
    public void next() {
        order.setState(new ShippedState(order));
    }

    @Override
    public void previous() {
        System.out.println("The order is in its initial state.");
    }

    @Override
    public void cancel() {
        order.setState(new CancelledState(order));
    }

    @Override
    public void printStatus() {
        System.out.println("Order is in processing state.");
    }
}

