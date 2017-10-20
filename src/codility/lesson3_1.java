package codility;

public class lesson3_1 {

	public static int solution(int[] A){
		
/*		int min=Integer.MAX_VALUE;
		
		for(int i = 1;i<A.length;i++){
			int sumA = 0;
			int sumB = 0;
			for(int j=0;j<A.length;j++){
				if(j<i) sumA += A[j];
				else sumB += A[j];
			}
			if(Math.abs(sumA-sumB)<min) min = Math.abs(sumA-sumB);
		}
		return min;*/
		
		int min=Integer.MAX_VALUE;
		int sumA = 0;
		int sumB = 0;
		
		for(int i = 0;i<A.length;i++){
			sumB += A[i];
		}
		
		for(int i = 0;i<A.length-1;i++){
			sumA += A[i];
			sumB -= A[i];
			
			if(Math.abs(sumA-sumB)<min) min = Math.abs(sumA-sumB);
		}
		
		return Math.abs(min);
		
	}
	
	public static void main(String[] args) {
		int[] A = {-1000,1000};
		System.out.println(solution(A));
	}
}
