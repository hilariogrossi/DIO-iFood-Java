public class Mensagem {
    public static void hourMessage(int hora) {
        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                messageMorning();
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                messageAfternoon();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                messageNigth();
                break;
            default:
                System.out.println("NÃO EXISTE ESSA HORA DO DIA!");
        }

    }

    public static void messageMorning() {
        System.out.println("BOM DIA!");
    }

    public static void messageAfternoon() {
        System.out.println("BOA TARDE!");
    }

    public static void messageNigth() {
        System.out.println("BOA NOITE!");
    }
}
