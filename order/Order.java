package order;

public class Order {
    private OrderState currentState;

    public Order() {
        this.currentState = new ProcessingState(this); // default state
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void next() {
        this.currentState.next();
    }

    public void previous() {
        this.currentState.previous();
    }

    public void cancel() {
        this.currentState.cancel();
    }

    public void printStatus() {
        this.currentState.printStatus();
    }
}
