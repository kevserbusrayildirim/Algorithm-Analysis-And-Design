
import java.util.Arrays;

/**
 *
 * @author kevser
 */

public class HoaresPartitions {

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Partition using Hoare's Partitioning scheme
    public static int HoarePartition(int[] a, int low, int high) {
        int pivot = a[low];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (a[i] < pivot);

            do {
                j--;
            } while (a[j] > pivot);

            if (i >= j) {
                return j;
            }

            swap(a, i, j);
        }
    }
 
    public static void quicksortHoares(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = HoarePartition(a, low, high);
        //elements less than the pivot
        quicksortHoares(a, low, pivot);
        //elements more than the pivot
        quicksortHoares(a, pivot + 1, high);
    }

}
