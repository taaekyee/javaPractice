package javaPractice;

public class prac2_wrapper {
	public static void main(String[] args) {
		
		//�⺻�� Ÿ�� (��ü x, ������ x)
		int i = 5;
		//��ü, ������
		Integer i2 = new Integer(5);
		//����ڽ� : �⺻Ÿ�� �����͸� ��ü Ÿ���� �����ͷ� �ڵ� ����ȯ
		Integer i3 = 5;

		//�����ڽ� ��üŸ���� �����͸� �⺻�� Ÿ�� �����ͷ� �ڵ� ����ȯ
		int i5 = i3;
		
		//���� ���������� ��üŸ���� ����� �⺻������ ����ȯ
		int i4 = i3.intValue();
	
	}
}
