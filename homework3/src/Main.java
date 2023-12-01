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

        int a = sum(1, 2);
        System.out.println(a);
        int b = minus(2, 1);
        System.out.println(b);
        int c = multiply(2, 2);
        System.out.println(c);
        int d = division(4, 2);
        System.out.println(d);
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

    static int sum(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
    static int division(int a, int b) {
        return a / b;
    }
}