public class MathCalculations {

    public static int calculations(int number1, int number2, String mathOperator) {
        switch (mathOperator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                return number1 / number2;
            default:
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.err.println("Некорректное выражение: недопустимый знак математической операции!");
                    System.exit(1);
                }
        }
        return 0;
    }
}



