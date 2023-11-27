package order;

public class CancelledState implements OrderState {
    private Order order;

    public CancelledState(Order order) {
        this.order = order;
    }

    @Override
    public void next() {
        System.out.println("Order is cancelled and cannot proceed.");
    }

    @Override
    public void previous() {
        System.out.println("Order is cancelled and cannot go back to the previous state.");
    }

    @Override
    public void cancel() {
        System.out.println("Order is already cancelled.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order has been cancelled.");
    }
}

