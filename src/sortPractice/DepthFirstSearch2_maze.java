package sortPractice;

import java.util.Scanner;

public class DepthFirstSearch2_maze {

	static int n, min; //맵의 크기와 최소값을 저장할 변수
	static int[][] map = null;
	//= new int[10][10]; //맵
			
	static void DFS(int x, int y, int l){
		
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
		
		map[y][x] = 1; //지나간 자리를 원상태로 되돌림
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
