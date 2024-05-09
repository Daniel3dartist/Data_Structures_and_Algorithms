fun quick_sort(arr: IntArray): IntArray {
    if (arr.size <= 1) {
        return arr
    } else {
        val pivot = arr.last()
        var left = arr.filter {it < pivot}
        var mid = arr.filter {it == pivot}
        var right = arr.filter {it > pivot}

        var ord_arr = mutableListOf<Int>()
        ord_arr.addAll(quick_sort(left.toIntArray()).toList())
        ord_arr.addAll(mid)
        ord_arr.addAll(quick_sort(right.toIntArray()).toList())
        return ord_arr.toIntArray()
    }
}


fun main () {
    var arrList = intArrayOf(11, 30, -1, 2, 7, 12, 13, 20, 8)
    println("\nBefore Sort: ${arrList.joinToString(", ")}")
    arrList = merge_sort(arrList)
    println("After Sort: ${arrList.joinToString(", ")}")
}