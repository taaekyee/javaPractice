package codility;

import java.util.*;
public class lesson2_1 {

   
   public static int solution(int A[]){
      
      int result = 0;
      
      Arrays.sort(A);
      
      int cnt=1;
      int i = 0;
      
      while(i<A.length-1){
    	  if(A[i]==A[i+1]){
    		  cnt++;
    	  }else {
				if (cnt % 2 == 1) {
					return A[i];
				}
				cnt=1;
			}
			i++;
		}

		return A[A.length-1];
   }
   
	public static void main(String[] args) {
		int A[] = new int[] { 9, 3, 9, 3, 9, 7, 9 };
		System.out.println(solution(A));

	}
}
