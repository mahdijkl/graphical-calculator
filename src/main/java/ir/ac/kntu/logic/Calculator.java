package ir.ac.kntu.logic;

/**
 * @author Mahdi Goudarzi
 */
public class Calculator {

    /**
     * @param operand1 left-handed-side operand.
     * @param operand2 right-handed-side operand.
     * @param operator operator to apply on operands.
     * @return result of the calculation
     */
    public static double calculate(double operand1, double operand2, Operator operator) {
        return switch (operator) {
            case PLUS -> operand1 + operand2;
            case MINUS -> operand1 - operand2;
            case DIVIDE -> operand1 / operand2;
            case MULTIPLY -> operand1 * operand2;
            default -> 0;
        };
    }
}
