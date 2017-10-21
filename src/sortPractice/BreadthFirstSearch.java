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
	
/*	static void BFS(int v){
		int i = 0;
		
		visit[v] = 1; //���� v�� �湮
		System.out.println(v+"���� ����");
		
		queue[rear++] = v; //ť�� v�� �����ϰ� �Ĵ��� 1 ������Ŵ
		while(front < rear){ //�Ĵܰ� ������ ���ų� ������ �ݺ� Ż��

			//ť�� ù ��°�� �ִ� �����͸� �������� ������ 1�����Ͽ� ���ܽ�Ŵ
			v = queue[front++];
			for(i = 0; i<=n;i++){
				//���� v�� ���� i�� ������, ���� i�� �湮���� ���� ������ ���
				//(ť���� ���ܵ� ��(v)�� ����Ǿ� �ְ� ���� �湮���� �ʴ� ������ �湮
				if(map[v][i] == 1 && visit[i] != 1){
					visit[i] = 1; //���� i�� �湮
					System.out.println(v+"���� "+i+"�� �̵�");
					queue[rear++] = i; //ť�� i�� �����ϰ� �Ĵ��� 1 ������Ŵ (i�� �̵��Ͽ����ϱ� i�� ť�� ����)
				}
			}
		}
	}*/
	static void BFS(int v){
		visit[v] = 1;
		
		queue[rear++] = v;
		while(front<rear){
			v = queue[front++];
			for(int i = 0 ;i<=n;i++){
				if(map[v][i] ==1 &&visit[i]==0){
					visit[i]=1;
					System.out.println(v+"���� "+i+"�� �̵�");
					queue[rear++]=i;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		int start; //���� ����
		int v1,v2;
		n = 6;
		start = 1;
		int[] test = {1,2,1,3,2,4,2,5,3,4,3,6,4,5,4,6,5,6,-1,-1};
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		while(true){
			//v1 = sc.nextInt();
			//v2 = sc.nextInt();
			v1 = test[index];
			v2 = test[index+1];
			index = index + 2;
			if(v1 == -1 && v2 == -1) break;
			map[v1][v2] = map[v2][v1] = 1;
			
		}
		BFS(start);
	}
}
