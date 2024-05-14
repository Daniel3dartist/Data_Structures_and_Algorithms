#include <iostream>

using namespace std;

int partition(int arr[], int lowest_index, int highest_index)
{
    int pivot = arr[highest_index];
    int leftIndex = lowest_index;
    
    for (int i = lowest_index; i < highest_index; i++){
        if (arr[i] <= pivot)
        {
            swap(arr[i], arr[leftIndex]);
            leftIndex++;
        }
    }
    swap(arr[highest_index], arr[leftIndex]);
    return leftIndex;
}


void quickSort(int arr[], int lowest_index, int highest_index)
{
    if (lowest_index < highest_index)
    {
        int pivotIndex = partition(arr, lowest_index, highest_index);
        quickSort(arr, lowest_index, pivotIndex-1);
        quickSort(arr, pivotIndex+1, highest_index);
    }
}

void printArray(int arr[], int arr_lenght)
{
    for (int i = 0; i < arr_lenght; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}


int main()
{
    int arr[] = {11, 30, -1, 2, 7, 12, 13, 20, 8};
    int arr_lenght = sizeof(arr) / sizeof(arr[0]);
    
    cout << endl;
    cout << "Before sort: ";
    printArray(arr, arr_lenght);
    quickSort(arr, 0, arr_lenght-1);
    cout << "After sort: ";
    printArray(arr, arr_lenght);
    cout << "\n ";
    return 0;
}