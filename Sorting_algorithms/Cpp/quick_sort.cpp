#include <iostream>

using namespace std;

int* quickSort(int arr[], int arr_lenght)
{
    return 0;
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
    quickSort(arr, arr_lenght);
    cout << "After sort: ";
    coutArray(arr, arr_lenght);
    cout << "\n ";
    return 0;
}