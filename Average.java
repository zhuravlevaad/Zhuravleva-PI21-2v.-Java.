// 10. Реализуйте метод, в который передается две целочисленные переменные и возвращает их среднее арифметическое
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((a+b)/2);
    }
}
