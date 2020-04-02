import java.util.Scanner;

public class ForeignExchangeTransactions extends Transaction {
    private int currency;
    private float exchangeRate;

    public ForeignExchangeTransactions() {
        super();
        this.currency = 0;
        this.exchangeRate = 0;
    }

    public ForeignExchangeTransactions(int tradingCode, int quantities, String dayTrading, double unitPrice, double totalAmount, int currency, float exchangeRate) {
        super(tradingCode, quantities, dayTrading, unitPrice, totalAmount);
        this.currency = currency;
        this.exchangeRate = exchangeRate;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public float getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    Scanner scanner = new Scanner(System.in);

    public void inputData2() {
        super.inputData();
        System.out.println("Tỷ Giá Hối Đoái: ");
        exchangeRate = scanner.nextFloat();
        System.out.println("Loại Tiện Giao Dịch: ");
        currency = scanner.nextInt();
    }

    public double totalAmount() {
        if (currency == 1)
            return this.getQuantities() * this.getUnitPrice();
        else
            return this.getQuantities() * this.getUnitPrice() * this.exchangeRate;
    }

    @Override
    public String toString() {
        String temp;
        if (currency == 1)
            temp = "VND";
        else if (currency == 2)
            temp = "USD";
        else
            temp = "EURO";
        return "Giao Dịch Tiền Tệ: "
                + super.toString()
                + "' Tỉ Giá: "
                + exchangeRate
                + ", Loại Tiền Tệ: "
                + temp
                + ", "
                + "Thành Tiền: "
                + totalAmount()
                + "]";
    }
}
