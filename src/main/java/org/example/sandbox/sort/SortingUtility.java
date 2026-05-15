package org.example.sandbox.sort;

/**
 * Utility class containing various sorting algorithms.
 * Implements Selection Sort, Insertion Sort, Bubble Sort, Quick Sort, and Merge Sort.
 */
public class SortingUtility {

    /**
     * Selection Sort implementation.
     * Time Complexity: O(n²)
     */
    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            T temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Insertion Sort implementation.
     * Time Complexity: O(n²)
     */
    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            T key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    /**
     * Bubble Sort implementation.
     * Time Complexity: O(n²)
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Quick Sort implementation.
     * Time Complexity: O(n log n) average, O(n²) worst case
     */
    public static <T extends Comparable<T>> void quickSort(T[] arr) {
        quickSortHelper(arr, 0, arr.length - 1);
    }

    private static <T extends Comparable<T>> void quickSortHelper(T[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortHelper(arr, low, pi - 1);
            quickSortHelper(arr, pi + 1, high);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] arr, int low, int high) {
        T pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    /**
     * Merge Sort implementation.
     * Time Complexity: O(n log n)
     */
    public static <T extends Comparable<T>> void mergeSort(T[] arr) {
        mergeSortHelper(arr, 0, arr.length - 1);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> void mergeSortHelper(T[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortHelper(arr, left, mid);
            mergeSortHelper(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> void merge(T[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Object[] leftArr = new Object[n1];
        Object[] rightArr = new Object[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (((T) leftArr[i]).compareTo((T) rightArr[j]) <= 0) {
                arr[k] = (T) leftArr[i];
                i++;
            } else {
                arr[k] = (T) rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = (T) leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = (T) rightArr[j];
            j++;
            k++;
        }
    }
}
