public class HomeWork{
	public static void main(String[] args){
	int i1 = 123; 
   int i2 = 456;
   double d1 = (i1+i2)*1.2;
   float f1 = (i1+i2)*1.2;
   byte b1 = 67; 
   byte b2 = 89;
   byte b3 = b1+b2;
   //byte的范围是-128～127  int b3=b1+b2
   System.out.println(b3);
   double d2 = 1e200;
   float f2 = d2;
   // float 的范围最大45位 
   System.out.println(f2);

   float f3 = 1.23;
   long l1 = 123;
   long l2 = 30000000000; 
   //30000000000超过int范围 long l2=30000000000L
   float f = l1+l2+f3; 
   long l = f;
   //需要强制转换 long l=(long)f;

	}
}