fun insertion_sort (arr: IntArray) {
    val arr_lenght = arr.size
    for (i in 1 until arr_lenght) {
        var lowest_value = arr[i]
        var j = i-1
        while (j >= 0 && arr[j] > lowest_value) {
            arr[j+1]=arr[j]
            j--
        }
        arr[j+1]=lowest_value
    }
}

fun main () {
    val arrList = intArrayOf(11, 30, -1, 2, 7, 12, 13, 20, 8)
    println("\nBefore Sort: ${arrList.joinToString(", ")}")
    insertion_sort(arrList)
    print("After Sort: ${arrList.joinToString(", ")}\n")
}