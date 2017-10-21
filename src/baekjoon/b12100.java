package baekjoon;

import java.util.*;

public class b12100 {
//	static int N = 3;
//	static int M = 3;
//	static int[][] map = {{2,2,2},{4,4,4},{8,8,8}};
//	static int N = 2;
//	static int M = 2;
//	static int[][] map = {{8,16},{16,8}};
//	static int N = 4;
//	static int M = 4;
//	static int[][] map = {{8,16,0,0},{0,0,16,8},{0,0,0,0},{0,0,0,0}};
	static int N = 4;
	static int M = 4;
	static int[][] map = {{0,0,0,0},{4,0,0,0},{8,32,4,0},{8,8,4,0}};
	
	static int max = 0;
	static int cnt = 0;
	
	public static void DFS(int d){
		if(d==5){
			for(int i = 0;i<N;i++){
				for(int j = 0;j<M;j++){
					if(max<map[i][j]) max = map[i][j];
				}
			}
			return;
		}
		
		for(int i = 0 ;i<4;i++){
			swipe(i);
			DFS(d+1);
		}
		
	}
	
	public static void swipe(int v){
		//ArrayList<Integer> al = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		
		switch(v){
			case 0: //위로
				for(int i=0;i<N;i++){
					for(int j=0;j<M;j++){
						if(map[j][i]!=0) q.offer(map[j][i]);
						map[j][i]=0;
					}
					int idx = 0;
					int pop_data = 0;
					while(!q.isEmpty()){
						pop_data = q.poll();
						//q.remove();
						if(map[idx][i] == 0) map[idx][i] = pop_data;
						else if(map[idx][i] == pop_data){
							map[idx][i] *= 2;
							idx++;
						}else map[++idx][i] = pop_data;
					}
				}
				break;
			case 1: //아래로
				for(int i=0;i<N;i++){
					for(int j=M-1;j>=0;j--){
						if(map[j][i]!=0) q.offer(map[j][i]);
						map[j][i]=0;
					}
					int idx = N-1;
					int pop_data = 0;
					while(!q.isEmpty()){
						pop_data = q.poll();
						//q.remove();
						if(map[idx][i] == 0) map[idx][i] = pop_data;
						else if(map[idx][i] == pop_data){
							map[idx][i] *= 2;
							idx--;
						}else map[--idx][i] = pop_data;
					}
				}
				break;
			case 2: //왼으로
				for(int i=0;i<N;i++){
					for(int j=0;j<M;j++){
						if(map[i][j]!=0) q.offer(map[i][j]); 
						map[i][j]=0;
					}
					int idx = 0;
					int pop_data = 0;
					while(!q.isEmpty()){
						pop_data = q.poll();
						//q.remove();
						if(map[i][idx] == 0) map[i][idx] = pop_data;
						else if(map[i][idx] == pop_data){
							map[i][idx] *= 2;
							idx++;
						}else map[i][++idx] = pop_data;
					}
				}
				break;
			case 3: //오른으로
				for(int i=0;i<N;i++){
					for(int j=N-1;j>=0;j--){
						if(map[i][j]!=0) q.offer(map[i][j]);
						map[i][j]=0;
					}
					int idx = N-1;
					int pop_data = 0;
					while(!q.isEmpty()){
						pop_data = q.poll();
						//q.remove();
						if(map[i][idx] == 0) map[i][idx] = pop_data;
						else if(map[i][idx] == pop_data){
							map[i][idx] *= 2;
							idx--;
						}else map[i][--idx] = pop_data;
					}
				}
				break;
				
		}
		
	}
	
	
	public static void main(String[] args) {
		DFS(0);
		System.out.println(max);
	}
}
