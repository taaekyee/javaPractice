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
	
/*	static void BFS(int v){
		int i = 0;
		
		visit[v] = 1; //정점 v를 방문
		System.out.println(v+"에서 시작");
		
		queue[rear++] = v; //큐에 v를 삽입하고 후단을 1 증가시킴
		while(front < rear){ //후단과 전단이 같거나 작으면 반복 탈출

			//큐의 첫 번째에 있는 데이터를 가져오고 전단을 1증가하여 제외시킴
			v = queue[front++];
			for(i = 0; i<=n;i++){
				//정점 v와 정점 i가 만나고, 정점 i를 방문하지 않은 상태일 경우
				//(큐에서 제외된 값(v)와 연결되어 있고 아직 방문하지 않는 정점을 방문
				if(map[v][i] == 1 && visit[i] != 1){
					visit[i] = 1; //정점 i를 방문
					System.out.println(v+"에서 "+i+"로 이동");
					queue[rear++] = i; //큐에 i를 삽입하고 후단을 1 증가시킴 (i로 이동하였으니까 i를 큐에 삽입)
				}
			}
		}
	}*/
	static void BFS(int v){
		visit[v] = 1;
		
		queue[rear++] = v;
		while(front<rear){
			v = queue[front++];
			for(int i = 0 ;i<=n;i++){
				if(map[v][i] ==1 &&visit[i]==0){
					visit[i]=1;
					System.out.println(v+"에서 "+i+"로 이동");
					queue[rear++]=i;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		int start; //시작 정점
		int v1,v2;
		n = 6;
		start = 1;
		int[] test = {1,2,1,3,2,4,2,5,3,4,3,6,4,5,4,6,5,6,-1,-1};
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		while(true){
			//v1 = sc.nextInt();
			//v2 = sc.nextInt();
			v1 = test[index];
			v2 = test[index+1];
			index = index + 2;
			if(v1 == -1 && v2 == -1) break;
			map[v1][v2] = map[v2][v1] = 1;
			
		}
		BFS(start);
	}
}
