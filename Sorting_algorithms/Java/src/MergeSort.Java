public class MergeSort {
    public static int[] mergeSort(int[] arr){
        System.out.println("Merge Sort!");
        return arr;
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