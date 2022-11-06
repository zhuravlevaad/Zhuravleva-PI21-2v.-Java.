// 9. Реализуйте метод, который получает целое число на вход и возвращает разницу между данным числом и 21. Выведите значение на экран с различными целыми числами
import java.util.Scanner;
public class Minus21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a - 21);
    }
}
