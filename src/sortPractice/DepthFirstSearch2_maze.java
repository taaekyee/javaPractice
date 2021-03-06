package sortPractice;

import java.util.Scanner;

public class DepthFirstSearch2_maze {

	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	static int n, min; //맵의 크기와 최소값을 저장할 변수
	static int[][] map = null;
	//= new int[10][10]; //맵
			
/*	static void DFS(int x, int y, int l){
		
		System.out.println(y+" "+x);
		//도착 지점에 다다름
		if(x == n-1 && y == n-1 ){
			//현재 최소값이 l보다 크면, l이 작은 것이므로 l을 최소값으로 지정
			if(min > l) min = l;
			return;
		}
		map[y][x] = 0; //방문했음을 표시
		//위로 이동할 수 있다면 이동
		if(y>0 && map[y-1][x] != 0) DFS(x,y-1,l+1);
		//아래로 이동할 수 있다면 이동
		if(y<n-1 && map[y+1][x] != 0) DFS(x, y+1,l+1);
		//왼쪽으로 이동할 수 있다면 이동
		if(x>0 && map[y][x-1] != 0) DFS(x-1,y,l+1);
		//오른쪽으로 이동할 수 있다면 이동
		if(x<n-1 && map[y][x+1] != 0) DFS(x+1,y,l+1);
		
		for(int i=0;i<4;i++){
			int nextx = x + dx[i];
			int nexty = y + dy[i];
			
			if(nextx<0 || nextx>=n || nexty<0 || nexty>=n) continue;
			
			if(map[nexty][nextx]!=0) DFS(nextx,nexty,l+1);
			
		}
		
		map[y][x] = 1; //지나간 자리를 원상태로 되돌림
		
	}*/
	
	static void DFS(int x, int y, int l){
		//도착지점에 온다면 x==-1 && y==-1
		if(x == n-1 && y == n-1){
			//도착 경로의 수가 min보다 작으면 l로
			if(min > l) min = l;
			return;
		}
		map[x][y] = 0; //방문했음
		for(int i = 0;i<4;i++){
			int nextx = x + dx[i];
			int nexty = y + dy[i];
			
			//지도밖으로 벗어나면
			if(nextx<0 || nextx>=n || nexty<0 || nexty>=n ) continue;
			//갈수있는 길이 있다면 다시 DFS
			if(map[nextx][nexty]!=0) DFS(nextx,nexty,l+1);
		}
		map[x][y] = 1; //지나간 자리를 원상태로
		
		
	}
	
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		n = 5;
		min = n*n;
		
		map = new int[][]{
				{1,1,1,1,1},
				{0,0,0,0,1},
				{1,1,1,1,1},
				{1,0,1,0,0},
				{1,1,1,1,1}
				};
		
		DFS(0,0,1);
		
		System.out.println(min);
	}
}
