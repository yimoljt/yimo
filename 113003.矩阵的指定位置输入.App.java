package pac;

import java.util.Scanner;

public class App implements R,S {
	public static void main(String[] args) {
		int array2d[][]=new int[10][10];
		Scanner scanner=new Scanner(System.in);
		
		int row =scanner.nextInt();
		int column=scanner.nextInt();
		int value=scanner.nextInt();
		
		array2d[row][column]=value;
		
		for (int rowrow = 0; rowrow < array2d.length; rowrow++) {
			for (int columncolumn = 0; columncolumn < array2d.length; columncolumn++) {
				System.out.print(array2d[rowrow][columncolumn]+" ");
			}
			System.out.println();
			
		}
	}
}
