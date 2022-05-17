public class BankAccount {
    private long number;
    private double balance;
    private String customerName;
    public String email;
    public long phoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
    }

//    public BankAccount(long number, double balance, String customerName, String email, long phoneNumber){
//        this.number = number;
//        this.balance = balance;
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        double current = getBalance();
        setBalance(current + depositAmount);
        System.out.println("Thank you for your " + depositAmount + " deposit. Your new balance is " + getBalance());
    }

    public void withdraw(double withdrawalAmount) {
        double current = getBalance();
        if (current < withdrawalAmount) {
            System.out.println("you have insufficient funds");
        } else {
            setBalance(current - withdrawalAmount);
            System.out.println(withdrawalAmount + " withdrawn, current balance : " + getBalance());
        }
    }
}
