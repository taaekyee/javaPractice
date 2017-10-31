package woowahan;

public class test7 {
	static int result = 0;
//	public static int solution(int[] A){
//		
//		int idx = 1;
//		int diff = 0;		
//		while(idx<A.length-1){
//			
//			if((A[idx]-A[idx-1]) == (A[idx+1]-A[idx])){
//				check(A,idx+1,A[idx]-A[idx-1]);
//				result++;
//			}
//			
//			idx++;
//		}
//		
//		
//		return result;
//	}
//	
//	public static void check(int[] A, int index, int diff){
//		if(index>=A.length-1) return;
//		else if((A[index+1]-A[index]) == diff){
//			check(A,index+1,diff);
//			result++;
//		}else{
//			return;
//		}
//	}
	
	public static int solution(int[] A){
		
		int stack = 1;
		int temp = -1;
		for(int i = 1;i<A.length-1;i++){
			if((A[i]-A[i-1]) == (A[i+1]-A[i])){
				if((i-temp)==1){					
					result += ++stack;
				}
				else{
					stack = 1;
					result++;
				}
				temp = i;
			}
		}
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		//int[] i = {-1,1,3,3,3,2,1,0};
		int[] i = {-1,1,3,3,3,2,1,0,-1,-2};
		//int[] i = {1,2,3,4,5};
		System.out.println(solution(i));
	}
}
