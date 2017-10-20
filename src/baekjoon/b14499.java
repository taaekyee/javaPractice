package baekjoon;

public class b14499 {
	static int n,m;
	static int r,c;	
	static int k;
	static int[][] map;
	static int[] dice = {0,0,0,0,0,0}; //
	static int[] dir;
	static int cnt;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,-1,1};
	
	public static void rollDice(int d, int y, int x){
		int temp;
		//System.out.println(x + " " + y);
		if(x<0 ||x>=n ||y>=m || y<0) return;
		switch(d){
		case 1: //µ¿
			temp = dice[1];
			dice[1] = dice[5];
			dice[5] = dice[3];
			dice[3] = dice[2];
			dice[2] = temp;
			copyMap(x,y);
			break;
		case 2: //¼­
			temp = dice[1];
			dice[1] = dice[2];
			dice[2] = dice[3];
			dice[3] = dice[5];
			dice[5] = temp;
			copyMap(x,y);
			break;
		case 3: //³²
			temp = dice[0];
			dice[0] = dice[5];
			dice[5] = dice[4];
			dice[4] = dice[2];
			dice[2] = temp;
			copyMap(x,y);
			break;
		case 4: //ºÏ
			temp = dice[0];
			dice[0] = dice[2];
			dice[2] = dice[4];
			dice[4] = dice[5];
			dice[5] = temp;
			copyMap(x,y);
			break;
		}
		
	}
	public static void copyMap(int x, int y){
		if(map[x][y] == 0){
			map[x][y] = dice[5];
		}else{
			dice[5] = map[x][y];
			map[x][y] = 0;
		}
		System.out.println(dice[2]);
	}
	
	public static void main(String[] args) {
		n=4;
		m=2;
		r=0;
		c=0;
		k=8;
		map = new int[n][m];
		map = new int[][]{{0,2},
				{3,4},
				{5,6},
				{7,8}};
		dir = new int[]{4,4,4,1,3,3,3,2};
		k = dir.length;
		
		
		for(int i = 0;i<k;i++){
			r = r + dx[dir[i]-1];
			c = c + dy[dir[i]-1];
			
			rollDice(dir[i],r,c);
		}
				
	}
}
