package order;

public interface OrderState {
    void next();
    void previous();
    void cancel();
    void printStatus();
}

