package capgemini.lecture1;

//Thread-safe

//TODO implement all other operations (-, /, *) and add unit-tests
public class Calculator {

    public long sum(int firstOp, int secondOp) {
        return (long) firstOp + secondOp;
    }

    public long dif(int firstOp, int secondOp) {
        return (long) firstOp - secondOp;
    }

    public long multiply(int firstOp, int secondOp) {
        return (long) firstOp * secondOp;
    }

    public double divide(double firstOp, double secondOp) {
        if(secondOp == 0)
            throw new ArithmeticException("Can't divide by 0!");
        return firstOp / secondOp;
    }
}
