import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  1. Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв
        //(проверьте количество букв в слове).
        //Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова.
        //распечатать на консоль.
        //Например:
        //ввод - mama, papa
        //вывод - mapa

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        int length = str.length();
        int halfLength = length / 2;
        int length2 = str2.length();
        int halfLength2 = length2 / 2;
        check(length, length2);
        System.out.printf(str.substring(halfLength));
        System.out.printf(str2.substring(halfLength2));

        // 2 task
        int num1 = 5;
        int num2 = 10;

        // метод void
        homeWorkPart2.getSum(num1, num2);
        homeWorkPart2.getMin(num1, num2);
        homeWorkPart2.getMult(num1, num2);
        homeWorkPart2.getDiv(num1, num2);


        // метод int
        homeWorkPart2 operation = new homeWorkPart2();
        int resultPlus = operation.getPlus(num1, num2);
        System.out.println("Return method plus: " + resultPlus);

        homeWorkPart2 operation2 = new homeWorkPart2();
        int resultMinus = operation2.getMinus(num1, num2);
        System.out.println("Return method minus: " + resultMinus);

        homeWorkPart2 operation3 = new homeWorkPart2();
        int resultMultiply = operation3.getMultiply(num1, num2);
        System.out.println("Return method multiply: " + resultMultiply);

        homeWorkPart2 operation4 = new homeWorkPart2();
        int resultDivision = operation4.getDivision(num1, num2);
        System.out.println("Return method division: " + resultDivision);

    }

    public static void check(int strNew, int str2New) {
        if (strNew % 2 == 0) {
            System.out.println("количество символов первого слова " + strNew);
        } else {
            System.out.println("Вы ввели нечетное первое слово. Введите четное ");
        }
        if (str2New % 2 == 0) {
            System.out.println("количество символов второго слова " + str2New);
        } else {
            System.out.println("Вы ввели нечетное второе слово. Введите четное");
        }
    }
}