import java.util.Scanner;

public class HomeWork2 {
    public static void bank() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сколько у Вас на счету: ");
        int konto = sc.nextInt();
        System.out.println("У вас на счету " + konto);

        int del = 0;

        for (int delitel = 1; delitel < konto; delitel++) {
            if (konto % delitel == 0) {
                System.out.println("Это делитель. Вы можете снять: " + delitel);
                del = delitel;
            }

        }

        // это мои попытки что-то придумать дальше, но не получается, не могу понять логику...

//        int a = del;
//        System.out.println("это максимальный делитель " + a);
//
//        int sum = konto - a;
//
//
//        for (int i = 0; i < 1; i++) {
//            System.out.println("остаток " + sum);
//        }

//        int rez = 0;
//        while (konto > 0) {
//            if (konto-del !=0) {
//                rez = konto-del;
//                System.out.println(rez);
//            }
//
//            konto--;
//
//        }




        System.out.println("Какую сумму вы хотите снять?");
        Scanner sc2 = new Scanner(System.in);
        int moneyOff = sc2.nextInt();
        System.out.println("Вы снимаете " + moneyOff + " на счету осталось " + (konto - moneyOff));
    }
}
