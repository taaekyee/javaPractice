package woowahan;

public class test6 {
	public static int solution(int N, String S) {
		boolean[][] check = new boolean[N][10];
		String[] strs = S.split(" ");
		
		try {
			for (int i = 0; i < strs.length; i++) {
				switch (strs[i].charAt(1)) {
				case 'A':
					check[strs[i].charAt(0) - '0' - 1][0] = true;
					break;
				case 'B':
					check[strs[i].charAt(0) - '0' - 1][1] = true;
					break;
				case 'C':
					check[strs[i].charAt(0) - '0' - 1][2] = true;
					break;
				case 'D':
					check[strs[i].charAt(0) - '0' - 1][3] = true;
					break;
				case 'E':
					check[strs[i].charAt(0) - '0' - 1][4] = true;
					break;
				case 'F':
					check[strs[i].charAt(0) - '0' - 1][5] = true;
					break;
				case 'G':
					check[strs[i].charAt(0) - '0' - 1][6] = true;
					break;
				case 'H':
					check[strs[i].charAt(0) - '0' - 1][7] = true;
					break;
				case 'J':
					check[strs[i].charAt(0) - '0' - 1][8] = true;
					break;
				case 'K':
					check[strs[i].charAt(0) - '0' - 1][9] = true;
					break;
				}
			}
		} catch (Exception e) {

		}

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			// A~C check
			if (!check[i][0] && !check[i][1] && !check[i][2])
				cnt++;
			// D~G check
			if ((!check[i][3] && !check[i][4] && !check[i][5]) || (!check[i][4] && !check[i][5] && !check[i][6]))
				cnt++;
			// H~K check
			if (!check[i][7] && !check[i][8] && !check[i][9])
				cnt++;
		}

		return cnt;
	}

	public static void main(String[] args) {
		int n = 2;
		String s = "";

		System.out.println(solution(n, s));
	}
}
