package woowahan;

import java.util.*;

public class test1 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int d = s.nextInt();
			int k = s.nextInt();
			int j = s.nextInt();

			// ������� �ۼ��� �ּ���
			List<Integer> candi = new ArrayList<>();

			int cnt = 1;
			for (int i = 0; i < n; i++) {
				candi.add(cnt++);
			}

			int idx = 0;

			// �ð����
			if (d == 1) {
				while (n > 1) {
					idx += k; // Ż����ų ����� ��ġ (�ð�)
					if (idx >= n) // ��ġ�� �ο� ���� �ʰ��ϸ� ����
						idx %= n;

					candi.remove(idx); // Ż��
					n--; // �� �ο� ����

					k += j; // k�� ����
					idx--; // Ż���� ��ġ ����
				}
			} else {
				// �ݽð����
				while (n > 1) {
					idx -= k; // Ż����ų ����� ��ġ (�ݽð�)
					if (idx < 0) { // ��ġ�� �����̸� ����
						idx %= n;
						if (idx != 0)
							idx += n;
					}

					candi.remove(idx); // Ż��
					n--; // ���ο� ����

					k += j; // k�� ����
				}
			}

			System.out.println(candi.get(0));

		}
	}
}
