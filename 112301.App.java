package pac;

import java.util.Scanner;

public class App {
	// ÿ���û�����aʱ������һ������R��x,y���������ά����,x��y��Ϊint���������ͣ�xֵ��Ϊ��0,100����y��ֵ��Ϊ��0,100����
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
