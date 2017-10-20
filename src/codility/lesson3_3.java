package codility;

public class lesson3_3 {
	
	public static int solution(int x, int y, int d){
		
		
		return (int) Math.ceil((y-x)/(double)d);
	}
	public static void main(String[] args) {
		
		System.out.println(solution(10,85,30));
	}
}
