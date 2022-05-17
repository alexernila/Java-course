public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber(double secondNumber){
        return this.secondNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }

    public double getSubstarctionResult(){
        return firstNumber-secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }

    public double getDivisionResult(){

        if(secondNumber != 0){
            return firstNumber/secondNumber;
        } else {
            return 0;
        }
    }


}
