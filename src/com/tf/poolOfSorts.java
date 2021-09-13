package com.tf;

public class poolOfSorts {
//bublowe sortowanie
    public Integer[] SortSomesort1(Integer[] arry)  {
        for (int loop =1;loop<arry.length;loop++) {
            for (int arryS=1;arryS<arry.length;arryS++){
                if (arry[arryS-1]>arry[arryS]){
                    int temp = arry[arryS];
                    arry[arryS]=arry[arryS-1];
                    arry[arryS-1]=temp;
                }
            }
        }
        return arry;
    }

    //sortowanie  stosem
    public Integer[] SortSomesort2(Integer[] arry2)  {
        buildHeap(arry2);
        for (int i = arry2.length-1; i > 0; i--) {
            swap(arry2, 0, i);
            buildMaxHeap(arry2, 0, i-1);
        }
        return arry2;
    }

    public static void buildHeap(Integer arr[]) {
        for (int i = (arr.length-1)/2; i >= 0; i--)
        buildMaxHeap(arr, i, arr.length-1);
    }

    public static void buildMaxHeap(Integer arr[], int i, int N) {
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])
            max = right;
        if (max != i) {
            swap(arr, i, max);
            buildMaxHeap(arr, max, N);
        }
    }

    public static void swap(Integer arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}