#include <iostream>

using namespace std;

void insertionSort(int arr[], int arr_lenght)
{
    for (int i = 1; i < arr_lenght; i++)
    {
        int lowest_value = arr[i];
        int j = i-1;
        while (j>=0 && arr[j] > lowest_value)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1]=lowest_value;
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
    insertionSort(arr, arr_lenght);
    cout << "After sort: ";
    printArray(arr, arr_lenght);
    cout << " ";
    return 0;
}