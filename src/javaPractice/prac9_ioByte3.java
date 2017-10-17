package javaPractice;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class prac9_ioByte3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//try-with-resources: close()�޼ҵ带 ȣ������ �ʴ���, �ڵ����� close()�� �ǰ� �� �� �ִ�
		//try��ȣ �ȿ� io��ü�� ����
		try(
				DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"))
				){
			out.writeInt(100); //���� ���� 4bytes
			out.writeBoolean(true); //boolean ���� 1byte
			out.writeDouble(10.5); //double ���� 8bytes
			out.writeDouble(3.14);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
