package calculator;

public class Calculator {
    public static Double add(Double a, Double b) {
        return a + b;
    }

    public static Double subtract(Double a, Double b) {
        return a - b;
    }

    public static Double multiply(Double a, Double b) {
        return a * b;
    }

    /**
     * @precondition b != 0
     * @postcondition a / b
     * @param a
     * @param b
     * @return
     */
    public static Double divide(Double a, Double b) {
        // if (b == 0) {
        //     throw new IllegalArgumentException();
        // }

        return a / b;
    }

    public static void main(String[] args) {
        Calculator.divide(1.0, 0.0);
    }

    public static Double sin(Double angle) {
        return Math.sin(angle);
    }

    public static Double cos(Double angle) {
        return Math.cos(angle);
    }

    /**
     * @precondition angle != 90, angle has to be in degrees
     * @postcondition tan(angle)
     * @param angle
     * @return
     */
    public static Double tan(Double angle) {
        return Math.tan(angle);
    }

}