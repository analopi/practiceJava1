package exception;

public class CustomException extends Exception{
    public CustomException(String message) {
        super(message);
    }
}
class ExceptionDemo {


    public static void throwCustomException(boolean shouldThrow) {
        try {
            if (shouldThrow) {
                throw new CustomException("Произошла исключительная ситуация!");
            } else {
                System.out.println("Метод выполнен успешно.");
            }
        } catch (CustomException e) {

            System.err.println("Перехвачено исключение: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Вызываем метод, который может бросить исключение
        throwCustomException(true);

        // Вызываем метод, который не бросает исключение
        throwCustomException(false);
    }
}