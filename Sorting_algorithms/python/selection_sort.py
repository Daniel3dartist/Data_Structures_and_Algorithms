def selection_sort(arr:list):
    arr_len = len(arr)
    for i in range(0, arr_len):
        lowest_index = i
        for j in range(i+1, arr_len):
            if arr[j] < arr[lowest_index]:
                lowest_index = j
        arr[i], arr[lowest_index] = arr[lowest_index], arr[i]
    return arr

if __name__ == "__main__":
    arr = [11, 30, -1, 2, 7, 12, 13, 20, 8]
    print(f"\nBefore Sort: {arr}")
    print(f"After Sort: {selection_sort(arr=arr)}\n")