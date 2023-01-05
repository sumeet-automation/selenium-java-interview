import java.util.function.DoubleBinaryOperator;

public enum Operation {
    PLUS("+", (x,y)-> x+y),
    MINUS("-",(x,y)-> x-y),
    MULTIPLY("*",(x,y)-> x*y),
    DIVIDE("/",(x,y)-> x/y),
    MODULUS("%",(x,y)->x%y),
    POWER("^", Math::pow);

    private final DoubleBinaryOperator operator;
    private final String symbol;

    public DoubleBinaryOperator getOperator() {
        return operator;
    }

    public String getSymbol() {
        return symbol;
    }

    Operation(String symbol, DoubleBinaryOperator operator) {
        this.symbol = symbol;
        this.operator = operator;
    }

    public double compute(double x, double y) {
        return operator.applyAsDouble(x, y);
    }

    public static void main(String[] args) {
        System.out.println(Operation.PLUS.compute(10, 20));
        System.out.println(Operation.MODULUS.compute(20, 3));
        System.out.println(Operation.MINUS.symbol);
    }

}
