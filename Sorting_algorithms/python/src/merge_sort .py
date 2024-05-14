def arr_merge_agent(left_arr:list, right_arr:list):
    ord_arr = []
    left_idx, right_idx = 0,0
    while left_idx < len(left_arr) and right_idx < len(right_arr):
        if left_arr[left_idx] <= right_arr[right_idx]:
            ord_arr.append(left_arr[left_idx])
            left_idx+=1
        else:
            ord_arr.append(right_arr[right_idx])
            right_idx+=1
    ord_arr += left_arr[left_idx:]
    ord_arr += right_arr[right_idx:]
    return ord_arr


def merge_sort(arr:list):
    if len(arr) <= 1: return arr
    else:
        cut_point = len(arr)//2
        left = merge_sort(arr[:cut_point])
        right = merge_sort(arr[cut_point:])
        return arr_merge_agent(left, right)


if __name__ == "__main__":
    arr:list = [11, 30, -1, 2, 7, 12, 13, 20, 8]
    print(f"\nBefore Sort: {arr}")
    print(f"After Sort: {merge_sort(arr=arr)}\n")
