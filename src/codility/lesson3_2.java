package codility;

import java.util.Arrays;
import java.util.Collections;

public class lesson3_2 {

	public static int solution(int A[]){
		
		Arrays.sort(A);
		for(int i = 0;i<A.length;i++) System.out.println(A[i]);
		
		int result = 0;
		
		if(A.length==0 || A[0]!=1) return 1;
		
		for(int i=0;i<A.length-1;i++){
			if((A[i+1]-A[i])==1) continue;
			else return (A[i]+1);
		}
		return A[A.length-1]+1;
	}
	
	public static void main(String[] args) {
		int[] A = {};
		System.out.println(solution(A));
	}
}
