public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("BNR");

        bank.addBranch("Iasi");
        bank.addCustomer("Iasi", "Silviu", 3342.66);
        bank.addCustomer("Iasi", "Ioana", 1123.44);
        bank.addCustomer("Iasi", "Anabel", 55.00);

        bank.addBranch("Brasov");
        bank.addCustomer("Brasov", "Ionut", 125.90);

        bank.addCustomerTransaction("Iasi", "Silviu", 44.33);
        bank.addCustomerTransaction("Iasi", "Ioana", 23.54);
        bank.addCustomerTransaction("Iasi", "Anabel", 8.10);

        bank.listCustomers("Iasi", true);
        bank.listCustomers("Brasov", true);
    }
}
