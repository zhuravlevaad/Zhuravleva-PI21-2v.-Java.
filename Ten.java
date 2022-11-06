// 7. Дано неотрицательное целое число. Найдите число десятков в его десятичной записи (то есть вторую справа цифру его десятичной записи).
public class Ten {
    public static void main(String[] args) {
        int a = 12345;
        int b = a / 10 % 10;
        System.out.println(b);
    }
}
