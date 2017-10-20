package baekjoon;

public class b14503 {
	static int n,m;
	static int r,c,d;
	static int cnt=1;
	static int[][] map;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	
	public static void main(String[] args) {
//		n=3;
//		m=3;
//		r=1;
//		c=1;
//		d=0;
//		map = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
		
		n=11;m=10;r=7;c=4;d=0;
		map = new int[][]{{1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,1,1,1,1,0,1},
			{1,0,0,1,1,0,0,0,0,1},
			{1,0,1,1,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,1,0,1},
			{1,0,0,0,0,0,1,1,0,1},
			{1,0,0,0,0,0,1,1,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1}};
			
		map[r][c] = 2;
		DFS(r,c,d);
		System.out.println(cnt);
	}
	
	public static void DFS(int x, int y, int d){
		int cd=d;
		int cx;
		int cy;
		
		for(int i = 0; i < 4;i++){ //4방향
			cd = (cd+3)%4; //왼쪽을 바라봄
			cx = x + dx[cd];
			cy = y + dy[cd];
			
			if(cx<1||cx>=n-1||cy<1||cy>=m-1 || map[cx][cy]==1) continue;
			
			if(map[cx][cy]==0){
				map[cx][cy]=2; //청소함
				cnt++;
				DFS(cx,cy,cd);
				return;}
		 }
		//4방향 중 방문할 곳이 없으면
		cd=(d+2)%4; //후진을 위한 방향 설정
		//후진
		cx = x + dx[cd];
		cy = y + dy[cd];
		
		if(map[cx][cy]==1)
			return; //벽이라면 종료
		else 
			DFS(cx,cy,d);
		
	}
	/*static void DFS(int x, int y, int d){
        int cx, cy, cd=d;   //현재 함수 내의 x,y,d 값 저장을 위한 변수
         
        for(int i=0;i<4;i++){    //총 4방향으로 이동할 수 있으므로 4번 돌림
            cd=(cd+3)%4;    //방향을 바꾸기 위한 식  // 북,서,남,동(0,3,2,1) 순서로 변경
            cx=x+dx[cd];   
            cy=y+dy[cd];    // 머리를 둔 방향으로 한칸 이동
             
            if(cx>n-2 || cx<1 || cy>m-2 || cy<1 || map[cx][cy]==1)  //이동한 칸이 벽이면
                continue;   //위로 돌아가서 방향 바꿈
            if(map[cx][cy]==0){ //청소 안한 칸이면
                cnt++;    //청소하고 카운트 증가
                map[cx][cy]=2;  //청소했다고 표시 
                DFS(cx,cy,cd);  //다음칸 방문을 위해 dfs함수 호출
                return;
            }
        }
        //4방향의 칸 중 방문할 칸이 없으면
        cd=(d+2)%4;     // 후진을 위한 방향 설정
        // 후진
        cx=x+dx[cd];   
        cy=y+dy[cd];
        if(map[cx][cy]==1)  //후진한 곳이 벽이면 리턴
            return;
        else    //아니면
            DFS(cx,cy,d);   //현재 위치와 기존의 방향으로 dfs함수 호출
    }
*/
}
