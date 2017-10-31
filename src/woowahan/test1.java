package woowahan;

import java.util.*;

public class test1 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int d = s.nextInt();
			int k = s.nextInt();
			int j = s.nextInt();

			// 여기부터 작성해 주세요
			List<Integer> candi = new ArrayList<>();

			int cnt = 1;
			for (int i = 0; i < n; i++) {
				candi.add(cnt++);
			}

			int idx = 0;

			// 시계방향
			if (d == 1) {
				while (n > 1) {
					idx += k; // 탈락시킬 사람의 위치 (시계)
					if (idx >= n) // 위치가 인원 수를 초과하면 보정
						idx %= n;

					candi.remove(idx); // 탈락
					n--; // 총 인원 감소

					k += j; // k값 보정
					idx--; // 탈락자 위치 보정
				}
			} else {
				// 반시계방향
				while (n > 1) {
					idx -= k; // 탈락시킬 사람의 위치 (반시계)
					if (idx < 0) { // 위치가 음수이면 보정
						idx %= n;
						if (idx != 0)
							idx += n;
					}

					candi.remove(idx); // 탈락
					n--; // 총인원 감소

					k += j; // k값 보정
				}
			}

			System.out.println(candi.get(0));

		}
	}
}
