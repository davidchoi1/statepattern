package vend;

public class VendingMachine {

    private State noCoinState;
    private State coinInsertedState;
    private State itemSelectedState;
    private State itemDispensedState;

    private State currentState;

    public VendingMachine() {
        noCoinState = new NoCoinState(this);
        coinInsertedState = new CoinInsertedState(this);
        itemSelectedState = new ItemSelectedState(this);
        itemDispensedState = new ItemDispensedState(this);
        currentState = noCoinState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }

    public void pressButton() {
        currentState.pressButton();
    }

    public void dispense() {
        currentState.dispense();
    }

    public State getCoinInsertedState() {
        return coinInsertedState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getItemSelectedState() {
        return itemSelectedState;
    }

    public State getItemDispensedState() {
        return itemDispensedState;
    }

}
