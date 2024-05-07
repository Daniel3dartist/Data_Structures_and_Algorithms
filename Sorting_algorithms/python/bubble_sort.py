def bubble_sort(arr:list):
    arr_len = len(arr)
    for i in range(0, arr_len - 1):
        for j in range(0, arr_len - 1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr

if __name__ == "__main__":
    arr = [11, 30, -1, 2, 7, 12, 13, 20, 8]
    print(f"\nBefore Sort: {arr}")
    print(f"After Sort: {bubble_sort(arr=arr)}\n")