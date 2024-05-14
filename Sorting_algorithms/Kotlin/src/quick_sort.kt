fun swap_values(arr:IntArray, index_01: Int, index_02: Int) {
    var temp: Int = arr[index_01]
    arr[index_01] = arr[index_02]
    arr[index_02] = temp
}

fun partition (arr: IntArray, lowest_index: Int, highest_index: Int): Int {
    val pivot: Int = arr[highest_index]
    var left_index: Int = lowest_index
    for (i in lowest_index until highest_index) {
        if (arr[i] <= pivot) {
            swap_values(arr, left_index, i)
            left_index++
        }
    }
    swap_values(arr, left_index, highest_index)
    return left_index
}

fun quick_sort(arr: IntArray, lowest_index: Int, highest_index: Int): IntArray {
    if (lowest_index < highest_index) {
        val pivot_index = partition(arr, lowest_index, highest_index)
        quick_sort(arr, lowest_index, pivot_index-1)
        quick_sort(arr, pivot_index+1, highest_index)
    }
    return arr
}


fun main () {
    var arrList = intArrayOf(11, 30, -1, 2, 7, 12, 13, 20, 8)
    println("\nBefore Sort: ${arrList.joinToString(", ")}")
    arrList = quick_sort(arrList, 0, arrList.size-1)
    println("After Sort: ${arrList.joinToString(", ")}")
}