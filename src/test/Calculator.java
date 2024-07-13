package test;

public class Calculator {
    public static void executeOperation( int x, int y, Operation operation) {
        int result = operation.apply(x, y);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        // Transmiterea metodei statice folosind o referinta la metoda
        executeOperation(5, 3, MathOperations::add);
        executeOperation(5, 3, MathOperations::subtract);

        // Sau, alternativ, folosind expresii lambda
        executeOperation(5, 3, (a, b) -> MathOperations.add(a, b));
        executeOperation(5, 3, (a, b) -> MathOperations.subtract(a, b));

    }

}
