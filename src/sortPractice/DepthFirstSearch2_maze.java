package sortPractice;

import java.util.Scanner;

public class DepthFirstSearch2_maze {

	static int n, min; //���� ũ��� �ּҰ��� ������ ����
	static int[][] map = null;
	//= new int[10][10]; //��
			
	static void DFS(int x, int y, int l){
		
		System.out.println(y+" "+x);
		//���� ������ �ٴٸ�
		if(x == n-1 && y == n-1 ){
			//���� �ּҰ��� l���� ũ��, l�� ���� ���̹Ƿ� l�� �ּҰ����� ����
			if(min > l) min = l;
			return;
		}
		map[y][x] = 0; //�湮������ ǥ��
		//���� �̵��� �� �ִٸ� �̵�
		if(y>0 && map[y-1][x] != 0) DFS(x,y-1,l+1);
		//�Ʒ��� �̵��� �� �ִٸ� �̵�
		if(y<n-1 && map[y+1][x] != 0) DFS(x, y+1,l+1);
		//�������� �̵��� �� �ִٸ� �̵�
		if(x>0 && map[y][x-1] != 0) DFS(x-1,y,l+1);
		//���������� �̵��� �� �ִٸ� �̵�
		if(x<n-1 && map[y][x+1] != 0) DFS(x+1,y,l+1);
		
		map[y][x] = 1; //������ �ڸ��� �����·� �ǵ���
	}
	
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		n = 5;
		min = n*n;
		
		map = new int[][]{
				{1,1,1,1,1},
				{0,0,0,0,1},
				{1,1,1,1,1},
				{1,0,1,0,0},
				{1,1,1,1,1}
				};
		
		DFS(0,0,1);
		
		System.out.println(min);
	}
}
