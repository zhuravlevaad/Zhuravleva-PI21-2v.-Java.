// Реализовать консольный терминал ресторана для официантов.
// Официант выбирает свободный столик из списка, добавляет заказ (блюда из меню), 
// заказ может добавляться несколько раз на один столик, и может рассчитать столик 
// (вывод суммы заказов и список блюд на столик, столик изменяет статус на свободен)

package Restaurant;
import java.util.Scanner;

public class Restaurant {
 
    public static void main(String[] args) {
    // считываем информацию о том, на какой стол сделать заказ      
        Scanner vvod = new Scanner(System.in);
        int table_number;
 
        System.out.print("Введите номер столика, для добавления заказа: ");
        table_number = vvod.nextInt();
        
        System.out.print("Вы выбрали столик номер:" + table_number);
    }
}

class Tables {
   
    public static void main(String[] args) {
        // здесь я задала произвольные значения того, какие столы заняты, а какие свободны
        String table_1 = "Свободен";
        String table_2 = "Занят";
        String table_3 = "Свободен";
        String table_4 = "Занят";
        String table_5 = "Занят";

        int table1 = 1; 
        int table2 = 2;
        int table3 = 3;
        int table4 = 4;
        int table5 = 5;
        
        System.out.printf("Статусы столов: стол 1 - %s, стол 2 - %s, стол 3 - %s, стол 4 - %s, стол 5 - %s ", table_1, table_2, table_3, table_4, table_5);
    }
}

class Menu {
    
    public static void main(String[] args) {
    //  здесь я задала меню  
        dish_1 = "Мясо";
        dish_2 = "Рыба";
        dish_3 = "Птица";
}

// моя идея кода была следующая: я задала основные значения столов (номер, статус) и меню 
// и дальше путем изменения и подстановки значений переменных вывела бы общую информацию 
// о статусе столов (свободен/занят) и наличии заказов в одной строке
// но я не успела 
