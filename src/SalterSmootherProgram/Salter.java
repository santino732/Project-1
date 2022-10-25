package SalterSmootherProgram;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class Salter {
	public static void CSVrun() throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("graph_eight.csv", true); //creates SALTERGRAOH.csv
		PrintWriter pw = new PrintWriter(fos); //creates PrintWriter
		Random rand = new Random(); //creates random variable needed to add to y values.
	   
		int[] list1 = new int[]{1,2,4,5,6,8,9,9,9,10}; 

		String name = ("X, Y");  //creating rows X,Y for table in CSV file
		pw.println(name);
		
		for (int j = 0; j<10; j++) //for loop that takes random number n and adds it to each
									//y value associated with a given x value.
		{
		    int ID = j;
		    int n = rand.nextInt(10);
		    int k = list1[j];
		    int l = k+n;
		    list1[j] = l;
		    pw.println(ID + "," + list1[j]);  
		}
		
		pw.close();
		
		System.out.println("File Was Created");  //confirmation that the file was created.
		}
}
