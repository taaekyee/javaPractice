package codility;

import java.util.Arrays;

public class lesson4_1 {

	public static int solution(int[] A){
		
		Arrays.sort(A);
		if(A[0]!=1) return 0;
		for(int i = 0;i<A.length-1;i++ ){
			if(A[i+1]-A[i]!=1) return 0;
		}
		
		
		return 1;
	}
	public static void main(String[] args) {
		int[] A = {1};
		
		System.out.println(solution(A));
	}
}
