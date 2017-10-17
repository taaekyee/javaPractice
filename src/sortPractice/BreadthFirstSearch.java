package sortPractice;

import java.util.Scanner;

public class BreadthFirstSearch {

	//������ �ƴ� ť�� �̿�
	//Ʈ���� �׷��������� Ž���� ���
	//�ʺ� �켱 Ž���� ���̰� 1�� ��� ������ �湮�ϰ� ����,
	//�� �������� ���̰� 2�� ��� ������, ���̰� 3�� ��� ������ �湮�ϴ� ������ ��� �湮�ϴٰ�
	//�� �̻� �湮�� ���� ������ Ž���� ��ħ
	//=> ���� �켱 Ž���� �ٸ��� ������ ���� ������ Ž���� �����ϴ� �� �ƴ϶�, �̰����� ���캸�鼭 Ž���� �����ϴ� ��
	
	static int n; //�ԷµǴ� ������ �ִ�
	static int rear, front; //���ܰ� �Ĵ��� ������ ����
	
	//���� ��İ� ť�� �湮 �迭
	static int map[][] = new int[30][30];
	static int[] queue = new int[30];
	static int[] visit = new int[30];
	
	static void BFS(int v){
		int i = 0;
		
		visit[v] = 1; //���� v�� �湮
		System.out.println(v+"���� ����");
		
		queue[rear++] = v; //ť�� v�� �����ϰ� �Ĵ��� 1 ������Ŵ
		while(front < rear){ //�Ĵܰ� ������ ���ų� ������ �ݺ� Ż��
			
			//ť�� ù ��°�� �ִ� �����͸� �����ϰ� ���ܵ� ���� ��������, ���� 1����
			v = queue[front++];
			for(i = 0; i<=n;i++){
				//���� v�� ���� i�� ������, ���� i�� �湮���� ���� ������ ���
				if(map[v][i] == 1 && visit[i] != 1){
					visit[i] = 1; //���� i�� �湮
					System.out.println(v+"���� "+i+"�� �̵�");
					queue[rear++] = i; //ť�� i�� �����ϰ� �Ĵ��� 1 ������Ŵ
				}
			}
		}
	}
	public static void main(String[] args) {
		int start; //���� ����
		int v1,v2;
		n = 6;
		start = 1;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			v1 = sc.nextInt();
			v2 = sc.nextInt();
			if(v1 == -1 && v2 == -1) break;
			map[v1][v2] = map[v2][v1] = 1;
			
		}
		BFS(start);
	}
}
