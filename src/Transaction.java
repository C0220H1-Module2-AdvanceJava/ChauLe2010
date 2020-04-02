import java.util.Scanner;

public class Transaction {
    private int tradingCode;
    private int quantities;
    private String dayTrading;
    private double unitPrice;
    private double totalAmount;

    Scanner scanner = new Scanner(System.in);

    public Transaction() {
        this.tradingCode = 0;
        this.quantities = 0;
        this.dayTrading = "";
        this.unitPrice = 0;
        this.totalAmount = 0;
    }

    public Transaction(int tradingCode, int quantities, String dayTrading, double unitPrice, double totalAmount) {
        this.tradingCode = tradingCode;
        this.quantities = quantities;
        this.dayTrading = dayTrading;
        this.unitPrice = unitPrice;
        this.totalAmount = totalAmount;
    }

    public int getTradingCode() {
        return tradingCode;
    }

    public void setTradingCode(int tradingCode) {
        this.tradingCode = tradingCode;
    }

    public int getQuantities() {
        return quantities;
    }

    public void setQuantities(int quantities) {
        this.quantities = quantities;
    }

    public String getDayTrading() {
        return dayTrading;
    }

    public void setDayTrading(String dayTrading) {
        this.dayTrading = dayTrading;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void inputData() {
        System.out.println("Mã Giao Dịch: ");
        tradingCode = scanner.nextInt();
        System.out.println("Ngày Giao Dịch: ");
        dayTrading = scanner.next();
        System.out.println("Đơn Giá: ");
        unitPrice = scanner.nextDouble();
        System.out.println("Số lượng: ");
        quantities = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Thong Tin Giao Dich{"
                + "Mã Giao Dịch="
                + tradingCode
                + ", Khối Lượng Giao Dịch="
                + quantities
                + ", Ngày Giao Dịch='"
                + dayTrading
                + '\''
                + ", Đơn Giá="
                + unitPrice
                + '}';
    }
}
