package kg.iaau.kuraido.solutions;

public class InsertionSort {
    public static void main(String[] args) {
        int[] test = {1, 3, 5, 4, 8, 7, 6, 2, 9};

        int[] newArray = mergeSort(test);
        printArray(newArray);
    }

    private static int[] mergeSort(int[] array) {
        int[] arr = new int[array.length];

        int[] A = new int[array.length / 2];
        int[] B = new int[array.length - array.length / 2];
        System.arraycopy(array, 0, A, 0, A.length);
        System.arraycopy(array, A.length, B, 0, B.length);
        selectionSort(A);
        selectionSort(B);

        int i = 0;
        int j = 0;
        for (int k = 0; k < array.length; k++) {
            if (j < B.length) {
                if (A[i] > B[j]) {
                    arr[k] = j;
                    j++;
                }
            }else{
                if (i < A.length) {
                    if (A[i] > B[j]) {
                        arr[k] = i;
                        i++;
                    }
                }
            }

        }
        return arr;
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }

        }
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
