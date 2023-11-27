package vend;

public class ItemDispensedState implements State {
    
    private VendingMachine machine;

    public ItemDispensedState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please take the item. Then you can insert another coin.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin to return.");
    }

    @Override
    public void pressButton() {
        System.out.println("Please take the item first.");
    }

    @Override
    public void dispense() {
        System.out.println("Item already dispensed.");
        machine.setState(machine.getNoCoinState());
    }
}
