package javaPractice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class prac9_ioByte4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// try-with-resources: close()�޼ҵ带 ȣ������ �ʴ���, �ڵ����� close()�� �ǰ� �� �� �ִ�
		// try��ȣ �ȿ� io��ü�� ����
		try (
				//�پ��� ������Ÿ���� �о����
				DataInputStream in = new DataInputStream(new FileInputStream("data.txt"))
				) {
			int i = in.readInt();
			boolean b = in.readBoolean();
			double d = in.readDouble();
			//d = in.readDouble();
			
			System.out.println(i);
			System.out.println(b);
			System.out.println(d);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
