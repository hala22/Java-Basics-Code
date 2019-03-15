public class HomeWork{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入第一个整数:");
		int num1=input.nextInt();
		System.out.print("请输入第二个整数：");
		int num2=input.nextInt();
		System.out.println("交换前："+"num1="+num1+",num2="+num2);
		int num;
		num=num1;
		num1=num2;
		num2=num;
		System.out.println("交换后："+"num1="+num+",num2="+num2);
	}
}