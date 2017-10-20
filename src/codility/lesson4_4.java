package codility;

public class lesson4_4 {
	public static int[] solution(int N, int[] A){
		int[] B = new int[N];
		int max = 0;
		
		int temp = 0;
		for(int i = 0 ; i <A.length;i++){
			if(A[i]>N){
				//for(int j=0;j<N;j++) B[j]=max;
				max = temp;
			}else{
				if(B[A[i]-1] < max) B[A[i]-1] = max;
				B[A[i]-1]++;
				//if(B[A[i]-1]>max) max = B[A[i]-1];
				if(temp < B[A[i]-1]) temp = B[A[i]-1];
			}
		}
		for(int i = 0;i<B.length;i++){
			if(B[i]<max) B[i]=max;
		}
		for(int i = 0;i<B.length;i++){
			System.out.println(B[i]);
		}
				
		return B;
	}
	public static void main(String[] args) {
		int N = 5;
		int[] A = {3,4,4,6,1,4,4};
		solution(N,A);
	}
}