package Zmisc;
import java.util.Arrays;

class sorting {
    public static void main(String[] args) {
        int arr[] = { 1312, 4, 13, 124, 43, -1, 4, 15, 0 };
        arr=mergesort(arr); 
        // bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    // BUBBLE SORT
    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);

                }
            }
        }
    }

    // SELECTION SORT
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start; i <= end; ++i) {
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // CYCLIC SORT
    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else
                ++i;
        }
    }

    // INSERTION SORT
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = i + 1; j > 0; --j) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else
                    break;
            }
        }
    }

    // BUBBLE SORT USING RECURSION
    static void bubble1(int[] arr, int i, int j) {
        if (i == arr.length - 1)
            return;
        if (j < arr.length - i - 1) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
            }
            bubble1(arr, i, j + 1);
        } else {
            bubble1(arr, i + 1, 0);
        }
    }

    // MERGE SORT
    static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                ++i;
            } else {
                mix[k] = second[j];
                ++j;
            }
            ++k;
        }
        while (i < first.length) {
            mix[k] = first[i];
            ++i;
            ++k;
        }
        while (j < second.length) {
            mix[k] = second[j];
            ++j;
            ++k;
        }
        return mix;
    }

    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int swapper = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = swapper;

    }
}