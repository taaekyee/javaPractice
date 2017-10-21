package baekjoon;

public class 연구소_14502 {
	static int[][] map;
	static int n,m;
	
	static boolean[][] visit;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	public static void main(String[] args) {
		n=7;m=7;
		//map = new int[n][m];
		visit = new boolean[n][m];
		
		map = new int[][]{{2,0,0,0,1,1,0},
						{0,0,1,0,1,2,0},
						{0,1,1,0,1,0,0},
						{0,1,0,0,0,0,0},
						{0,0,0,0,0,1,1},
						{0,1,0,0,0,0,0},
						{0,1,0,0,0,0,0}
						};
		DFS(0,0,0);
	}
	//벽 세우기
	public static void DFS(int x, int y, int d){
		System.out.println("x: "+x+" y: "+y);
		map[x][y] = 1;
		visit[x][y] = true;
		if(d==3){
			//바이러스 퍼뜨리러 가자
			//BFS();
			//commitMap();
			map[x][y]=0;
			visit[x][y]=false;
			return;
			
		}
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				if(visit[i][j] || map[i][j]!=0) continue;
				DFS(i,j,d+1);
			}
		}
		map[x][y] = 0;
		visit[x][y] = false;
		
	}
	
	public void BFS(){
		int[][] queue = new int[n][m];
		
	}
	

}
