public class Main {
    public static void main(String[] arg) {
        // 1. Создайте строку через new - I study Basic Java!
        //Напишите метод, который принимает в качестве параметра строку,
        //передайте в этот метод строку, которую создали в п.1
        //Распечатать пред-последний символ строки. Используем метод String.charAt().
        //Вырезать строку Java c помощью метода String.substring().
        //Преобразуйте строку к верхнему регистру.
        //Преобразуйте строку к нижнему регистру.

        String s = new String("I study Basic Java!");

        printString(s);
//        printString("I study Basic FrontEnd");
        plus(arg);
        minus(arg);
        multiply(arg);
        division(arg);
    }

    public static void printString(String str22) {
        System.out.println(str22);
        System.out.println(str22.charAt(17));
        System.out.println(str22.substring(14, 18));
        System.out.println(str22.toLowerCase());
        System.out.println(str22.toUpperCase());

    }
    // 2.
    //Создайте методы с математическими операциями +, -, *, /
    //Каждый метод принимает два числа в параметрах и возвращает результат
    //Вызовите все методы в main
    //Результат распечатайте в консоль

    public static void plus(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println(a + b);
    }

    public static void minus(String[] args) {
        int a = 6;
        int b = 3;
        System.out.println(a - b);
    }

    public static void multiply(String[] args) {
        int a = 4;
        int b = 1;
        System.out.println(a * b);
    }

    public static void division(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println(a / b);
    }
}