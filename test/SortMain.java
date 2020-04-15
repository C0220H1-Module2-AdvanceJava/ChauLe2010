import java.util.Arrays;
import java.util.Scanner;

public class SortMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortAlgorithm<Integer> sortAlgorithm = new SortAlgorithm<>();
        int choice;
        boolean isValidChoice = true;
        boolean isExit = false;

        System.out.println("Enter integer list size: ");
        int size = scanner.nextInt();
        Integer[] list = new Integer[size];
        Integer[] copyList;
        System.out.println("Enter " + list.length + " values: ");
        for (int index = 0; index < list.length; index++) {
            System.out.print("Enter value at index " + index + ": ");
            list[index] = scanner.nextInt();
            System.out.println();
        }
        System.out.println("Your List here: ");
        sortAlgorithm.display(list);
        System.out.println("-----------------------");

        do {
            displayMenu();
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            if (choice < 0 || choice > 3) {
                System.out.println("Invalid choice!");
                isValidChoice = false;
            } else {
                isValidChoice = true;
            }
            if (isValidChoice) {
                System.out.println("-----------------------");
                System.out.println("BEGIN SORT SEQUENCE");
                System.out.println("-----------------------");
                switch (choice) {
                    case 1:
                        copyList = Arrays.copyOf(list,list.length);
                        sortAlgorithm.displayStepSelectionSort(copyList);
                        break;
                    case 2:
                        copyList = Arrays.copyOf(list,list.length);
                        sortAlgorithm.displayStepBubbleSort(copyList);
                        break;
                    case 3:
                        copyList = Arrays.copyOf(list,list.length);
                        sortAlgorithm.displayStepInsertionSort(copyList);
                        break;
                    case 0:
                        isExit = true;
                        System.out.println("Exit Program!");
                        break;
                }
            }
        } while (!isValidChoice || !isExit);
    }

    private static void displayMenu() {
        System.out.println("MENU");
        System.out.println("-----------------------");
        System.out.println("1.Display Selection Sort");
        System.out.println("2.Display Bubble Sort");
        System.out.println("3.Display Insertion Sort");
        System.out.println("0.Exit!");
    }
}
