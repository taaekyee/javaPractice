package test;

import java.util.*;
public class BFS_maze_usequeue {
	//길이가 N으로 주어지면 크기가 N*N인 2차원 배열을 생성

		static int n, cnt; // 맵의 크기와 카운트 변수
		static int[][] map = new int[10][10];
		
		//좌표의 길이를 저장할 배열
		static Queue<Integer> x = new LinkedList<>();
		static Queue<Integer> y = new LinkedList<>();
		static Queue<Integer> l = new LinkedList<>();
		
		//큐에 좌표 정보와 거리를 삽입하는 함수 -> l은 (x,y)에 도달하기 까지 걸리는 거리
		static void enqueue(int _x, int _y, int _l){
			x.offer(_x);
			y.offer(_y);
			l.offer(_l);
		}
		
		static void BFS(int _x, int _y){
			int pos = 0;
			
			//시작점의 좌표 정보와 길이를 큐에 삽입
			enqueue(_x, _y, 1);
			
			int ll = 0;
			//더 이상 방문할 지점이 없거나, 도작 지점이 도착하면 루프를 탈출한다.
			while(!x.isEmpty() && (x.peek() != n-1 || y.peek() != n-1)){
				int xx = x.poll();
				int yy = y.poll();
				ll = l.poll();
				
				//두 번 방문하게 하면 안되므로, 이미 지나가면 표시
				map[xx][yy] = 0;
				
				//위로 갈 수 있다면, 위 지점의 좌표 정보와 길이를 큐에 삽입
				if(yy > 0 && map[yy-1][xx] == 1)
					enqueue(xx, yy-1, ll+1);
				//아래로 갈 수 있다면, 위 지점의 좌표 정보와 길이를 큐에 삽입
				if(yy < n-1 && map[yy+1][xx] == 1)
					enqueue(xx, yy+1, ll+1);
				//왼쪽로 갈 수 있다면, 위 지점의 좌표 정보와 길이를 큐에 삽입
				if(xx > 0 && map[yy][xx-1] == 1)
					enqueue(xx-1, yy, ll+1);
				//오른쪽로 갈 수 있다면, 위 지점의 좌표 정보와 길이를 큐에 삽입
				if(xx < n-1 && map[yy][xx+1] == 1)
					enqueue(xx+1, yy, ll+1);
			}
			
			//cnt가 pos보다 크다면, 도착 지점에 무사히 도착한 것이다.
			//위의 반복문은 도착점에 도착하게 되면 루프를 바로 빠져나오기 때문에,
			//길이를 삽입하는 큐의 마지막 요소가 최단 경로의 길이라고 할 수 있다.
			if(!x.isEmpty())
				System.out.println("최단 경로의 길이: "+ll);
//			for(int k = 0;k<pos;k++){
//				System.out.println("x: "+ x[k]+" y: "+ y[k]+" l: "+ l[k]);
//			}
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
