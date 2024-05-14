fun booble_sort (arr: IntArray) {
    val arr_lenght = arr.size
    for (i in 0 until arr_lenght - 1) {
        for (j in 0 until arr_lenght - 1) {
            if (arr[j] > arr[j+1]) {
                val lowest_num = arr[j+1]
                arr[j+1] = arr[j]
                arr[j] = lowest_num
            }
        }
    }
}


fun main () {
    val arrList = intArrayOf(11, 30, -1, 2, 7, 12, 13, 20, 8)
    println("\nBefore Sort: ${arrList.joinToString(", ")}")
    booble_sort(arrList)
    println("After Sort: ${arrList.joinToString(", ")}")
}