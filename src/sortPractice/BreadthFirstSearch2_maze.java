package sortPractice;

import java.util.Scanner;

public class BreadthFirstSearch2_maze {
	//길이가 N으로 주어지면 크기가 N*N인 2차원 배열을 생성

	static int n, cnt; // 맵의 크기와 카운트 변수
	static int[][] map = new int[10][10];
	
	//좌표의 길이를 저장할 배열
	static int[] x= new int[100];
	static int[] y= new int[100];
	static int[] l= new int[100];
	
	//큐에 좌표 정보와 거리를 삽입하는 함수 -> l은 (x,y)에 도달하기 까지 걸리는 거리
	static void enqueue(int _x, int _y, int _l){
		x[cnt] = _x;
		y[cnt] = _y;
		l[cnt] = _l;
		
		System.out.println("cnt: "+ cnt);
		System.out.print(x[cnt]+" ");
		System.out.print(y[cnt]+" ");
		System.out.println(l[cnt]+" ");

		cnt++;
	}
	
	static void BFS(int _x, int _y){
		int pos = 0;
		
		//시작점의 좌표 정보와 길이를 큐에 삽입
		enqueue(_x, _y, 1);
		
		//더 이상 방문할 지점이 없거나, 도작 지점이 도착하면 루프를 탈출한다.
		while(pos < cnt && (x[pos] != n-1 || y[pos] != n-1)){
			//두 번 방문하게 하면 안되므로, 이미 지나가면 표시
			map[y[pos]][x[pos]] = 0;
			
			//위로 갈 수 있다면, 위 지점의 좌표 정보와 길이를 큐에 삽입
			if(y[pos] > 0 && map[y[pos]-1][x[pos]] == 1)
				enqueue(x[pos], y[pos], l[pos]+1);
			//아래로 갈 수 있다면, 위 지점의 좌표 정보와 길이를 큐에 삽입
			if(y[pos] < n-1 && map[y[pos]+1][x[pos]] == 1)
				enqueue(x[pos], y[pos]+1, l[pos]+1);
			//왼쪽로 갈 수 있다면, 위 지점의 좌표 정보와 길이를 큐에 삽입
			if(x[pos] > 0 && map[y[pos]][x[pos]-1] == 1)
				enqueue(x[pos]-1, y[pos], l[pos]+1);
			//오른쪽로 갈 수 있다면, 위 지점의 좌표 정보와 길이를 큐에 삽입
			if(x[pos] < n-1 && map[y[pos]][x[pos]+1] == 1)
				enqueue(x[pos]+1, y[pos], l[pos]+1);
			
			//큐의 다음 순서의 지점을 방문
			pos++;
		}
		
		//cnt가 pos보다 크다면, 도착 지점에 무사히 도착한 것이다.
		//위의 반복문은 도착점에 도착하게 되면 루프를 바로 빠져나오기 때문에,
		//길이를 삽입하는 큐의 마지막 요소가 최단 경로의 길이라고 할 수 있다.
		if(pos < cnt)
			System.out.println("최단 경로의 길이: "+l[pos]);
//		for(int k = 0;k<pos;k++){
//			System.out.println("x: "+ x[k]+" y: "+ y[k]+" l: "+ l[k]);
//		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		n = 6;
		map = new int[][]{
			{1,1,1,1,1,1},
			{0,0,1,0,0,1},
			{1,1,1,0,1,1},
			{1,0,0,0,1,0},
			{1,1,1,0,1,0},
			{0,0,1,1,1,1}
			};
		
		
		BFS(0,0);
	}
}
