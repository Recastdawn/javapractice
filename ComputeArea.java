package computearea;

public class ComputeArea {
	/*public static void main(String[] arg) {
		double i = 50.0;
		double k = i + 50.0;
		double j = k + 1;
		System.out.println("i is " + i + ", j is "+ j +", k is " + k);
	}*/
	public static void main(String arg[]) {
		double radius;
		double area;
		//����radius(�뾶)��area�������
		radius = 20;
		area =  radius *  radius * 3.14159;
		//Բ��������㹫ʽ radius * radius * 3.14159
		System.out.println("The area for the circle of radius " + radius + " is " + area);		
	}
}
