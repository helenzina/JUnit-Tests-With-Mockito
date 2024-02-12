public class Calculator {

    CalculatorService calculatorService;
    public Calculator(CalculatorService calculatorService){
        this.calculatorService= calculatorService;
    }

    public int add(int x, int y){
        return x+y;
    }

    public int subtract(int x, int y){
        return x-y;
    }

    public int multiply(int x, int y){
        return x*y;
    }

    public double divide(int x, int y){
        return (double) x /y;
    }

}
