package woowahan;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in))
		{
//			int x1 = s.nextInt();
//			int y1 = s.nextInt();
//			int x2 = s.nextInt();
//			int y2 = s.nextInt();
//			int x3 = s.nextInt();
//			int y3 = s.nextInt();
//			int x4 = s.nextInt();
//			int y4 = s.nextInt();
//			int x5 = s.nextInt();
//			int y5 = s.nextInt();
//			int x6 = s.nextInt();
//			int y6 = s.nextInt();
			
			int x1 = 700;
			int y1 = 400;
			int x2 = 1600;
			int y2 = 1100;
			int x3 = 0;
			int y3 = 400;
			int x4 = 1100;
			int y4 = 900;
			int x5 = 900;
			int y5 = 0;
			int x6 = 1800;
			int y6 = 650;
			
			//여기부터 작성해 주세요
			int[][] map = new int[10000][10000];
			for(int i = x1;i<=x2;i++){
				for(int j = y1;j<=y2;j++){
					map[i][j] = 1;
				}
			}
			for(int i = x3;i<=x4;i++){
				for(int j = y3;j<=y4;j++){
					if(map[i][j] == 1) map[i][j] = 2;
				}
			}
			for(int i = x5;i<=x6;i++){
				for(int j = y5;j<=y6;j++){
					if(map[i][j] == 1) map[i][j] = 3;
				}
			}
			int cnt = 0;
			for(int i = 0;i<1000;i++){
				for(int j = 0;j<2000;j++){
					//if(map[i][j] == 1) cnt++;
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
			System.out.println(cnt);

		}
  }
}
