public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int lowest_index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[lowest_index]){
                    lowest_index = j;
                }
            }
            int lowestNum = arr[lowest_index];
            arr[lowest_index] = arr[i];
            arr[i] = lowestNum;
        }
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
        int[] sorted_arr = selectionSort(_arr);
        printArr(sorted_arr);
        System.out.print("\n ");
    }
}
