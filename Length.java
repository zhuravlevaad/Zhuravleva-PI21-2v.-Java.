// 12. Реализуйте метод, в который передается 4 числа с плавающей точкой. Первые два числа – координаты x, y первой точки. Вторые два числа – координаты x,y второй точки. Найти расстояние между двумя точками
import java.util.Scanner;
public class Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println(Math.sqrt((x1*x1-2*x1*x2+x2*x2)+(y1*y1-2*y1*y2+y2*y2)));
    }
}

