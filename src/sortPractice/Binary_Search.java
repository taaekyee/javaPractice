package sortPractice;

public class Binary_Search {
	
	static int BinarySearch(int arr[], int size, int findData){
		int low = 0;
		int high = size-1;
		int mid;
		
		//high가 low보다 작으면 데이터가 없다
		while(low<=high){
			//중앙값
			mid = (low+high)/2;
			
			//만약 찾으려는 값이 중앙값보다 작으면 high = mid-1
			if(arr[mid]>findData) high = mid - 1;
			//만약 찾으려는 값이 중앙값보다 크면 low = mid+1
			else if(arr[mid]<findData) low = mid + 1;
			else return mid;
		}
		
		return -1;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,7,9,10,23,25,37,50,67,80};
		int length = arr.length;
		
		System.out.println(BinarySearch(arr, length, 23)+" 번째에 있습니다");
	}

}
