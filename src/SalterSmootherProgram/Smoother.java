package SalterSmootherProgram;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Smoother
{
	public static void CSVrun() throws FileNotFoundException {
	
	FileOutputStream fos = new FileOutputStream("Smoother.csv", true); //Creates smoother.csv file 
	PrintWriter pw = new PrintWriter(fos); // create PrintWriter 
   
	int[] list1 = new int[]{6,4,8,8,10,15,14,12,9,17}; //array from salter file
	int[] list2 = new int[]{1,2,4,5,6,8,9,9,9,10};  //array from function plotter

	String name = ("X, Y");  //creates X,Y rows for table 
	pw.println(name);
	
	for (int j = 0; j<10; j++) //for loop that takes y value from list1 and y value from
				//list2 and takes the average of both and places that average as the new y value
	{
	    int ID = j;
	    int k = list1[j];
	    int l = list2[j];
	    int average = (k+l)/2;
	    list1[j] = l;
	    pw.println(ID + "," + average);
	}
	
	pw.close();
	
	System.out.println("File Was Created"); //confirmation that the file was created.
	}
	
}