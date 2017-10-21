package baekjoon;

public class b14500 {
	static int N = 4;
	static int M = 10;
//	static int[][] map = {
//			{1,2,3,4,5},
//			{5,4,3,2,1},
//			{2,3,4,5,6},
//			{6,5,4,3,2},
//			{1,2,1,2,1}
//	};
//	static int[][] map = {
//			{1,2,3,4,5},
//			{1,2,3,4,5},
//			{1,2,3,4,5},
//			{1,2,3,4,5}
//	};
	static int[][] map = {
			{1,2,1,2,1,2,1,2,1,2},
			{2,1,2,1,2,1,2,1,2,1},
			{1,2,1,2,1,2,1,2,1,2},
			{2,1,2,1,2,1,2,1,2,1}
	};
	static boolean[][] visit;
	static int max = 0;
	static int val;
	
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	//ㅗㅜㅏㅓ 예외 조건
	//1. [i][j]+[i-1][j]+[i][j-1]+[i][j+1]
	//2. [i][j]+[i][j-1]+[i][j+1]+[i+1][j] 
	//3. [i][j]+[i-1][j]+[i+1][j]+[i][j+1]
	//4. [i][j]+[i-1][j+1]+[i][j+1]+[i+1][j+1]
	
	public static void main(String[] args) {
		visit = new boolean[N][M];
		
		for(int i = 0;i<N;i++){
			for(int j= 0;j<M;j++){
				DFS(i,j,0);
				val = 0;
				exception(i, j);
				val = 0;
			}
		}
		System.out.println(max);
	}
	
	public static void DFS(int i, int j, int d){
		if(d == 4){
			if(val>max) max = val;
			return;
		}
		visit[i][j] = true;
		val += map[i][j];
		
		for(int a = 0;a<4;a++){
			int nexti = i+dx[a];
			int nextj = j+dy[a];
			
			if(nexti>=0 && nexti<N && nextj>=0 && nextj<M && !visit[nexti][nextj]) DFS(nexti,nextj,d+1);
		}
		visit[i][j] = false;
		val -= map[i][j];
		
	}
	public static void exception(int i, int j){
		for(int a=0;a<N;a++){
			for(int b=0;b<M;b++){
				if(a>0 && a<N-1 && b>0 && b<M-1) max = Math.max(max, map[a][b]+map[a-1][b]+map[a][b-1]+map[a][b+1]);
				if(a<N-1 && b>0 && b<M-1) max = Math.max(max, map[a][b]+map[a][b-1]+map[a][b+1]+map[a+1][b]);
				if(a>0 && a<N-1 && b<M-1) max = Math.max(max, map[a][b]+map[a-1][b]+map[a+1][b]+map[a][b+1]);
				if(a>0 && a<N-1 && b<M-1) max = Math.max(max, map[a][b]+map[a-1][b+1]+map[a][b+1]+map[a+1][b+1]);
				
			}
		}
	}
						
}
