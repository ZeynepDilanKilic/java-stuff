class BubbleSort {
	void bubblesort(int arr[]) {
		int n = arr.length;
		for(int i = 0; i <n-1; i++) {
			for (int j =0; j < n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	void show(int arr[]) {
		int n =  arr.length;
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int [] myarr =  {4,45,27,1,100};
		bs.bubblesort(myarr);
		bs.show(myarr);
	}
}
