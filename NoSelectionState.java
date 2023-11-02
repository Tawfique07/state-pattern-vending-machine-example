class NoSelectionState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public NoSelectionState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem() {
        System.out.println("Item selected");
        vendingMachine.setState(new HasSelectionState(vendingMachine));
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Please select an item first");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please select an item and insert money first");
    }
}

