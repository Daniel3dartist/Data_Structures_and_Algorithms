def quick_sort(arr:list):
    if len(arr) <= 1:
        return arr
    pivot:int = arr[-1]
    left:list = [i for i in arr if i < pivot]
    mid:list = [i for i in arr if i == pivot]
    right:list = [i for i in arr if i > pivot]
    return quick_sort(left) + mid + quick_sort(right)


if __name__ == "__main__":
    arr = [11, 30, -1, 2, 7, 12, 13, 20, 8]
    print(f"\nBefore Sort: {arr}")
    print(f"After Sort: {quick_sort(arr=arr)}\n")