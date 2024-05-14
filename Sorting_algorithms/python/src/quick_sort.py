def partition(arr: int, lowest_index: int, highest_index: int) -> int:
    pivot:int = arr[highest_index]
    left_index:int = lowest_index

    for i in range(lowest_index, highest_index):
        if arr[i] <= pivot:
            arr[left_index], arr[i] = arr[i], arr[left_index]
            left_index+=1
    arr[left_index], arr[highest_index] = arr[highest_index], arr[left_index]
    return left_index

def quick_sort(arr: int, lowest_index: int, highest_index: int) -> list:
    if lowest_index < highest_index:
        pivot_index:int = partition(arr=arr, lowest_index=lowest_index, highest_index=highest_index)
        quick_sort(arr, lowest_index, pivot_index-1)
        quick_sort(arr, pivot_index+1, highest_index)
    return arr

if __name__ == "__main__":
    arr = [11, 30, -1, 2, 7, 12, 13, 20, 8]
    print(f"\nBefore Sort: {arr}")
    print(f"After Sort: {quick_sort(arr=arr, lowest_index=0, highest_index=len(arr)-1)}\n")
   