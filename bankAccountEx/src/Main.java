public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setCustomerName("Andrew");
        System.out.println(bankAccount.getCustomerName());
        bankAccount.email = "asdw_44@gmail.com";
        System.out.println(bankAccount.email);
        bankAccount.phoneNumber = 746727123;
        System.out.println(bankAccount.phoneNumber);
        bankAccount.setBalance(6000);
        bankAccount.deposit(400);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(200);
        System.out.println(bankAccount.getBalance());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 21323);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Ggdkjsk", 433, "dsfds@gd");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());

    }
}
