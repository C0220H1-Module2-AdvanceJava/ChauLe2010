package codegym.sorting;

public class BubbleSortMain {
    private int[] arr;

    public BubbleSortMain() {
    }

    public BubbleSortMain(int[] arr) {
        this.arr = arr;
    }
    public int[] bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    swapNumbers(arr, j);
                }
            }
            System.out.print("Iteration "+(i+1)+": ");
            printArray(arr);
        }
        return arr;
    }

    public void swapNumbers(int[] arr, int j) {
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }

    public void printArray(int arr[]) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
