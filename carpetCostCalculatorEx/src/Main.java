public class Main {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3);
        Floor floor = new Floor(3, 5);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println(calculator.getTotalCost());
    }
}
