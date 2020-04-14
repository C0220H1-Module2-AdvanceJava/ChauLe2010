package codegym.sorting;

import java.util.Scanner;

public class MainSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 4, 1, 9, -2};
        BubbleSortMain bs = new BubbleSortMain();
        SelectionSort ss = new SelectionSort();
        InsertionSort is = new InsertionSort();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("MENU");
            System.out.println("-----------------------");
            System.out.println("1.Display Bubble Sort");
            System.out.println("2.Display Selection Sort");
            System.out.println("3.Display Insertion Sort");
            System.out.println("0.Exit!");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Bubble Sort by Step: ");
                    bs.bubbleSort(arr);
                    break;
                case 2:
                    System.out.println("Selection Sort by Step: ");
                    ss.selectionSort(arr);
                    break;
                case 3:
                    System.out.println("Insertion Sort by Step: ");
                    is.insertionSort(arr);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
