package single;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListTest {
	
	
	public static int YSFH(int n) {
		LinkedList<Integer> queue=new LinkedList<>();
		
		for(int i=0;i<n;i++) {
			queue.add(i+1);
		}
		
		while(queue.size()>1) {
			for(int j=1;j<=3;j++) {
				Integer num=queue.poll();
				if(j<3)
					queue.add(num);
			}
		}
		
		return queue.getFirst();
		
	}
	
	public static int YSFHX(int n) {
		int[] queue=new int[n];
		int result=0;
		for(int i=0;i<n;i++) {
			queue[i]=i+1;
		}
		
		
		int size=n;
		int flag=0;
		int num=0;
		while(size>1) {
			if(queue[flag]!=0) {
				num++;
				if(num>=3)
					num%=3;
				if(num==0) {
					size--;
					queue[flag]=0;
				}
					
			}
			flag++;
			if(flag>=queue.length)
				flag%=queue.length;
		}
		
		for(int m:queue) {
			if(m!=0)
				result=m;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("请输入学生个数：");
		int num=input.nextInt();
		//System.out.println("最终剩下的学生编号为："+YSFH(num));
		System.out.println("最终剩下的学生编号为："+YSFHX(num));
	}

}
