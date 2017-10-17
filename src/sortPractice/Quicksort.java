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
		//���� ����� ù ��° ��Ұ� ���ذ��̴�.
		int pivot = numbers[first];
		int temp = 0;
		
		++left;
		
		//left�� right���� ũ�� �ݺ��� Ż��
		while(left <= right){
			//�迭�� ��ȸ�Ͽ� ���ذ�(pivot)���� ũ�ų� ���� �����͸� ã�� ������ Ž���ϸ� left�� ���� ������Ŵ
			while(numbers[left] <= pivot && left < right) ++left;
			
			//�迭�� ��ȸ�Ͽ� ���ذ�(pivot)���� ���� �����͸� ã�� ������ Ž���ϸ� right�� ���� ���ҽ�Ŵ
			while(numbers[right] > pivot && left <= right) --right;
			
			//right�� left���� Ŭ ��쿡(������ ������ ��쿡)
			if(left < right){
				//�� ���� ��ȯ
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
			
			//���������� ����
			quickSort(numbers, left, index-1);
			//���������� ����
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
