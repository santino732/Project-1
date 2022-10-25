package SalterSmootherProgram;

import java.io.PrintWriter; 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

	public class FunctionPlotter
	{
		public static void CSVrun() throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("Plotter.csv", true); //creates graph.csv file
		PrintWriter pw = new PrintWriter(fos); //creates PrintWriter 
		int[] list1 = new int[]{1,2,4,5,6,8,9,9,9,10};

		String name = ("X, Y"); //labels two columns in a table using headers X,Y
		pw.println(name);
		
		for (int j = 0; j<10; j++)   //for loop that populates x values and y values.
		{
		    int ID = j;
		    int num = list1[j];
		    pw.println(ID + "," + num);
		}
		
		pw.close();
		
		System.out.println("File Was Created");  //visualization that the file was created.
		}
		
	}
