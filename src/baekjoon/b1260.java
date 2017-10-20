package baekjoon;

import java.util.Scanner;

public class b1260 {
	
	static int n; //������ �� ����
	static int[][] map = new int[30][30]; //�������
	static boolean[] visit = new boolean[30]; //�湮 ����
	
	static void DFS(int v){
		int i;
		
		visit[v] = true; //���� v�� �湮
		for(i=1;i<=n;i++){
			//���� v�� i�� ����Ǿ��ְ�, ���� i�� �湮���� �ʾҴٸ�
			if(map[v][i] == 1 && !visit[i]){
				System.out.println(v+"���� "+i+"�� �̵�");
				//���� i���� �ٽ� DFS�� �ҷ���
				DFS(i);
			}
		}
	}
	
	static int rear, front; //���ܰ� �Ĵ��� ������ ����
	
	//���� ��İ� ť�� �湮 �迭
	static int[] queue = new int[30];
	static boolean[] visit2 = new boolean[30];
	
	static void BFS(int v){
		int i = 0;
		
		visit2[v] = true; //���� v�� �湮
		System.out.println(v+"���� ����");
		
		queue[rear++] = v; //ť�� v�� �����ϰ� �Ĵ��� 1 ������Ŵ
		while(front < rear){ //�Ĵܰ� ������ ���ų� ������ �ݺ� Ż��
			
			//ť�� ù ��°�� �ִ� �����͸� �����ϰ� ���ܵ� ���� ��������, ���� 1����
			v = queue[front++];
			for(i = 0; i<=n;i++){
				//���� v�� ���� i�� ������, ���� i�� �湮���� ���� ������ ���
				if(map[v][i] == 1 && !visit2[i]){
					visit2[i] = true; //���� i�� �湮
					System.out.println(v+"���� "+i+"�� �̵�");
					queue[rear++] = i; //ť�� i�� �����ϰ� �Ĵ��� 1 ������Ŵ
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int m = sc.nextInt();		
		int start = sc.nextInt();
		
		for(int i=0;i<m;i++){
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			map[v1][v2] = 1;
			map[v2][v1] = 1;
		}
		System.out.println("DFS: ");
		DFS(start);
		
		System.out.println("BFS: ");
		BFS(start);
	}
}