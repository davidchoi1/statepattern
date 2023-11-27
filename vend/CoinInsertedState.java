package vend;

public class CoinInsertedState implements State {
    
    private VendingMachine machine;

    public CoinInsertedState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted. Please select an item.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Coin returned.");
        machine.setState(machine.getNoCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("Item selected.");
        machine.setState(machine.getItemSelectedState());
    }

    @Override
    public void dispense() {
        System.out.println("Please select an item first.");
    }
}

