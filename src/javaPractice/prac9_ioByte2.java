package javaPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class prac9_ioByte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/javaPractice/prac9_ioByte.java");
			fos = new FileOutputStream("byte.txt");
			
			int readCount = -1;
			
			//512bytes 만큼씩 읽고 싶다
			byte[] buffer = new byte[512];
			
			while((readCount = fis.read(buffer))!=-1){
				fos.write(buffer,0,readCount);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}

	//원래 512bytes씩 읽어와서 1byte를 쓰고 다시 512를 읽어와서 1씩 쓰기 때문에
	//애초에 512씩 가져왔으면 다 쓰는 것이 효율적
}
