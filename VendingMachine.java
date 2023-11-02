public class VendingMachine {
    private VendingMachineState state;
    private int itemPrice;

    public VendingMachine(int price) {
        this.state = new NoSelectionState(this);
        this.itemPrice = price;
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public VendingMachineState getState() {
        return state;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void selectItem() {
        state.selectItem();
    }

    public void insertMoney(int amount) {
        state.insertMoney(amount);
    }

    public void dispenseItem() {
        state.dispenseItem();
    }
}