package codility;

public class lesson4_3 {
	public static int solution(int[] A){
		
		int[] test = new int[1000001];
		int cnt = 1;
		for(int i = 0 ; i<A.length;i++){
			if(A[i]<1) continue;
			if(test[A[i]]==0) test[A[i]] = 1;
		}
		for(int i = 1;i<test.length;i++){
			if(test[i]==0) return i;
			else cnt++;
		}
		
		return cnt;
	}
	public static void main(String[] args) {
		int[] A = {2};
		System.out.println(solution(A));
	}
}
