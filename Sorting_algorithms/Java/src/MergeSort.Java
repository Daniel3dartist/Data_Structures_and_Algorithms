import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static List<Integer> addAndConvert(int[] arr){
        List<Integer> newArr = new ArrayList<Integer>();
        for (int i:arr){
            newArr.add(i);
        }
        return newArr;
    }

    public static int[] arrMergeAgent(int[] left_arr, int[] right_arr){
        List<Integer> ord_arr = new ArrayList<Integer>();
        int left_index = 0;
        int right_index = 0;

        while (left_index < left_arr.length && right_index < right_arr.length){
            if (left_arr[left_index] <= right_arr[right_index]){
                ord_arr.add(left_arr[left_index]);
                left_index++;
            }else{
                ord_arr.add(right_arr[right_index]);
                right_index++;
            } 
        }
        ord_arr.addAll(addAndConvert(Arrays.copyOfRange(left_arr, left_index, left_arr.length)));
        ord_arr.addAll(addAndConvert(Arrays.copyOfRange(right_arr, right_index, right_arr.length)));
        return ord_arr.stream().mapToInt(i -> i).toArray();

    }
    
    public static int[] mergeSort(int[] arr){
        if (arr.length <= 1){
            return arr;
        } else{
            int cut_point = arr.length/2;
            int[] left = mergeSort(Arrays.copyOfRange(arr, 0, cut_point));
            int[] right = mergeSort(Arrays.copyOfRange(arr, cut_point, arr.length));
            
           return arrMergeAgent(left, right);
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
        int[] sorted_arr = mergeSort(_arr);
        printArr(sorted_arr);
        System.out.print("\n ");
    }
}