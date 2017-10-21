package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b14502 {
	//벽을 3개만 세울 수 있기 때문에 모든 경우의 수를 완전탐색 최대 (N*N C 3) 개
	//벽을 세우면 바이러스를 퍼트려 감염구역을 설정
	//안전구역의 수를 count
	static final int BLANK = 0;
	static final int WALL = 1;
	static final int VIRUS = 2;
	static final int ADDWALL = 3;
	static final int[] dx = {-1,0,1,0};
	static final int[] dy = {0,-1,0,1};
	static int N, M;
	static int[][] map;
	static int nWall = 0;
	static int safetyMaxArea = -1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//N = sc.nextInt();
		//M = sc.nextInt();
		N=7;M=7;
		map = new int[N][M];		
		
		int k = 0;
		int[] sample = {2,0,0,0,1,1,0,
						0,0,1,0,1,2,0,
						0,1,1,0,1,0,0,
						0,1,0,0,0,0,0,
						0,0,0,0,0,1,1,
						0,1,0,0,0,0,0,
						0,1,0,0,0,0,0};
//		int[] sample = {0,0,0,0,0,0,
//						1,0,0,0,0,2,
//						1,1,1,0,0,2,
//						0,0,0,0,0,2};
//		int[] sample = {2,0,0,0,0,0,0,2,
//						2,0,0,0,0,0,0,2,
//						2,0,0,0,0,0,0,2,
//						2,0,0,0,0,0,0,2,
//						2,0,0,0,0,0,0,2,
//						0,0,0,0,0,0,0,0,
//						0,0,0,0,0,0,0,0,
//						0,0,0,0,0,0,0,0};
//		
		
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				//map[i][j] = sc.nextInt();
				map[i][j] = sample[k++];
				if(map[i][j] == WALL) nWall++; //벽의 개수 저장
			}
		}
		
		// solve
        int[] wallPos = new int[ADDWALL];
        combination(wallPos, 0, 0, N * M, ADDWALL);
        
        System.out.println(safetyMaxArea);
		
	}
	
	//(벽을 세울 위치 배열, 세운 벽의 갯수, target, map의 크기, 세울 벽의 수) 를 인자로 전달
	static void combination(int[] arr, int depth, int target, int n, int k){
		//벽을 다 세우면
		if(depth == k){
			commitMap(arr); //map에 벽을 적용
			findSaftyArea(); //안전장소 탐색
			rollbackMap(arr); //원래로 복귀
			return;
		}
		if(target == n){
			return; // N*M번 반복하면 리턴
		}
		//System.out.println(target/M+" "+target%M);
		
		//벽을 세울 수 있는 위치에만
		if(map[target / M][target % M] == BLANK){
			arr[depth] = target; 
			combination(arr, depth + 1, target + 1, n, k);
		}
		combination(arr, depth, target + 1, n, k);
	}
	
	static void findSaftyArea(){
		boolean[][] visited = new boolean[N][M];
		for(int i =0; i < N; i++){
			Arrays.fill(visited[i], false);
		}
		int virusArea = 0;
		for(int i = 0; i < N; i++){
			for(int j = 0; j < M;j++){
				if(map[i][j] == VIRUS && !visited[i][j] ) virusArea += dfs(i,j,visited);
			}
		}
		safetyMaxArea = Math.max(safetyMaxArea, N*M-(virusArea + nWall + ADDWALL));
	}
	
	static int dfs(int row, int col, boolean[][] visited){
		
		visited[row][col] = true;
		
		int ret = 1;
		for(int i=0;i<4;i++){
			int nextRow = row + dx[i];
			int nextCol = col + dy[i];
			
			if(nextRow<0 || nextRow>=N || nextCol<0 || nextCol>=M) continue;
			
			if(map[nextRow][nextCol] != WALL && !visited[nextRow][nextCol]){
				ret += dfs(nextRow,nextCol,visited);
			}
		}
		return ret;
	}
	
	static void commitMap(int[] arr) {

        for (int i = 0; i < ADDWALL; i++) {

            int row = arr[i] / M;
            int col = arr[i] % M;

            map[row][col] = WALL;
        }
    }

    static void rollbackMap(int[] arr) {

        for (int i = 0; i < ADDWALL; i++) {

            int row = arr[i] / M;
            int col = arr[i] % M;

            map[row][col] = BLANK;
        }
    }

	
}