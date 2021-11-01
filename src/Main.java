public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int incomingTransfer = 1100;
        int bonusRuble = incomingTransfer / 100;
        short minimumPayment = 1000;
        int totalBalance = currentBalance + incomingTransfer + bonusRuble;
        if (incomingTransfer < minimumPayment) {
            totalBalance = currentBalance + incomingTransfer;
        }
        System.out.println(totalBalance);
    }
}
