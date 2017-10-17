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

		// try-with-resources: close()메소드를 호출하지 않더라도, 자동으로 close()가 되게 할 수 있다
		// try괄호 안에 io객체를 선언
		try (
				//다양한 데이터타입을 읽어들임
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
