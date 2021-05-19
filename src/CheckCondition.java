public class CheckCondition {

    public static String getLanguage(String number1, String number2) {
        String languageNumber1 = languageDetection(number1);
        String languageNumber2 = languageDetection(number2);

        try {
            if (languageNumber1.equals("arabic") && languageNumber2.equals("arabic"))
                return "arabic";
            else if (languageNumber1.equals("roman") && languageNumber2.equals("roman"))
                return "roman";
        } catch (NullPointerException e) {
            System.err.println("Некорректное выражение: недопустимые символы или числа вне допустимого диапазона!");
            System.exit(1);
        }
        return null;
    }

    private static String languageDetection(String number) {
        String[] arabicNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] romanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        for (int i = 0; i < 10; i++) {
            if (number.equals(arabicNumbers[i]))
                return "arabic";
            else if (number.equals(romanNumbers[i]))
                return "roman";
        }
        return null;
    }

    public static void checkRangeRomanNum(int result) {
        if (result < 1) {
            System.err.println("В римских числах не существует нуля и отрицательных чисел.");
            System.exit(1);
        }

    }

}


