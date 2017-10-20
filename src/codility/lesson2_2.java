package codility;

import java.util.*;

public class lesson2_2 {
	static int[] Arr;
	
	public static int[] solution(int[] A, int K) {

		Arr = A;
//		List<Integer> al = new ArrayList<>();
//		
//		for(int i = 0;i<A.length;i++){
//			al.add(A[i]);
//		}
//		
//		for(int k=0;k<K;k++){
//			int temp = al.get(al.size()-1);
//			al.remove(al.size()-1);
//			al.add(0,temp);
//		}
//		for(int i=0;i<al.size();i++){
//			A[i]=al.get(i);
//		}
		
		for(int i = 0;i<K;i++){
			if(Arr.length!=0) shiftArrayRight();
		}
		for(int i = 0;i<Arr.length;i++){
			System.out.println(Arr[i]);
		}
		
		return A;
	}
	public static void shiftArrayRight(){
		int temp = Arr[Arr.length-1];
		for(int i = Arr.length-1;i>0;i--){
			Arr[i] = Arr[i-1];
		}
		Arr[0] = temp;		
	}

	public static void main(String[] args) {

		int A[] = {3,8,9,7,6};
		solution(A, 3);
		
	}
}
