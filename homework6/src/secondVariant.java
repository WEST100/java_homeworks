// просто пробывал решить первую задачу через switch - не получилось!


public class secondVariant {
    public enum isSupermarktOpen {
        TRUE,
        FALSE
    }

    public static void main(String[] args) {

    isSupermarktOpen canBuy = isSupermarktOpen.FALSE;

    switch (canBuy) {
        case TRUE:
            System.out.println("Я могу купить еду, это " + canBuy);
        break;
        case FALSE:
            System.out.println("Я могу купить еду, это " + canBuy);
            break;
        default:
            System.out.println("");
    }


    }
}
