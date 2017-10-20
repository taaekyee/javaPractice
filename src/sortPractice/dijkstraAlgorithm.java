package sortPractice;

public class dijkstraAlgorithm {

	//그래프에서 출발점에서 목표점까지의 최단거리를 구할 때 사용하는 알고리즘
	
	//두 가지 변수: 최단 거리를 저장할 변수(int distance[n+1]), 해당 노드에 방문했는지 체크할 변수(boolean check[n+1])
	//순서
	//1. distance는 처음에 나올 수 있는 가장 큰 값으로 초기화(ex.Integer.MAX_VALUE)
	//2. 시작노드의 거리를 0으로 표시(자기자신까지 거리는 0), 시작노드의 check를 true로
	//3. 시작노드와 연결되어 있는 노드들의 distance 값을 갱신
	//4. 방문하지 않은 노드 중 distance 값이 최소인 노드 min_node를 찾음
	//5. min_node의 check 값을 true로 변경
	//	그리고 min_node와 연결된 노드들(방문하지 않은) distance값을 갱신
	//	이 때, min_node와 연결된 distance 값이
	//	distance[min_node] + (min_node와 그 노드의 거리) 보다 큰경우 distance 값을 distance[min_node] + (min_node와 그 노드의 거리)로 갱신
	//4~5를 모든 노드를 방문할 때까지 반복
	
	private int n; //노드들의 수
	private int map[][]; //노드들간의 가중치를 저장할 변수
	
	public dijkstraAlgorithm(int n){
		this.n = n;
		map = new int[n+1][n+1];
	}
	public void input(int i, int j, int w){
		map[i][j] = w;
		map[j][i] = w;
	}
	
	public void dijkstra(int v){
		int distance[] = new int[n+1]; //최단거리를 저장할 변수
		boolean[] check = new boolean[n+1]; //해당 노드를 방문했는지 체크할 변수
		
		//distance 값 초기화
		for(int i = 1;i<=n;i++){
			distance[i] = Integer.MAX_VALUE;
		}
		//시작노드 값 초기화
		distance[v] = 0;
		check[v] = true;
		
		//연결노드 distance 갱신
		for(int i = 1; i <=n;i++){
			if(!check[i] && map[v][i] != 0){
				distance[i] = map[v][i];
			}
		}
		
		for(int a = 0; a<n-1;a++){
			//원래는 모든 노드가 true될 때까지 인데
			//노드가 n개 있을 때 다익스트라를 위해서 반복수는 n-1번이면 된다.
			//원하지 않으면 각각의 노드가 모두 true인지 확인하는 식으로 구현
			int min = Integer.MAX_VALUE;
			int min_index = -1;
			
			//최소값 찾기
			for(int i = 1; i < n+1; i++){
				if(!check[i] && distance[i] != Integer.MAX_VALUE){
					if(distance[i]<min){
						min = distance[i];
						min_index = i;
					}
				}
				System.out.print(distance[i]+" ");
			}
			
			//중간결과 출력
			for(int i = 1;i<n+1;i++){
//				System.out.print(distance[i]+" ");
			}
			System.out.println();
			
			check[min_index] = true;
			for(int i = 1; i < n+1; i++){
				if(!check[i] && map[min_index][i] != 0){
					if(distance[i] > distance[min_index]+map[min_index][i]){
						distance[i] = distance[min_index]+map[min_index][i];
					}
				}
				System.out.print(distance[i]+" ");
			}
			System.out.println();
		}
		//결과값 출력
		for(int i = 1;i<n+1;i++){
			System.out.print(distance[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		dijkstraAlgorithm g = new dijkstraAlgorithm(8);
		g.input(1, 2, 3);
        g.input(1, 5, 4);
        g.input(1, 4, 4);
        g.input(2, 3, 2);
        g.input(3, 4, 1);
        g.input(4, 5, 2);
        g.input(5, 6, 4);
        g.input(4, 7, 6);
        g.input(7, 6, 3);
        g.input(3, 8, 3);
        g.input(6, 8, 2);
        g.dijkstra(1);

	}
	
}
