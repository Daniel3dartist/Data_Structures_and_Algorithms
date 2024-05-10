import java.util.ArrayList;
import java.util.List;

public class QuickSort{
    public static int partition(int[] arr, int lowest_index, int highest_index){
        int pivot = arr[highest_index];
        int leftIndex = lowest_index;

        for (int i = lowest_index; i < highest_index; i++){
            if (arr[i] <= pivot){
                int tempVar = arr[leftIndex];
                arr[leftIndex] = arr[i];
                arr[i] = tempVar;
                leftIndex++;
            }
        }
        int tempVar = arr[leftIndex];
        arr[leftIndex] = arr[highest_index];
        arr[highest_index] = tempVar;
        return leftIndex;
    }
 

    public static void quickSort(int[] arr, int lowest_index, int highest_index){
        if (lowest_index < highest_index){
            int pivotIndex = partition(arr, lowest_index, highest_index);
            quickSort(arr, lowest_index, pivotIndex-1);
            quickSort(arr, pivotIndex+1, highest_index);
        }
    }
    
    public static void printArr(int[] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] arr){
        int[] _arr = {11, 30, -1, 2, 7, 12, 13, 20, 8};
        System.out.print("\nBefore sort: ");
        printArr(_arr);
        System.out.print("\nAfter Sort: ");
        quickSort(_arr, 0, _arr.length-1);
        printArr(_arr);
        System.out.print("\n ");
    }
}
