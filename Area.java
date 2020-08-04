package computearea;
import java.util.Scanner;
	//扩展程序，使用Scanner类从键盘接受数据	
public class ComputeArea {
	
	//计算圆的面积的基本程序
	/*public static void main(String arg[]) {
		double radius;
		double area;
		//定义radius(半径)，area（面积）
		radius = 20;
		area =  radius *  radius * 3.14159;
		//圆的面积计算公式 radius * radius * 3.14159
		System.out.println("The area for the circle of radius " + radius + " is " + area);		
	}*/
	

	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		//system.out---标准输出程序；system.in---标准输入程序	
		System.out.print("enter the number for redius");
		double radius = input.nextDouble();
		double area;
		//定义radius(半径)，area（面积）
		area =  radius *  radius * 3.14159;
		//圆的面积计算公式 radius * radius * 3.14159
		System.out.println("The area for the circle of radius " + radius + " is " + area);		
	}
}

