import java.util.Scanner;

public class GoldTrading extends Transaction {
    private String typeGold;

    public GoldTrading() {
        super();
        this.typeGold = "";
    }

    public GoldTrading(int tradingCode, int quantities, String dayTrading, double unitPrice, double totalAmount, String typeGold) {
        super(tradingCode, quantities, dayTrading, unitPrice, totalAmount);
        this.typeGold = typeGold;
    }

    public String getTypeGold() {
        return typeGold;
    }

    public void setTypeGold(String typeGold) {
        this.typeGold = typeGold;
    }

    Scanner scanner = new Scanner(System.in);
    public void inputData1() {
        super.inputData();
        System.out.println("Loại Vàng Giao Dịch: ");
        typeGold = scanner.next();
    }


    public double totalAmount() {
        return this.getQuantities() * this.getUnitPrice();
    }

    @Override
    public String toString() {
        return "Giao Dich Vang: "
                + super.toString()
                + ", Loại Vàng: "
                + typeGold
                + ", Thành Tiền: "
                + totalAmount()
                + "]";
    }
}
