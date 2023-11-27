package vend;

class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.dispense(); // Will not dispense in default state (noCoinState)
        
        machine.insertCoin(); // Machine now in insertedCoinState

        machine.dispense(); // must select item first

        machine.pressButton(); // item selected

        machine.ejectCoin(); // coin cannot be returned after item selection

        machine.dispense(); // selected item dispensed - returns to default (noCoinState)
    }
}
