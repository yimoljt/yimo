package pac;

import java.util.Scanner;

public class App3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入年份：");
		int year =sc.nextInt();
		if(year==0){
			System.out.println("公元分界线，既不是平年也不是闰年");
		}
		if(year<0){
			year=year*-1;
			year=year-1;
		}
		if(year%4==0 && year%100!=0){
			System.out.println("闰年");
		}else if(year%400==0 && year%3200!=0){
			System.out.println("闰年");
		}else if(year%3200==0 && year%172800!=0){
			System.out.println("闰年");
		}else{
			System.out.println("平年");
		}
		sc.close();
	}
}
