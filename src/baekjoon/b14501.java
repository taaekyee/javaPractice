package baekjoon;

import java.util.Scanner;

public class b14501 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int days = sc.nextInt();
		
		int[] t = new int[days+1];
		int[] p = new int[days+1];
		int[] dp = new int[days+1];
		
		
		for(int i = 1;i<=days;i++){
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		
		for(int i = 2; i<=days;i++){
			for(int j = 1;j<i;j++){
				if(i-j>=t[j]) dp[i] = Math.max(p[j]+dp[j],dp[i]);
				System.out.print(dp[i]+ " ");
			}
			System.out.println();
		}
		
		int result = 0;
		for(int i =0;i<=days;i++){
			if(result<dp[i]) result = dp[i];
			//System.out.println(dp[i]);
		}
		
		//System.out.println(result);
	}
}

