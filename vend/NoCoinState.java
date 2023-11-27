package vend;

public class NoCoinState implements State {

    private VendingMachine machine;

    public NoCoinState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin Inserted");
        machine.setState(machine.getCoinInsertedState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin to return.");
    }

    @Override
    public void pressButton() {
        System.out.println("Insert coin first.");
    }

    @Override
    public void dispense() {
        System.out.println("Payment required.");
    }
    
}
