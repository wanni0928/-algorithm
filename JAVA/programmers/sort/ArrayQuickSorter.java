package algorithm.sort;

import java.util.Arrays;

public class ArrayQuickSorter {
    public void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public void sort(int[] arr, int low, int high) {
        if(low >= high) return;

        int mid = partition(arr, low, high);
        sort(arr, low, mid - 1);
        sort(arr, mid, high);
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];
        while(low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
            if(low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

class Test {
    public static void main(String[] args) {
        int[] arr = {100, 1, 989, 213, 3124, 124, 12356, 12490309, 289734, 3143};
        new ArrayQuickSorter().quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
