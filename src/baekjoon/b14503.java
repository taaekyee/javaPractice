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
		
		for(int i = 0; i < 4;i++){ //4����
			cd = (cd+3)%4; //������ �ٶ�
			cx = x + dx[cd];
			cy = y + dy[cd];
			
			if(cx<1||cx>=n-1||cy<1||cy>=m-1 || map[cx][cy]==1) continue;
			
			if(map[cx][cy]==0){
				map[cx][cy]=2; //û����
				cnt++;
				DFS(cx,cy,cd);
				return;}
		 }
		//4���� �� �湮�� ���� ������
		cd=(d+2)%4; //������ ���� ���� ����
		//����
		cx = x + dx[cd];
		cy = y + dy[cd];
		
		if(map[cx][cy]==1)
			return; //���̶�� ����
		else 
			DFS(cx,cy,d);
		
	}
	/*static void DFS(int x, int y, int d){
        int cx, cy, cd=d;   //���� �Լ� ���� x,y,d �� ������ ���� ����
         
        for(int i=0;i<4;i++){    //�� 4�������� �̵��� �� �����Ƿ� 4�� ����
            cd=(cd+3)%4;    //������ �ٲٱ� ���� ��  // ��,��,��,��(0,3,2,1) ������ ����
            cx=x+dx[cd];   
            cy=y+dy[cd];    // �Ӹ��� �� �������� ��ĭ �̵�
             
            if(cx>n-2 || cx<1 || cy>m-2 || cy<1 || map[cx][cy]==1)  //�̵��� ĭ�� ���̸�
                continue;   //���� ���ư��� ���� �ٲ�
            if(map[cx][cy]==0){ //û�� ���� ĭ�̸�
                cnt++;    //û���ϰ� ī��Ʈ ����
                map[cx][cy]=2;  //û���ߴٰ� ǥ�� 
                DFS(cx,cy,cd);  //����ĭ �湮�� ���� dfs�Լ� ȣ��
                return;
            }
        }
        //4������ ĭ �� �湮�� ĭ�� ������
        cd=(d+2)%4;     // ������ ���� ���� ����
        // ����
        cx=x+dx[cd];   
        cy=y+dy[cd];
        if(map[cx][cy]==1)  //������ ���� ���̸� ����
            return;
        else    //�ƴϸ�
            DFS(cx,cy,d);   //���� ��ġ�� ������ �������� dfs�Լ� ȣ��
    }
*/
}
