// 11. Реализуйте метод, в который передается две целочисленные переменные и возвращает их среднее геометрическое
import java.util.Scanner;
public class Geometric_Mean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.sqrt(a*b));
    }
}
