package sortPractice;

import java.util.Scanner;

public class BreadthFirstSearch2_maze {
	//���̰� N���� �־����� ũ�Ⱑ N*N�� 2���� �迭�� ����

	static int n, cnt; // ���� ũ��� ī��Ʈ ����
	static int[][] map = new int[10][10];
	
	//��ǥ�� ���̸� ������ �迭
	static int[] x= new int[100];
	static int[] y= new int[100];
	static int[] l= new int[100];
	
	//ť�� ��ǥ ������ �Ÿ��� �����ϴ� �Լ� -> l�� (x,y)�� �����ϱ� ���� �ɸ��� �Ÿ�
	static void enqueue(int _x, int _y, int _l){
		x[cnt] = _x;
		y[cnt] = _y;
		l[cnt] = _l;
		
		System.out.println("cnt: "+ cnt);
		System.out.print(x[cnt]+" ");
		System.out.print(y[cnt]+" ");
		System.out.println(l[cnt]+" ");

		cnt++;
	}
	
	static void BFS(int _x, int _y){
		int pos = 0;
		
		//�������� ��ǥ ������ ���̸� ť�� ����
		enqueue(_x, _y, 1);
		
		//�� �̻� �湮�� ������ ���ų�, ���� ������ �����ϸ� ������ Ż���Ѵ�.
		while(pos < cnt && (x[pos] != n-1 || y[pos] != n-1)){
			//�� �� �湮�ϰ� �ϸ� �ȵǹǷ�, �̹� �������� ǥ��
			map[y[pos]][x[pos]] = 0;
			
			//���� �� �� �ִٸ�, �� ������ ��ǥ ������ ���̸� ť�� ����
			if(y[pos] > 0 && map[y[pos]-1][x[pos]] == 1)
				enqueue(x[pos], y[pos], l[pos]+1);
			//�Ʒ��� �� �� �ִٸ�, �� ������ ��ǥ ������ ���̸� ť�� ����
			if(y[pos] < n-1 && map[y[pos]+1][x[pos]] == 1)
				enqueue(x[pos], y[pos]+1, l[pos]+1);
			//���ʷ� �� �� �ִٸ�, �� ������ ��ǥ ������ ���̸� ť�� ����
			if(x[pos] > 0 && map[y[pos]][x[pos]-1] == 1)
				enqueue(x[pos]-1, y[pos], l[pos]+1);
			//�����ʷ� �� �� �ִٸ�, �� ������ ��ǥ ������ ���̸� ť�� ����
			if(x[pos] < n-1 && map[y[pos]][x[pos]+1] == 1)
				enqueue(x[pos]+1, y[pos], l[pos]+1);
			
			//ť�� ���� ������ ������ �湮
			pos++;
		}
		
		//cnt�� pos���� ũ�ٸ�, ���� ������ ������ ������ ���̴�.
		//���� �ݺ����� �������� �����ϰ� �Ǹ� ������ �ٷ� ���������� ������,
		//���̸� �����ϴ� ť�� ������ ��Ұ� �ִ� ����� ���̶�� �� �� �ִ�.
		if(pos < cnt)
			System.out.println("�ִ� ����� ����: "+l[pos]);
//		for(int k = 0;k<pos;k++){
//			System.out.println("x: "+ x[k]+" y: "+ y[k]+" l: "+ l[k]);
//		}
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
