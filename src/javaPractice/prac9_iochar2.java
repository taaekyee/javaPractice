package javaPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class prac9_iochar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		PrintWriter pw = null;
				
		try{
			br = new BufferedReader(new FileReader("src/javaPractice/prac9_iochar2.java"));
			pw = new PrintWriter(new FileWriter("test.txt"));
			//pw = new PrintWriter("test.txt"); PrintWriter에서 제공함
			
			String line = null;
			while((line=br.readLine())!=null){
				pw.println(line);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
