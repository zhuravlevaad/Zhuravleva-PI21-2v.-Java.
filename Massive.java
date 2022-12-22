// Выполнила: Журавлева Арина Дмитриевна ПИ21-2в
// Задача 2 (9.12)
// Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
// Используйте перебор и двоичный поиск для решения этой задачи. 
// Сравните время выполнения обоих решений для больших массивов (например, 100000000 элементов).

import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод считывания с клавиатуры
        System.out.print("Enter size massive - ");
        int N = in.nextInt();
        int[] mass = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter number in massive - ");
            int a = in.nextInt();
            mass[i] = a;
        }
        int temp = 0;
        System.out.print("Enter number - ");
        int m = in.nextInt();
        for (int i = 0; i < mass.length; i++) {
            if (m == mass[i]) {
                temp = mass[i];
            }
        }
        System.out.print("Число вошедшее в массив: " + temp);
    }
}