public class InsertionSort{
    public static int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int lowest_value = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > lowest_value){
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=lowest_value;
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
        int[] sorted_arr = insertionSort(_arr);
        printArr(sorted_arr);
        System.out.print("\n ");
    }
}