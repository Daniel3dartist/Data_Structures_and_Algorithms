fun arr_merge_agent(left_arr: IntArray, right_arr: IntArray): IntArray {
    var ord_arr = mutableListOf<Int>()
    var left_idx = 0
    var right_idx = 0

    while (left_idx < left_arr.size && right_idx < right_arr.size) {
        if (left_arr[left_idx] <= right_arr[right_idx]) {
            ord_arr.add(left_arr[left_idx])
            left_idx++
        } else {
            ord_arr.add(right_arr[right_idx])
            right_idx++
        }
    }
    ord_arr.addAll(left_arr.toList().toMutableList().subList(left_idx, left_arr.size))
    ord_arr.addAll(right_arr.toList().toMutableList().subList(right_idx, left_arr.size))
    return ord_arr.toList().toIntArray()
}


fun merge_sort (arr: IntArray): IntArray {
    if (arr.size <= 1 ) {
        return arr
    } else {
        val cut_point = arr.size / 2
        var left = merge_sort(arr.copyOfRange(0, cut_point))
        var right = merge_sort(arr.copyOfRange(cut_point, arr.size))
        return arr_merge_agent(left, right)
    }
}


fun main () {
    var arrList = intArrayOf(11, 30, -1, 2, 7, 12, 13, 20, 8)
    println("\nBefore Sort: ${arrList.joinToString(", ")}")
    arrList = merge_sort(arrList)
    println("After Sort: ${arrList.joinToString(", ")}")
}