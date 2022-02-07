package array.two_D.program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Display2DMatrix {

	public static void main(String[] args) throws ParseException {
		int a[][]=new int[][] {
							{1,2,3},
							{4,5,6},
							{7,8,9},
							{4,5,6}
							};
							
		int row =a.length;
		int col =a[0].length;
		//String date1="20-2-2021";
		
		String sDate1="27/7/1989";

			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
			
		
		int d = date1.getYear();
		int d1 = date1.getDate();
		long d3=date1.getSeconds();
		Date date=new Date();
		System.out.println(date.getYear()-d);
		System.out.println(d3);
		boolean s= date.after(date);
		System.out.println(s);
		System.out.println(row);
		System.out.println(col);
		
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
	}

}
