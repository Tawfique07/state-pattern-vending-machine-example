public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(100);

        vendingMachine.selectItem();
        vendingMachine.insertMoney(50);
        vendingMachine.dispenseItem();

        vendingMachine.selectItem();
        vendingMachine.insertMoney(120);
        vendingMachine.dispenseItem();
    }
}