import java.util.Scanner;

public class ManageTransactions {
    public static void main(String[] args) {
        ListTransaction listTransaction = new ListTransaction();
        Scanner scanner = new Scanner(System.in);

        int x;

        do {

            System.out.println("\n\t\t------------------------------------");
            System.out.println("\t\t|0. Thoat ung dung\t\t\t\t ");
            System.out.println("\t\t|1. Them Giao Dich Vang\t\t\t\t ");
            System.out.println("\t\t|2. Them Giao Dich Tien Te\t\t\t ");
            System.out.println("\t\t|3. Hien Thi Danh Sach Giao Dich\t\t ");
            System.out.println("\t\t|4. Xem Tong So Luong cua cac Giao Dich\t\t ");
            System.out.println("\t\t--------------------------------------");
            System.out.print("Xin mời lựa chọn: ");
            x = scanner.nextInt();
            switch (x) {
                case 1:
                    listTransaction.addTransaction(1);
                    break;
                case 2:
                    listTransaction.addTransaction(2);
                    break;
                case 3:
                    listTransaction.displayTransaction();
                    break;
                case 4:
                    listTransaction.totalTransaction();
                    break;
            }
        }while (x !=0);
        System.out.println("");
    }
}
