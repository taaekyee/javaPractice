package woowahan;

import java.util.*;

public class test2 {
	public static void main(String[] args) {
	    try(Scanner s = new Scanner(System.in))
	    {
	      int n = s.nextInt();

				int[] bar = new int[2000001];
				
	      for(int i = 0; i < n; i++)
	      {
	        int a = s.nextInt();
	        int b = s.nextInt();

					//여기부터 작성해 주세요
					for (int j = a; j < b; j++) {
						bar[1000000 + j]++;
					}
				}
				System.out.print("(-, ");
				boolean isBoun = true;
				boolean isIng = false;
				for (int i = 0; i < bar.length; i++){
					
					if(bar[i] != 0 && !isIng && isBoun){
						System.out.println(i-1000000+")");
						isBoun = false;
					}
					else if(bar[i]%2 == 0 && !isIng && !isBoun){
						System.out.print("["+(i-1000000)+", ");
						isIng = true;
					}
					else if(bar[i] == 0 && !isIng && !isBoun){
						System.out.print("("+(i-1000000)+", ");
						isBoun = true;
					}
					else if(bar[i]%2 != 0 && isIng && !isBoun){
						System.out.println((i-1000000)+"]");
						isIng = false;
					}
				}
				System.out.println("+)");
			}
	  }
	}