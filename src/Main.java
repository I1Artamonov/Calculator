import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите выражение, используя только римские или только арабские, целые числа от 1(I) до 10(X), разделяя члены уравнения и математический знак пробелом.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String task = reader.readLine();
        String[] arrayTask = task.split(" ");

        if (arrayTask.length != 3) {
            System.err.println("Некорректное выражение: недопустимое количество членов выражения");
            System.exit(1);
        }

        String numbersLanguage = CheckCondition.getLanguage(arrayTask[0], arrayTask[2]);
        int number1 = Parsing.parsing(arrayTask[0], numbersLanguage);
        int number2 = Parsing.parsing(arrayTask[2], numbersLanguage);
        int result = MathCalculations.calculations(number1, number2, arrayTask[1]);

        if (numbersLanguage.equals("arabic"))
            System.out.println(result);
        else if (numbersLanguage.equals("roman")) {
            CheckCondition.checkRangeRomanNum(result);
            System.out.println(Parsing.parsingToRoman(result));
        }

    }
}
