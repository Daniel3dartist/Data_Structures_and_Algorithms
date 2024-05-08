def insertion_sort(arr:list):
    arr_len = len(arr)
    for i in range( 1, arr_len):
        lowest_value = arr[i]
        j = i-1
        while j >= 0 and arr[j] > lowest_value:
            arr[j+1] = arr[j]
            j-=1
        arr[j+1] = lowest_value
    return arr

if __name__ == "__main__":
    arr = [11, 30, -1, 2, 7, 12, 13, 20, 8]
    print(f"\nBefore Sort: {arr}")
    print(f"After Sort: {insertion_sort(arr=arr)}\n")