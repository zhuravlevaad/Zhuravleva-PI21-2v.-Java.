// Выполнила: Журавлева Арина Дмитриевна ПИ21-2в
// Задача 1 (9.12)
// Дано натуральное число n. Выведите все числа от 1 до n.

public class One_To_N {
    public static String recursion(int n) {

        if (n == 1) {
            return "1";
        }
        // Шаг рекурсии 
        return recursion(n - 1) + " " + n;
    }
    public static void main(String[] args) {
        System.out.println(recursion(10)); // вызов рекурсивной функции
    }
}