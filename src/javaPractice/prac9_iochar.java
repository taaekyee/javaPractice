package javaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac9_iochar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.in - Ű���带 �ǹ� (InputStream )
		//BufferedReader - ���پ� �Է� �ޱ����� Ŭ����
		//BufferedReader Ŭ������ �����ڴ� InputStream�� �Է¹޴� �����ڰ� ����.
		//System.in�� InputStream Ÿ���̹Ƿ� BufferedReader�� �����ڿ� �ٷ� �� �� �����Ƿ� InputStreamReader Ŭ������ �̿��ؾ���.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line=null;
		try {
			line = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(line);
		
	}

}
