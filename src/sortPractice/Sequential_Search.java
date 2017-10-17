package sortPractice;

public class Sequential_Search {
	//������ �迭�� ó������ ������ ���ʴ�� ���Ͽ� ���ϴ� �����͸� ã�Ƴ��� �˰���
	//�ð����⵵: O(n)
	
	static int sequentialSearch(int arr[], int length, int findData){
		for(int i = 0; i < length; i++){
			if(arr[i] == findData) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {23,25,14,5,66,72,13,224,51};
		int length = arr.length;
		
		System.out.println(sequentialSearch(arr, length, 14)+" ��°�� �ֽ��ϴ�.");
		
	}

}
