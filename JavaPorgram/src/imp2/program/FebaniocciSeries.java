package imp2.program;

import java.util.Scanner;

public class FebaniocciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Feboniccaio Series:");
		int num =  sc.nextInt();
		int x=0;
		int y=1;
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=x+y;
			System.out.println(sum);
			x=y;
			y=sum;	
		}
		
		
	}

}
