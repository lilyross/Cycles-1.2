public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1 ");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Итерация цикла" + i);
        }
        System.out.println(" Задание 2 ");
        for (int i = 10; i >= 0; i --) {
            System.out.println ("Итерация цикла" + i);
        }
        System.out.println(" Задание 3 ");
        for (int i = 0; i < 17; i = i + 2){
            System.out.println(" Итерация цикла " + i);
        }
        System.out.println(" Задание 4 ");
        for (int i = 10; i >= -10; i--){
            System.out.println(" Интерация чисел " + i);
        }
        System.out.println(" Задание 1.2 ");
        for (int b = 1904; b <= 2096; b = b + 4){
            System.out.println( b + " Год является високосным ");
        }
        System.out.println(" Задание 2.2 ");
        for (int b = 7; b <= 98; b = b + 7){
            System.out.println(b);
        }
        System.out.println(" Задание 3.2 ");
        for (int b = 1; b <= 512; b = b * 2) {
            System.out.println(b);
        }
        System.out.println( " Задание 1.3 ");
        int salary = 29000;
        int total = 0;
        for ( int b = 1; b <= 12; b++) {
            total = total + salary;
            System.out.println(" Месяц " + b + " Сумма накоплений равна " + total + " Руб ");
        }
        System.out.println( " Задание 2.3 ");
        int salary1 = 29000;
        int total1 = 0;
        for ( int b = 1; b <= 12; b++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + salary1;
            System.out.println(" Месяц " + b + " Сумма накоплений равна " + total1 + " Руб");
        }
    }
}