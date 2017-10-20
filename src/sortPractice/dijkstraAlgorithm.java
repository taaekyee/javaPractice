package sortPractice;

public class dijkstraAlgorithm {

	//�׷������� ��������� ��ǥ�������� �ִܰŸ��� ���� �� ����ϴ� �˰���
	
	//�� ���� ����: �ִ� �Ÿ��� ������ ����(int distance[n+1]), �ش� ��忡 �湮�ߴ��� üũ�� ����(boolean check[n+1])
	//����
	//1. distance�� ó���� ���� �� �ִ� ���� ū ������ �ʱ�ȭ(ex.Integer.MAX_VALUE)
	//2. ���۳���� �Ÿ��� 0���� ǥ��(�ڱ��ڽű��� �Ÿ��� 0), ���۳���� check�� true��
	//3. ���۳��� ����Ǿ� �ִ� ������ distance ���� ����
	//4. �湮���� ���� ��� �� distance ���� �ּ��� ��� min_node�� ã��
	//5. min_node�� check ���� true�� ����
	//	�׸��� min_node�� ����� ����(�湮���� ����) distance���� ����
	//	�� ��, min_node�� ����� distance ����
	//	distance[min_node] + (min_node�� �� ����� �Ÿ�) ���� ū��� distance ���� distance[min_node] + (min_node�� �� ����� �Ÿ�)�� ����
	//4~5�� ��� ��带 �湮�� ������ �ݺ�
	
	private int n; //������ ��
	private int map[][]; //���鰣�� ����ġ�� ������ ����
	
	public dijkstraAlgorithm(int n){
		this.n = n;
		map = new int[n+1][n+1];
	}
	public void input(int i, int j, int w){
		map[i][j] = w;
		map[j][i] = w;
	}
	
	public void dijkstra(int v){
		int distance[] = new int[n+1]; //�ִܰŸ��� ������ ����
		boolean[] check = new boolean[n+1]; //�ش� ��带 �湮�ߴ��� üũ�� ����
		
		//distance �� �ʱ�ȭ
		for(int i = 1;i<=n;i++){
			distance[i] = Integer.MAX_VALUE;
		}
		//���۳�� �� �ʱ�ȭ
		distance[v] = 0;
		check[v] = true;
		
		//������ distance ����
		for(int i = 1; i <=n;i++){
			if(!check[i] && map[v][i] != 0){
				distance[i] = map[v][i];
			}
		}
		
		for(int a = 0; a<n-1;a++){
			//������ ��� ��尡 true�� ������ �ε�
			//��尡 n�� ���� �� ���ͽ�Ʈ�� ���ؼ� �ݺ����� n-1���̸� �ȴ�.
			//������ ������ ������ ��尡 ��� true���� Ȯ���ϴ� ������ ����
			int min = Integer.MAX_VALUE;
			int min_index = -1;
			
			//�ּҰ� ã��
			for(int i = 1; i < n+1; i++){
				if(!check[i] && distance[i] != Integer.MAX_VALUE){
					if(distance[i]<min){
						min = distance[i];
						min_index = i;
					}
				}
				System.out.print(distance[i]+" ");
			}
			
			//�߰���� ���
			for(int i = 1;i<n+1;i++){
//				System.out.print(distance[i]+" ");
			}
			System.out.println();
			
			check[min_index] = true;
			for(int i = 1; i < n+1; i++){
				if(!check[i] && map[min_index][i] != 0){
					if(distance[i] > distance[min_index]+map[min_index][i]){
						distance[i] = distance[min_index]+map[min_index][i];
					}
				}
				System.out.print(distance[i]+" ");
			}
			System.out.println();
		}
		//����� ���
		for(int i = 1;i<n+1;i++){
			System.out.print(distance[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		dijkstraAlgorithm g = new dijkstraAlgorithm(8);
		g.input(1, 2, 3);
        g.input(1, 5, 4);
        g.input(1, 4, 4);
        g.input(2, 3, 2);
        g.input(3, 4, 1);
        g.input(4, 5, 2);
        g.input(5, 6, 4);
        g.input(4, 7, 6);
        g.input(7, 6, 3);
        g.input(3, 8, 3);
        g.input(6, 8, 2);
        g.dijkstra(1);

	}
	
}
