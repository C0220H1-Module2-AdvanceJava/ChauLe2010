public class ListTransaction {
    Transaction transaction[] = new Transaction[1000];
    private int countTransaction;
    private int sumGold = 0;
    private int sumForeignEx = 0;
    private int count = 0;
    private int sumTransactionAmount = 0;

    public ListTransaction() {
        countTransaction = 0;
        for (int i = 0; i < 1000; i++) {
            transaction[i] = new Transaction();
        }
    }

    public void addTransaction(int temp) {
        if (countTransaction > 1000) {
            System.out.println("Bộ nhớ đã đầy, không thể thêm giao dịch mới nữa: ");
        }
        else
            {
                if (temp == 1) {
                    transaction[countTransaction] = new GoldTrading();
                    GoldTrading goldTrading = new GoldTrading();
                    goldTrading.inputData1();
                    sumGold += goldTrading.getQuantities();
                }
                else {
                    transaction[countTransaction] = new ForeignExchangeTransactions();
                    ForeignExchangeTransactions foreignExchangeTransactions = new ForeignExchangeTransactions();
                    foreignExchangeTransactions.inputData2();
                    sumForeignEx += foreignExchangeTransactions.getQuantities();
                }
            }
        countTransaction++;
    }

    public void displayTransaction () {
        for (int i = 0; i < countTransaction; i++) {
            System.out.println("Danh sach Giao Dich: " + (i+1));
            System.out.println(transaction[i].toString());
        }
    }

    public void totalTransaction() {
        System.out.println("Tổng số lượng của giao dịch Vàng: " + sumGold);
        System.out.println("Tổng số lượng của giao dịch Tiền Tệ " + sumForeignEx);
    }
}
