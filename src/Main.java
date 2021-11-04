public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int incomingTransfer = 1100;
        int bonusRuble;
        if (incomingTransfer > 1000) {
            bonusRuble = incomingTransfer / 100;
        } else {
            bonusRuble = 0;
        }
        int totalBalance = currentBalance + incomingTransfer + bonusRuble;
        System.out.println(totalBalance);
    }
}
