fun selection_sort (arr: IntArray) {
    val arr_lenght = arr.size

    for (i in 0 until arr_lenght) {
        var lowest_index = i

        for (j in i + 1 until arr_lenght) {
            if (arr[j] < arr[lowest_index]) {
                lowest_index = j
            }
        }
        val lowest_num = arr[lowest_index]
        arr[lowest_index] = arr[i]
        arr[i] = lowest_num
    }
}

fun main () {
    val arrList = intArrayOf(11, 30, -1, 2, 7, 12, 13, 20, 8)
    println("\nBefore Sort: ${arrList.joinToString(", ")}")
    selection_sort(arrList)
    println("After Sort: ${arrList.joinToString(", ")}\n")
}