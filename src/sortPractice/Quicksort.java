package sortPractice;

public class Quicksort {

	static void printArray(int arr[], int length){
		for(int i =0;i<length;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	static int partition(int numbers[], int left, int right){
		
		int first = left;
		//정렬 대상의 첫 번째 요소가 기준값이다.
		int pivot = numbers[first];
		int temp = 0;
		
		++left;
		
		//left가 right보다 크면 반복문 탈출
		while(left <= right){
			//배열을 순회하여 기준값(pivot)보다 크거나 같은 데이터를 찾을 때까지 탐색하며 left의 값을 증가시킴
			while(numbers[left] <= pivot && left < right) ++left;
			
			//배열을 순회하여 기준값(pivot)보다 작은 데이터를 찾을 때까지 탐색하면 right의 값을 감소시킴
			while(numbers[right] > pivot && left <= right) --right;
			
			//right가 left보다 클 경우에(만나지 못했을 경우에)
			if(left < right){
				//두 값을 교환
				//System.out.println(numbers[left]+" "+numbers[right]);
				temp = numbers[left];
				numbers[left] = numbers[right];
				numbers[right] = temp;
				
//				printArray(numbers,9);
			}else break;
		}
		
		temp = numbers[first];
		numbers[first] = numbers[right];
		numbers[right] = temp;
		
		//printArray(numbers,9);
//		for(int i =0;i<9;i++){
//			if(numbers[i]==pivot) System.out.print(" ");
//			System.out.print(numbers[i]);
//			if(numbers[i]==pivot) System.out.print(" ");
//		}
//		System.out.println();
		
		return right;
	}
	
	
	static void quickSort(int numbers[], int left, int right){
		if(left<right){
			int index = partition(numbers, left, right);
			
			//좌측데이터 정렬
			quickSort(numbers, left, index-1);
			//우측데이터 정렬
			quickSort(numbers, index+1, right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,6,1,2,8,7,9,3,4};
		int length = arr.length;
		printArray(arr,length);
	//	System.out.println();
		quickSort(arr, 0, length-1);
	//	System.out.println();
		printArray(arr,length);
		
	}

}
