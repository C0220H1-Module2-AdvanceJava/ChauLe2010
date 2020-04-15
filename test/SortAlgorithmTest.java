import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortAlgorithmTest {
    @DisplayName("Sắp xếp lựa chọn với mảng Integer")
    @Test
    void testSelectionSortIntegerArray() {
        Integer[] numbers = {5,4,3,1,2,6};
        SortAlgorithm<Integer> sortAlgorithm = new SortAlgorithm<>(numbers);
        Integer[] expected = {1,2,3,4,5,6};
        Integer[] actual = sortAlgorithm.selectionSort();
        assertArrayEquals(expected,actual);
    }

    @DisplayName("Sắp xếp lựa chọn với mảng double có 1 phần tử trùng nhau")
    @Test
    void testSelectionSortDoubleArray() {
        Double[] numbers = {1.3,4.0,5.9,2.5,2.5,2.8,9.567};
        SortAlgorithm<Double> sortAlgorithm = new SortAlgorithm<>(numbers);
        Double[] expected = {1.3,2.5,2.5,2.8,4.0,5.9,9.567};
        Double[] actual = sortAlgorithm.selectionSort();
        assertArrayEquals(expected,actual);
    }

    @DisplayName("Sắp xếp lựa chọn với mảng String")
    @Test
    void testSelectionSortStringArray() {
        String[] strings = {"Cảm ơn","Thank you","Gracias","Arigato","Danke","Khobchai"};
        SortAlgorithm<String> sortAlgorithm = new SortAlgorithm<>(strings);
        String[] expected = {"Arigato","Cảm ơn","Danke","Gracias","Khobchai","Thank you"};
        String[] actual = sortAlgorithm.selectionSort();
        assertArrayEquals(expected,actual);
    }

    @DisplayName("Sắp xếp nổi bọt với mảng Integer")
    @Test
    void testBubbleSortIntegerArray() {
        Integer[] numbers = {5,4,3,1,2,6};
        SortAlgorithm<Integer> sortAlgorithm = new SortAlgorithm<>(numbers);
        Integer[] expected = {1,2,3,4,5,6};
        Integer[] actual = sortAlgorithm.bubbleSort();
        assertArrayEquals(expected,actual);
    }


    @DisplayName("Sắp xếp nổi bọt với mảng double có 1 phần tử trùng nhau")
    @Test
    void testBubbleSortDoubleArray() {
        Double[] numbers = {1.3,4.0,5.9,2.5,2.5,2.8,9.567};
        SortAlgorithm<Double> sortAlgorithm = new SortAlgorithm<>(numbers);
        Double[] expected = {1.3,2.5,2.5,2.8,4.0,5.9,9.567};
        Double[] actual = sortAlgorithm.bubbleSort();
        assertArrayEquals(expected,actual);
    }

    @DisplayName("Sắp xếp nổi bọt với mảng String")
    @Test
    void testBubbleSortStringArray() {
        String[] strings = {"Cảm ơn","Thank you","Gracias","Arigato","Danke","Khobchai"};
        SortAlgorithm<String> sortAlgorithm = new SortAlgorithm<>(strings);
        String[] expected = {"Arigato","Cảm ơn","Danke","Gracias","Khobchai","Thank you"};
        String[] actual = sortAlgorithm.bubbleSort();
        assertArrayEquals(expected,actual);
    }

    @DisplayName("Sắp xếp chèn với mảng Integer")
    @Test
    void testInsertionSortIntegerArray() {
        Integer[] numbers = {5,4,3,1,2,6};
        SortAlgorithm<Integer> sortAlgorithm = new SortAlgorithm<>(numbers);
        Integer[] expected = {1,2,3,4,5,6};
        Integer[] actual = sortAlgorithm.insertionSort();
        assertArrayEquals(expected,actual);
    }


    @DisplayName("Sắp xếp chèn với mảng double có 1 phần tử trùng nhau")
    @Test
    void testInsertionSortDoubleArray() {
        Double[] numbers = {1.3,4.0,5.9,2.5,2.5,2.8,9.567};
        SortAlgorithm<Double> sortAlgorithm = new SortAlgorithm<>(numbers);
        Double[] expected = {1.3,2.5,2.5,2.8,4.0,5.9,9.567};
        Double[] actual = sortAlgorithm.insertionSort();
        assertArrayEquals(expected,actual);
    }

    @DisplayName("Sắp xếp chèn với mảng String")
    @Test
    void testInsertionSortStringArray() {
        String[] strings = {"Cảm ơn","Thank you","Gracias","Arigato","Danke","Khobchai"};
        SortAlgorithm<String> sortAlgorithm = new SortAlgorithm<>(strings);
        String[] expected = {"Arigato","Cảm ơn","Danke","Gracias","Khobchai","Thank you"};
        String[] actual = sortAlgorithm.insertionSort();
        assertArrayEquals(expected,actual);
    }
}