package woowahan;

import java.util.*;

public class test4 {
	static String[][] s;
	static List<String> count;
	
	public static String solution(String S){
		
//		for(int i = 0; i<20;i++){
//			S += "a.png, Warsaw, " + (int)Math.random()%2000 + "-" + Math.random()*12 + "-" +
//					Math.random()*31 + " " + Math.random()*24 + ":" + Math.random()*60 + ":" + Math.random()*60 +"\n";
//			S += "a.png, London, " + (int)Math.random()%2000 + "-" + Math.random()*12 + "-" +
//					Math.random()*31 + " " + Math.random()*24 + ":" + Math.random()*60 + ":" + Math.random()*60 +"\n";
//			
//		}
		
		String[] strs = S.split("\n");
		s = new String[strs.length][3];
		count = new ArrayList<>();
		
		StringBuffer result = new StringBuffer();
        
        for(int i = 0; i<strs.length;i++){
 			s[i] = strs[i].split(", ");
 			s[i][0] = s[i][0].substring(s[i][0].indexOf("."));
        }
        
        
        for(int i = 0; i<s.length;i++){
        	int cnt = 1;
        	int cityCnt = 1;
        	for(int j =0; j<s.length;j++){
        		if(i==j) continue;
        		if(s[i][1].equals(s[j][1])){
        			cityCnt++;
        			if(s[i][2].compareTo(s[j][2])>0) cnt++;
        		}
        	}
        	
        	count.add(Integer.toString(cnt));
        	
        	if(cityCnt>=10 && cnt<10) paddingZero(i);
        	if(cityCnt>=100 && cnt<100) paddingZero(i);
        }
               
        for(int i = 0; i<strs.length;i++){
        	result.append(s[i][1]+count.get(i)+s[i][0]+"\n");
        }
		
		
		return result.toString();
	}
	public static void paddingZero(int idx){
		count.set(idx, "0"+ count.get(idx));
	}
	
	public static void main(String[] args) {
		
		System.out.println(solution("photo.jpg, Warsaw, 2013-09-05 14:08:15\n"+
				"john.png, London, 2015-06-20 15:13:22\n"+
				"myFriends.png, Warsaw, 2013-09-05 14:07:13\n"+
				"Eiffel.jpg, Paris, 2015-07-23 08:03:02\n"+
				"pisatower.jpg, Paris, 2015-07-22 23:59:59\n"+
				"BOB.jpg, London, 2015-08-05 00:02:03\n"+
				"notredame.png, Paris, 2015-09-01 12:00:00\n"+
				"me.jpg, Warsaw, 2013-09-06 15:40:22\n"+
				"a.png, Warsaw, 2016-02-13 13:33:50\n"+
				"b.jpg, Warsaw, 2016-01-02 15:12:22\n"+
				"c.jpg, Warsaw, 2016-01-02 14:34:30\n"+
				"d.jpg, Warsaw, 2016-01-02 15:15:01\n"+
				"e.png, Warsaw, 2016-01-02 09:49:09\n"+
				"f.png, Warsaw, 2016-01-02 10:55:32\n"+
				"g.jpg, Warsaw, 2016-02-29 22:13:11"));
	}
}

