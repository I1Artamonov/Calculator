public class Parsing {
    static String[] romanNumbers = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    static String[] romanDecNumbers = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};

    public static int parsing(String number, String language) {

        try {
            if (language.equals("arabic"))
                return Integer.parseInt(number);
            else if (language.equals("roman")) {
                for (int i = 1; i <= 10; i++)
                    if (number.equals(romanNumbers[i]))
                        return (i);
            }
        } catch (NullPointerException e) {
            System.err.println("Некорректное выражение: недопустимо использование римских и арабских чисел в одном выражении!");
            System.exit(1);
        }
        return 0;
    }

    public static String parsingToRoman(int result) {
        for (int i = 0; i <= 100; i += 10) {
            if (result >= i && result < i + 10)
                return romanDecNumbers[i / 10] + romanNumbers[result - i];
        }
        return null;


    }


}

