class DispensingState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem() {
        System.out.println("Item already selected and money inserted");
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Money already inserted");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item dispensed. Thank you!");
        vendingMachine.setState(new NoSelectionState(vendingMachine));
    }
}