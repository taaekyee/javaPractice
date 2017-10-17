package sortPractice;

import java.util.Scanner;

public class BreadthFirstSearch {

	//스택이 아닌 큐를 이용
	//트리나 그래프에서의 탐색에 사용
	//너비 우선 탐색은 깊이가 1인 모든 정점을 방문하고 나서,
	//그 다음에는 깊이가 2인 모든 정점을, 깊이가 3인 모든 정점을 방문하는 식으로 계속 방문하다가
	//더 이상 방문할 곳이 없으면 탐색을 마침
	//=> 깊이 우선 탐색과 다르게 무작정 막힐 때까지 탐색을 진행하는 게 아니라, 이곳저곳 살펴보면서 탐색을 진행하는 것
	
	static int n; //입력되는 정점의 최댓값
	static int rear, front; //전단과 후단을 저장할 변수
	
	//인접 행렬과 큐와 방문 배열
	static int map[][] = new int[30][30];
	static int[] queue = new int[30];
	static int[] visit = new int[30];
	
	static void BFS(int v){
		int i = 0;
		
		visit[v] = 1; //정점 v를 방문
		System.out.println(v+"에서 시작");
		
		queue[rear++] = v; //큐에 v를 삽입하고 후단을 1 증가시킴
		while(front < rear){ //후단과 전담이 같거나 작으면 반복 탈출
			
			//큐의 첫 번째에 있는 데이터를 제외하고 제외된 값을 가져오며, 전단 1증가
			v = queue[front++];
			for(i = 0; i<=n;i++){
				//정점 v와 정점 i가 만나고, 정점 i를 방문하지 않은 상태일 경우
				if(map[v][i] == 1 && visit[i] != 1){
					visit[i] = 1; //정점 i를 방문
					System.out.println(v+"에서 "+i+"로 이동");
					queue[rear++] = i; //큐에 i를 삽입하고 후단을 1 증가시킴
				}
			}
		}
	}
	public static void main(String[] args) {
		int start; //시작 정점
		int v1,v2;
		n = 6;
		start = 1;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			v1 = sc.nextInt();
			v2 = sc.nextInt();
			if(v1 == -1 && v2 == -1) break;
			map[v1][v2] = map[v2][v1] = 1;
			
		}
		BFS(start);
	}
}
