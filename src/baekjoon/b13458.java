package baekjoon;

public class b13458 {
	static int N = 5; //������ ����
	static int[] A = {10,9,10,9,10}; //�� �������� ������ ��
	static int B = 7; //�� �������� ������ �� �ִ� ������ ��
	static int C = 2; //�� �������� ������ �� �ִ� ������ ��
	
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
