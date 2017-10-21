package sortPractice;

import java.util.Scanner;

public class DepthFirstSearch {

	//스택을 이용하고, 트리 혹은 그래프 같은 자료구조에서 데이터를 탐색할 때 사용하는 알고리즘
	//더 이상 나아갈 길이 보이지 않을 만큼 깊이 들어가는 특징을 가짐
	//만약 나아갈 길이 존재하지 않으면 이 전의 위치로 돌아와 다른 길을 선택하여 움직인다.
	
	//정점과 정점 사이의 인접 관계를 나타내기 위해 인접 행렬(Adjacency Matrix)를 사용
	//인접행렬: 정점의 인접관계를 행렬을 통해 나타내는 것
	
	static int n; //정점의 총 갯수
	static int[][] map = new int[30][30]; //인접행렬
	static int[] visit = new int[30]; //방문 여부
	
/*	static void DFS(int v){
		int i;
		
		visit[v] = 1; //정점 v를 방문
		for(i=1;i<=n;i++){
			//정점 v와 i가 연결되어있고, 정점 i를 방문하지 않았다면
			if(map[v][i] == 1 && visit[i] != 1){
				System.out.println(v+"에서 "+i+"로 이동");
				//정점 i에서 다시 DFS를 불러옴
				DFS(i);
			}
		}
	}*/
	static void DFS(int v){
		int i;
		
		visit[v] = 1; //방문 표시
		for(i = 1;i<=n;i++){
			//v와 i가 연결되어있고 => map[v][i] == 1
			//i를 방문하지 않았다면 => visit[i] != 1
			if(map[v][i] == 1 && visit[i] != 1){
				System.out.println(v+"에서 "+i+"로 이동");
				DFS(i); //정점 i에서 다시 불러옴
			}
		}
		
	}
	public static void main(String[] args) {
		int start; //시작 정점
		int v1,v2;

		Scanner sc = new Scanner(System.in);
		System.out.print("정점의 갯수 입력 ");
		n = sc.nextInt();
		
		System.out.print("시작 정점 입력 ");
		start = sc.nextInt();
		
		int index=0;
		while(true){
			v1 = sc.nextInt();
			v2 = sc.nextInt();
			index++;
			if(v1 == -1 && v2 == -1) break;
			map[v1][v2] = map[v2][v1] = 1;
			
		}
		DFS(start);
		
	}
	
	
}
