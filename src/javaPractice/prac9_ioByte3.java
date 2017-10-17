package javaPractice;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class prac9_ioByte3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//try-with-resources: close()메소드를 호출하지 않더라도, 자동으로 close()가 되게 할 수 있다
		//try괄호 안에 io객체를 선언
		try(
				DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"))
				){
			out.writeInt(100); //정수 저장 4bytes
			out.writeBoolean(true); //boolean 저장 1byte
			out.writeDouble(10.5); //double 저장 8bytes
			out.writeDouble(3.14);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
