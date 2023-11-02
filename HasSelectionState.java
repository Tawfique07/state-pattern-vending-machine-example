class HasSelectionState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public HasSelectionState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem() {
        System.out.println("Item already selected");
    }

    @Override
    public void insertMoney(int amount) {
        if (amount >= vendingMachine.getItemPrice()) {
            System.out.println("Money inserted. Please dispense the item.");
            vendingMachine.setState(new DispensingState(vendingMachine));
        } else {
            System.out.println("Insufficient money inserted");
        }
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please insert money first");
    }
}
