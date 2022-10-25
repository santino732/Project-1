package StatsLibrary;

import java.text.*;

/*
 * WORK CITED
 * 	https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html
 * 	
 */


public class setOperationsTest {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		int[] list1 = new int[]{1,2,2,3,4,5,6,4,43}; ///create set list 1  CAN BE CHANGED*
		int[] list2 = new int[]{1,2,4,7,8,9,22}; ///create set list 1   CAN BE CHANGED*
		
		//Testing operations calling setOperations and running functions
		//lines are just formatting
		System.out.println("SET OPERATIONS    Santino Celebre Project 1");  
		System.out.println("-------------------------------------------");
		
		System.out.print("list1 Unedited: [");
		setOperations.printArray(list1);
		System.out.print("]");
		System.out.println("\n");
		System.out.print("list2 Unedited: [");
		setOperations.printArray(list2);
		System.out.print("]");
		System.out.println("\n");
		
		
		System.out.println("Median list1: " + setOperations.median(list1));
		
		System.out.println("Mean list1: " + df.format(setOperations.mean(list1)));
		
		System.out.println("Mode list1: " + setOperations.mode(list1));
        
		
		double variance = 1;
	    double std = setOperations.varianceSTD(list1, variance);
		System.out.println("Variance list1: : " + df.format(setOperations.varianceSTD(list1, variance)));
		System.out.println("Standard Deviation list1: : " + df.format(Math.sqrt(std)));
		
		System.out.println("Union of list1 & list2: " + setOperations.union(list1,list2));
		
		System.out.println("Intersection of list1 & list2: " + setOperations.intersection(list1,list2));
		
		double perm = 1;
		System.out.println("Permutations of inputted numbers: " + df.format(setOperations.permutations(perm)));
		
		double comb = 1;
		System.out.println("Combinations of inputted numbers: " + df.format(setOperations.combinations(comb)));
		
		System.out.println("Complement of list1 in list2: " + setOperations.complement(list1, list2));
		
		System.out.println("Geometric Distribution: " + df.format(setOperations.geometricDistribution()) + "%");
		
		double prob = 1;
		System.out.println("Binomial Distribution: " + df.format(setOperations.binomialDistribution(prob)) + "%");

		double ans = 1;
		System.out.println("Hypergeometric Distribution: " + df.format(setOperations.hyperGeometric(ans)) + "%");

		


	}
}
