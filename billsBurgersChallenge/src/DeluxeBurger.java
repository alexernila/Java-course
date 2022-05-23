public class DeluxeBurger extends Hamburger{
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items on deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items on deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items on deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items on deluxe burger");
    }

    public DeluxeBurger() {
        super("Deluxe", "Sausage and bacon", 4.55, "White");
        super.addHamburgerAddition1("Chips", 2.65);
        super.addHamburgerAddition2("Drink", 1.10);


    }
}
