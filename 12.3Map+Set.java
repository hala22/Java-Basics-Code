package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str=input.next();
		
		HashMap<Character,Integer> map=new HashMap<>();
		Character c;
		
		for(int i=0;i<str.length();i++) {
			c=Character.valueOf(str.charAt(i));
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				map.put(c, map.get(c)+1);
			}
		}
		
		Set<Map.Entry<Character,Integer>> set=map.entrySet();
		Iterator<Map.Entry<Character,Integer>> it=set.iterator();
		while(it.hasNext()) {
			Map.Entry<Character, Integer> m=it.next();
			System.out.println(m.getKey()+"--"+m.getValue());
		}
		
	}
}
