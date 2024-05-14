#include <iostream>

using namespace std;

void selectionSort(int arr[], int arr_lenght)
{
    
    for (int i = 0; i < arr_lenght - 1; i++)
    {
        int lowest_index = i;
        for (int j = i + 1; j < arr_lenght; j++)
        {
            if (arr[j] < arr[lowest_index])
            {
                lowest_index = j;
            }
        }
        if (lowest_index != i)
        {
            swap(arr[lowest_index], arr[i]);
        }
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
    selectionSort(arr, arr_lenght);
    cout << "After sort: ";
    printArray(arr, arr_lenght);
    cout << "\n ";
    return 0;
}