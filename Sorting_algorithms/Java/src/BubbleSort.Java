public class BubbleSort{
    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if (arr[j] > arr[j+1]){
                    int lowestNum = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = lowestNum;
                }
            }
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
        int[] sorted_arr = bubbleSort(_arr);
        printArr(sorted_arr);
        System.out.print("\n ");
    }
}

