public class SortAlgorithm<E extends Comparable<E>> {
    private E[] array;

    public SortAlgorithm(E[] array) {
        this.array = array;
    }

    public SortAlgorithm() {
    }

    public E[] getArray() {
        return array;
    }

    public void setArray(E[] array) {
        this.array = array;
    }

    public E[] selectionSort() {
        if (array == null) {
            return null;
        }
        for (int mainPointer = 0; mainPointer < array.length - 1; mainPointer++) {
            E min = array[mainPointer];
            int indexOfMin = mainPointer;
            //Find min in un-sorted array
            for (int inner = mainPointer + 1; inner < array.length; inner++) {
                if (min.compareTo(array[inner]) > 0) {
                    min = array[inner]; // Change min to value found in un-sorted array
                    indexOfMin = inner;
                }
            }
            //Change position of new min value to the position of current pointer in sorted array
            if (indexOfMin != mainPointer) {
                array[indexOfMin] = array[mainPointer];
                array[mainPointer] = min;
            }
        }
        return array;
    }

    public void displayStepSelectionSort(E[] array) {
        int sortTimes;
        for (int mainPointer = 0; mainPointer < array.length - 1; mainPointer++) {
            sortTimes = mainPointer + 1;
            System.out.println("Loop: " + sortTimes);
            display(array);
            E min = array[mainPointer];
            int indexOfMin = mainPointer;
            //Find min in un-sorted array
            System.out.println("Un-sorted array: ");
            for (int index = 0; index < mainPointer; index++ ) {
                System.out.print("\t");
            }
            for (int index = mainPointer; index < array.length; index++) {
                System.out.print(array[index] + "\t");
            }
            System.out.println();
            for (int inner = mainPointer + 1; inner < array.length; inner++) {
                if (min.compareTo(array[inner]) > 0) {
                    min = array[inner]; // Change min to value found in un-sorted array
                    indexOfMin = inner;
                }
            }
            System.out.println("Pick min in Un-sorted array, min = " + min);
            //Change position of new min value to the position of current pointer in sorted array
            if (indexOfMin != mainPointer) {
                System.out.println("Swap min = "
                        + min
                        + " with first value in un-sorted array = "
                        + array[mainPointer]);
                array[indexOfMin] = array[mainPointer];
                array[mainPointer] = min;
            }
            System.out.println("List after the "
                    + sortTimes
                    + "'sort: ");
            display(array);
            System.out.println("-----------------------");
        }
    }

    public E[] bubbleSort() {
        if (array == null) {
            return null;
        }
        //Determine if the array is sorted and don't need to be sort again
        boolean needNextSort;
        for (int sortTimes = 1; sortTimes < array.length; sortTimes++) {
            needNextSort = false;
            for (int inner = 0; inner < array.length - sortTimes; inner++) {
                if (array[inner].compareTo(array[inner + 1]) > 0) {
                    //Swap two value
                    E temp = array[inner];
                    array[inner] = array[inner + 1];
                    array[inner + 1] = temp;
                    needNextSort = true;
                }
            }
            if (!needNextSort) {
                break;
            }
        }
        return array;
    }

    public void displayStepBubbleSort(E[] array) {
        //Determine if the array is sorted and don't need to be sort again
        boolean needNextSort;
        for (int sortTimes = 1; sortTimes < array.length; sortTimes++) {
            System.out.println("Loop: " + sortTimes);
            display(array);
            needNextSort = false;
            for (int currentPointer = 0; currentPointer < array.length - sortTimes; currentPointer++) {
                if (array[currentPointer].compareTo(array[currentPointer + 1]) > 0) {
                    //Swap two value
                    System.out.println("Swap "
                            + array[currentPointer]
                            + " with "
                            + array[currentPointer + 1]);
                    E temp = array[currentPointer];
                    array[currentPointer] = array[currentPointer + 1];
                    array[currentPointer + 1] = temp;
                    needNextSort = true;
                    display(array);
                }
            }
            if (!needNextSort) {
                System.out.println("Array may be sorted and doesn't need to continue ");
                break;
            }
            //Display the list after each sort
            System.out.println("List after the "
                    + sortTimes
                    + "'sort: ");
            display(array);
            System.out.println("-----------------------");
        }
    }

    public E[] insertionSort() {
        if (array == null) {
            return null;
        }
        E key;
        int insertPointer;
        for (int mainPointer = 1; mainPointer < array.length; mainPointer++) {
            key = array[mainPointer];
            for (insertPointer = mainPointer - 1; insertPointer >= 0 && array[insertPointer].compareTo(key) > 0; insertPointer--) {
                array[insertPointer + 1] = array[insertPointer];
            }
            array[insertPointer + 1] = key;
        }
        return array;
    }

    public void displayStepInsertionSort(E[] array) {
        E toSort;
        int currentPointer;
        for (int sortTimes = 1; sortTimes < array.length; sortTimes++) {
            toSort = array[sortTimes];
            System.out.println("Loop: " + sortTimes);
            display(array);
            System.out.println("Number need to sort = " + toSort);
            for (currentPointer = sortTimes - 1; currentPointer >= 0 && array[currentPointer].compareTo(toSort) > 0; currentPointer--) {
                System.out.println("Copy "
                        + array[currentPointer]
                        + " and paste to "
                        + array[currentPointer + 1]);
                array[currentPointer + 1] = array[currentPointer];
                display(array);
            }
            if (array[currentPointer + 1] != toSort) {
                System.out.println("Copy number need to sort = "
                        + toSort
                        + " and paste to "
                        + array[currentPointer + 1]);
                array[currentPointer + 1] = toSort;
            }
            System.out.println("List after the "
                    + sortTimes
                    + "'loop: ");
            display(array);
            System.out.println("-----------------------");
        }
    }

    public void display(E[] array) {
        for (E number : array) {
            System.out.print(number + "\t");
        }
        System.out.println();
    }
}
