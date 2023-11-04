class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        String display = operand1 + " " + operation + " " + operand2 + " = ";
        try {
            return switch (operation) {
                case "+" -> display + (operand1 + operand2);
                case "*" -> display + operand1 * operand2;
                case "/" -> display + operand1 / operand2;
                case "" -> throw new IllegalArgumentException("Operation cannot be empty");
                default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            };
        } catch (ArithmeticException a) {
            throw new IllegalOperationException("Division by zero is not allowed", a);
        }
    }
}
