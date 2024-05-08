#include <iostream>

using namespace std;

void bubbleSort(int arr[], int arr_lenght)
{
    for (int i = 0; i < arr_lenght - 1; i++)
    {
        for (int j = 0; j < arr_lenght - 1; j++)
        {
            if (arr[j] > arr[j+1])
            {
                swap(arr[j], arr[j+1]);
            }
        }
    }
}


void coutArray(int arr[], int arr_lenght)
{
    for (int i = 0; i < arr_lenght; i++)
    {
        cout << arr[i] << " ";
    }
}

int main()
{
    int arr[] = {11, 30, -1, 2, 7, 12, 13, 20, 8};
    int arr_lenght = sizeof(arr) / sizeof(arr[0]);
    cout << endl;
    cout << "Before sort: ";
    coutArray(arr, arr_lenght);
    cout << endl;
    bubbleSort(arr, arr_lenght);
    cout << "After sort: ";
    coutArray(arr, arr_lenght);
    cout << "\n ";
    return 0;
}