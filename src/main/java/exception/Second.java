package exception;

public class Second {
    public static void main(String[] args) {
        try {
            double result = divideByEven(10, 3);
            System.out.println("Результат деления: " + result);
        } catch (Exception e) {
            System.out.println("Обработка исключения: " + e.getMessage());
        }

        try {
            validateStringLength("Пример строки", 15);
        } catch (Exception e) {
            System.out.println("Обработка исключения: " + e.getMessage());
        }

        try {
            createObjectWithSpecificChars("OnlyLetters");
        } catch (Exception e) {
            System.out.println("Обработка исключения: " + e.getMessage());
        }

        try {
            double result = divideByEven(8, 2);
            System.out.println("Результат деления: " + result); // Эта строка не выполнится
        } catch (Exception e) {
            System.out.println("Обработка исключения: " + e.getMessage());
        }

        try {
            validateStringLength("Эта строка превышает максимальную длину", 10);
        } catch (Exception e) {
            System.out.println("Обработка исключения: " + e.getMessage());
        }

        try {
            createObjectWithSpecificChars("123");
        } catch (Exception e) {
            System.out.println("Обработка исключения: " + e.getMessage());
        }
    }
    // Метод, бросающий исключение при делении на четное число
    public static double divideByEven(int numerator, int denominator) throws Exception {
        if (denominator % 2 == 0) {
            throw new Exception("Деление на четное число запрещено!");
        }
        return (double) numerator / denominator;
    }

    // Метод, проверяющий длину строки и бросающий исключение при несоответствии
    public static void validateStringLength(String str, int maxLength) throws Exception {
        if (str.length() > maxLength) {
            throw new Exception("Превышена максимальная длина строки!");
        }
        System.out.println("Строка прошла валидацию: " + str);
    }

    // Метод, создающий объект с определенным набором символов
    public static void createObjectWithSpecificChars(String input) throws Exception {
        if (!input.matches("[a-zA-Z]+")) {
            throw new Exception("Неверный набор символов. Разрешены только буквы английского алфавита!");
        }
        System.out.println("Объект создан успешно: " + input);
    }


}


