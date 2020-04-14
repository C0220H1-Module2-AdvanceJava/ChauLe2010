package codegym.sorting;

public class SelectionSort {
    private int[] arr;

    public SelectionSort() {
    }

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }
    public int[] selectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            swapNumbers(arr, i, index);

            System.out.print("Iteration "+(i+1)+": ");
            printArray(arr);
        }
        return arr;
    }

    public void swapNumbers(int[] arr, int i, int index) {
        int smallerNumber = arr[index];
        arr[index] = arr[i];
        arr[i] = smallerNumber;
    }

    public void printArray(int arr[])
    {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
