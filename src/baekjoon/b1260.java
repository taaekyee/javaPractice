package baekjoon;

import java.util.Scanner;

public class b1260 {
	
	static int n; //정점의 총 갯수
	static int[][] map = new int[30][30]; //인접행렬
	static boolean[] visit = new boolean[30]; //방문 여부
	
	static void DFS(int v){
		int i;
		
		visit[v] = true; //정점 v를 방문
		for(i=1;i<=n;i++){
			//정점 v와 i가 연결되어있고, 정점 i를 방문하지 않았다면
			if(map[v][i] == 1 && !visit[i]){
				System.out.println(v+"에서 "+i+"로 이동");
				//정점 i에서 다시 DFS를 불러옴
				DFS(i);
			}
		}
	}
	
	static int rear, front; //전단과 후단을 저장할 변수
	
	//인접 행렬과 큐와 방문 배열
	static int[] queue = new int[30];
	static boolean[] visit2 = new boolean[30];
	
	static void BFS(int v){
		int i = 0;
		
		visit2[v] = true; //정점 v를 방문
		System.out.println(v+"에서 시작");
		
		queue[rear++] = v; //큐에 v를 삽입하고 후단을 1 증가시킴
		while(front < rear){ //후단과 전담이 같거나 작으면 반복 탈출
			
			//큐의 첫 번째에 있는 데이터를 제외하고 제외된 값을 가져오며, 전단 1증가
			v = queue[front++];
			for(i = 0; i<=n;i++){
				//정점 v와 정점 i가 만나고, 정점 i를 방문하지 않은 상태일 경우
				if(map[v][i] == 1 && !visit2[i]){
					visit2[i] = true; //정점 i를 방문
					System.out.println(v+"에서 "+i+"로 이동");
					queue[rear++] = i; //큐에 i를 삽입하고 후단을 1 증가시킴
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int m = sc.nextInt();		
		int start = sc.nextInt();
		
		for(int i=0;i<m;i++){
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			map[v1][v2] = 1;
			map[v2][v1] = 1;
		}
		System.out.println("DFS: ");
		DFS(start);
		
		System.out.println("BFS: ");
		BFS(start);
	}
}