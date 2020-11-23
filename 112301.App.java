package pac;

import java.util.Scanner;

public class App {
	// 每当用户输入a时，输入一个形如R（x,y）的随机二维坐标,x和y均为int型数据类型，x值域为（0,100），y的值域为（0,100）。
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		while (true) {
			int user=scanner.nextInt();
			if (user==1) {
				System.out.println("R("+(int)(Math.random()*100)+","+(int)(Math.random()*100)+")");
			}
		}

		
	}
}
