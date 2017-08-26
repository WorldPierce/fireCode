public static void insertionSort(int[] arr) {
	if(arr.length <= 1) return;
	for(int i = 1; i < arr.length; i++) {
		int temp = arr[i], j;
		for(j = i - 1; j >=0 && temp < arr[j]; j--) {
			arr[j + 1] = arr[j];
		}
		arr[j + 1] = temp;
	}
}