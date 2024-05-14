#include <iostream>

using namespace std;

void mergeSort(int arr[], int arr_lenght)
{
    cout << "Merge Sorte!" << endl;
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
    mergeSort(arr, arr_lenght-1);
    cout << "After sort: ";
    printArray(arr, arr_lenght);
    cout << "\n ";
    return 0;
}