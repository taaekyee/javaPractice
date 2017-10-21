package baekjoon;

public class b13458 {
	static int N = 5; //시험장 개수
	static int[] A = {10,9,10,9,10}; //각 시험장의 응시자 수
	static int B = 7; //총 감독관이 관리할 수 있는 응시자 수
	static int C = 2; //부 감독관이 관리할 수 있는 응시자 수
	
	public static void main(String[] args) {
		System.out.println(solution());
	}
	public static int solution(){
		int cnt = N;
		for(int i = 0; i<N; i++){
			A[i]-=B;
			cnt += (int)Math.ceil(A[i] / (double)C);
		}
		
		return cnt;
	}
}
