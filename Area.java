package computearea;
import java.util.Scanner;
	//��չ����ʹ��Scanner��Ӽ��̽�������	
public class ComputeArea {
	
	//����Բ������Ļ�������
	/*public static void main(String arg[]) {
		double radius;
		double area;
		//����radius(�뾶)��area�������
		radius = 20;
		area =  radius *  radius * 3.14159;
		//Բ��������㹫ʽ radius * radius * 3.14159
		System.out.println("The area for the circle of radius " + radius + " is " + area);		
	}*/
	

	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		//system.out---��׼�������system.in---��׼�������	
		System.out.print("enter the number for redius");
		double radius = input.nextDouble();
		double area;
		//����radius(�뾶)��area�������
		area =  radius *  radius * 3.14159;
		//Բ��������㹫ʽ radius * radius * 3.14159
		System.out.println("The area for the circle of radius " + radius + " is " + area);		
	}
}

