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
    public static void main(String[] arr){
        int[] arr_01 = {11, 30, -1, 2, 7, 12, 13, 20, 8};
        System.out.print("\nBefore sort: ");
        for (int i:arr_01){
            System.out.print(i+" ");
        }
        
        System.out.print("\nAfter Sort: ");
        int[] sorted_arr = selectionSort(arr_01);
        for (int i:sorted_arr){
            System.out.print(i+" ");
        }
        System.out.print("\n ");
    }
}
