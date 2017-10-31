package codility;

public class lesson5_1 {
	public static int solution(int A, int B, int K) {
//		int cnt = 0;
//		
//		for(int i = A;i<=B;i++){
//			if(i%K==0) cnt++; 
//		}
//		
//		return cnt;

		return (int) (
				(Math.floor(B / (double) K) - Math.ceil(A / (double) K) + 1)
				);
	}

	public static void main(String[] args) {
		System.out.println(solution(6, 11, 2));
	}

}
