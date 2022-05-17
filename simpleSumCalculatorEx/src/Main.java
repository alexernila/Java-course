public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("Sustract= " + calculator.getSubstarctionResult());
        calculator.setFirstNumber(5.25);
        calculator. setSecondNumber(0);
        System.out.println("Multiply= " + calculator.getMultiplicationResult());
        System.out.println("Divide = " + calculator. getDivisionResult());
    }
}
