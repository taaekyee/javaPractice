package sortPractice;

import java.util.Scanner;

public class DepthFirstSearch {

	//������ �̿��ϰ�, Ʈ�� Ȥ�� �׷��� ���� �ڷᱸ������ �����͸� Ž���� �� ����ϴ� �˰���
	//�� �̻� ���ư� ���� ������ ���� ��ŭ ���� ���� Ư¡�� ����
	//���� ���ư� ���� �������� ������ �� ���� ��ġ�� ���ƿ� �ٸ� ���� �����Ͽ� �����δ�.
	
	//������ ���� ������ ���� ���踦 ��Ÿ���� ���� ���� ���(Adjacency Matrix)�� ���
	//�������: ������ �������踦 ����� ���� ��Ÿ���� ��
	
	static int n; //������ �� ����
	static int[][] map = new int[30][30]; //�������
	static int[] visit = new int[30]; //�湮 ����
	
/*	static void DFS(int v){
		int i;
		
		visit[v] = 1; //���� v�� �湮
		for(i=1;i<=n;i++){
			//���� v�� i�� ����Ǿ��ְ�, ���� i�� �湮���� �ʾҴٸ�
			if(map[v][i] == 1 && visit[i] != 1){
				System.out.println(v+"���� "+i+"�� �̵�");
				//���� i���� �ٽ� DFS�� �ҷ���
				DFS(i);
			}
		}
	}*/
	static void DFS(int v){
		int i;
		
		visit[v] = 1; //�湮 ǥ��
		for(i = 1;i<=n;i++){
			//v�� i�� ����Ǿ��ְ� => map[v][i] == 1
			//i�� �湮���� �ʾҴٸ� => visit[i] != 1
			if(map[v][i] == 1 && visit[i] != 1){
				System.out.println(v+"���� "+i+"�� �̵�");
				DFS(i); //���� i���� �ٽ� �ҷ���
			}
		}
		
	}
	public static void main(String[] args) {
		int start; //���� ����
		int v1,v2;

		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���� �Է� ");
		n = sc.nextInt();
		
		System.out.print("���� ���� �Է� ");
		start = sc.nextInt();
		
		int index=0;
		while(true){
			v1 = sc.nextInt();
			v2 = sc.nextInt();
			index++;
			if(v1 == -1 && v2 == -1) break;
			map[v1][v2] = map[v2][v1] = 1;
			
		}
		DFS(start);
		
	}
	
	
}
