package test;

import java.util.*;
public class BFS_maze_usequeue {
	//���̰� N���� �־����� ũ�Ⱑ N*N�� 2���� �迭�� ����

		static int n, cnt; // ���� ũ��� ī��Ʈ ����
		static int[][] map = new int[10][10];
		
		//��ǥ�� ���̸� ������ �迭
		static Queue<Integer> x = new LinkedList<>();
		static Queue<Integer> y = new LinkedList<>();
		static Queue<Integer> l = new LinkedList<>();
		
		//ť�� ��ǥ ������ �Ÿ��� �����ϴ� �Լ� -> l�� (x,y)�� �����ϱ� ���� �ɸ��� �Ÿ�
		static void enqueue(int _x, int _y, int _l){
			x.offer(_x);
			y.offer(_y);
			l.offer(_l);
		}
		
		static void BFS(int _x, int _y){
			int pos = 0;
			
			//�������� ��ǥ ������ ���̸� ť�� ����
			enqueue(_x, _y, 1);
			
			int ll = 0;
			//�� �̻� �湮�� ������ ���ų�, ���� ������ �����ϸ� ������ Ż���Ѵ�.
			while(!x.isEmpty() && (x.peek() != n-1 || y.peek() != n-1)){
				int xx = x.poll();
				int yy = y.poll();
				ll = l.poll();
				
				//�� �� �湮�ϰ� �ϸ� �ȵǹǷ�, �̹� �������� ǥ��
				map[xx][yy] = 0;
				
				//���� �� �� �ִٸ�, �� ������ ��ǥ ������ ���̸� ť�� ����
				if(yy > 0 && map[yy-1][xx] == 1)
					enqueue(xx, yy-1, ll+1);
				//�Ʒ��� �� �� �ִٸ�, �� ������ ��ǥ ������ ���̸� ť�� ����
				if(yy < n-1 && map[yy+1][xx] == 1)
					enqueue(xx, yy+1, ll+1);
				//���ʷ� �� �� �ִٸ�, �� ������ ��ǥ ������ ���̸� ť�� ����
				if(xx > 0 && map[yy][xx-1] == 1)
					enqueue(xx-1, yy, ll+1);
				//�����ʷ� �� �� �ִٸ�, �� ������ ��ǥ ������ ���̸� ť�� ����
				if(xx < n-1 && map[yy][xx+1] == 1)
					enqueue(xx+1, yy, ll+1);
			}
			
			//cnt�� pos���� ũ�ٸ�, ���� ������ ������ ������ ���̴�.
			//���� �ݺ����� �������� �����ϰ� �Ǹ� ������ �ٷ� ���������� ������,
			//���̸� �����ϴ� ť�� ������ ��Ұ� �ִ� ����� ���̶�� �� �� �ִ�.
			if(!x.isEmpty())
				System.out.println("�ִ� ����� ����: "+ll);
//			for(int k = 0;k<pos;k++){
//				System.out.println("x: "+ x[k]+" y: "+ y[k]+" l: "+ l[k]);
//			}
		}
		public static void main(String[] args) {
			
			n = 6;
			map = new int[][]{
				{1,1,1,1,1,1},
				{0,0,1,0,0,1},
				{1,1,1,0,1,1},
				{1,0,0,0,1,0},
				{1,1,1,0,1,0},
				{0,0,1,1,1,1}
				};
			
			
			BFS(0,0);
		}
}
