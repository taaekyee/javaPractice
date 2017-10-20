package codility;

import java.util.*;

public class lesson4_2 {
	public static int solution(int X, int[] A){
				
/*		int[] test = new int[X+1];
		
		for(int i = 0;i<A.length;i++){
			test[A[i]]++;
//			for(int k=0;k<test.length;k++) System.out.println(test[k]);
//			System.out.println();
			if(test[X]>0){
				for (int j = 1; j < X + 1; j++) {
					if (test[j] == 0)
						break;
					if (j == X)
						return i;
				}
			}
		}	
		//for(int k=0;k<test.length;k++) System.out.println(test[k]);
*/
		int[] test = new int[X];
		int cnt = 0;
		
		for(int i = 0; i<A.length;i++){
			if(test[A[i]-1] == 0){
				test[A[i]-1] = 1;
				cnt++;
			}
			if(cnt == X) return i;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int X = 5;
		int[] A = {1,3,1,4,2,3,5,4};
		
		System.out.println(solution(X, A));
	}
}