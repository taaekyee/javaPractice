package sortPractice;

public class Binary_Search {
	
	static int BinarySearch(int arr[], int size, int findData){
		int low = 0;
		int high = size-1;
		int mid;
		
		//high�� low���� ������ �����Ͱ� ����
		while(low<=high){
			//�߾Ӱ�
			mid = (low+high)/2;
			
			//���� ã������ ���� �߾Ӱ����� ������ high = mid-1
			if(arr[mid]>findData) high = mid - 1;
			//���� ã������ ���� �߾Ӱ����� ũ�� low = mid+1
			else if(arr[mid]<findData) low = mid + 1;
			else return mid;
		}
		
		return -1;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,7,9,10,23,25,37,50,67,80};
		int length = arr.length;
		
		System.out.println(BinarySearch(arr, length, 23)+" ��°�� �ֽ��ϴ�");
	}

}
