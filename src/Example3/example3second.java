package Example3;

import java.util.Scanner; // импорт сканера

class TestSecond {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println ("Введите 2 любых целых числа: ");
        int number1 = k.nextInt();//считывает первое число и присваивает значение в number1
        int number2 = k.nextInt();//считывает второе число и присваивает значение в number2
        System.out.print(number1 * number2);//выводит сумму number1 + number2
    }
}
