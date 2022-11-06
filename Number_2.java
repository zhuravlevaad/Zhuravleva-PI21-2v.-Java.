// 4. Даны две переменные. Поменяйте значения переменных друг с другом двумя способами
public class Number_2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 9;
        int c = 5;
        int d = 3;
        int temp = a;
        a = b;
        b = temp;
        c = c + d;
        d = c - d;
        c = c - d;
        System.out.println("a = " + a + " b = " + b);
        System.out.println("c = " + c + " d = " + d);
    }
}
