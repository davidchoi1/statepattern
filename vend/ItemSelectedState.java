package vend;

public class ItemSelectedState implements State {
    
    private VendingMachine machine;

    public ItemSelectedState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Item already selected. Coin cannot be inserted.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Coin cannot be returned after item selection.");
    }

    @Override
    public void pressButton() {
        System.out.println("Item already selected. Dispensing item now.");
        dispense();
    }

    @Override
    public void dispense() {
        System.out.println("Item dispensed.");
        machine.setState(machine.getItemDispensedState());
    }
}
