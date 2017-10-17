package sortPractice;

public class Sequential_Search {
	//데이터 배열의 처음부터 끝까지 차례대로 비교하여 원하는 데이터를 찾아내는 알고리즘
	//시간복잡도: O(n)
	
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
		
		System.out.println(sequentialSearch(arr, length, 14)+" 번째에 있습니다.");
		
	}

}
