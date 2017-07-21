//Selection Sort

public static int[] selectionSortArray(int[] arr){
    if(arr.length <= 1){
        return arr;
    }
    for(int i = 0; i < arr.length; i++){
        int small = arr[i], index = i;
        for(int j = i+1;j<arr.length; j++){
            if(arr[j] < small){
                small = arr[j];
                index = j;
            }
        }
        if(index != i){
            int temp = arr[i];
            arr[i] = small;
            arr[index] = temp;
        }
    }
    return arr;
}