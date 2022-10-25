	package StatsLibrary;

	import java.util.HashSet;

	/*Project 1 Probability and Applied Statistics Santino Celebre
	 * setOperations is designed to show multiple operations involving sets.
	 */

	public class setOperations {
	
		public static void printArray (int[] listX) {
			for (int i = 0; i < listX.length; i++) { 		      
		        System.out.print(listX[i]); 
		        
		        if(i==listX.length-1)
			       break; 
		        else
		        	System.out.print(",");
			}
			
		}
		
	//Algorithm for finding mean of a given list. (sum of list/length of list)
	public static double mean(int[] listX) {
		
		double sum = 0;
		 
		for (int i = 0; i < listX.length; i++) {
		    sum += listX[i];
		    }
		 
		    double mean = sum / listX.length;
		        
		    return mean;
	}
			
	//Algorithm for finding median of a given list.
	public static double median(int[] listX) {
		
		double m=0;	
		double n = listX.length;
			
		if(n%2==1){
			
			m=listX[(int) (((n+1)/2)-1)];
				
			}
		
		else{
			
			m=(listX[(int) (n/2-1)]+listX[(int) (n/2)])/2;
				
			}
		
			return m;
	}
	
	//Algorithm for finding mode, traverse the array and add to count whenever 2 numbers match.
	public static double mode(int[] listX) {
		
		int count2 = 0;
		int count1 = 0;
		int x =0;
		int y =0;
			    
		for (int i = 0; i < listX.length; i++){
			x = listX[i];
			count1 = 0;
			
		for (int j = i + 1; j < listX.length; j++)
			if (x == listX[j]) count1++;
		    
			    if (count1 > count2){
			    	y = x;
			        count2 = count1;
		}
			        
			    else if(count1 == count2)
			        y = Math.min(y, x);    
		}  
			    return y;
	}

	//Algorithm for calculating standard deviation and variance, calls mean class to reduce repetitive code
	//this was done because in order to find STD you need to find variance, two birds one stone
	public static double varianceSTD(int[] listX, double variance) {
		if(listX.length == 1) 
			return 1;
			
		if(listX.length == 0) 
				return 0;
		
		double num = 0;
		double mean = setOperations.mean(listX);
		
		//for loop is finding differences of the mean for each element in the listX 
		//and then squaring that number. Sum of all elements are stored in num.
		for (int i = 0; i < listX.length; i++) { 
            num = num + Math.pow((listX[i] - mean), 2);    
		}
		
        variance = num / listX.length;    //sum of differences divided by length of list
        
        //only returning variance, square root in test class to find standard deviation
        return (variance);  
	}
	
	//Union and Intersection Algorithms
	public static HashSet<Integer> union(int[] listX, int[] listY) {
		// Inserting both array elements in hashSet s 
		//No duplicates because of hashSet
		
		HashSet<Integer> s = new HashSet<>();

		for (int i = 0; i < listX.length; i++)
			s.add(listX[i]);
	   
	    for (int i = 0; i < listY.length; i++)
	    	s.add(listY[i]);
	     
			return s;
	}
	
	public static HashSet<Integer> intersection(int[] listX, int[] listY ) {
	
	 
	    /* Looked into hashSet and found very cool and useful tools when working with sets 
	     * decided this was the easiest way to implement union and intersection, work referenced 
	     * included on work cited.
	    */
	
		HashSet<Integer> s1 = new HashSet<Integer>();
		HashSet<Integer> s2 = new HashSet<Integer>();

		for (int i = 0; i < listX.length; i++)
			s1.add(listX[i]);
	   
	    for (int i = 0; i < listY.length; i++)
	    	s2.add(listY[i]);
	    	
	    s1.retainAll(s2);
	    return s1;
	}	
	
	//the complement is the values of one set that are not in the others.
	
	public static HashSet<Integer> complement(int listX[], int listY[]) {
		
		HashSet<Integer> s1 = new HashSet<Integer>();
		HashSet<Integer> s2 = new HashSet<Integer>();
		
		for (int i = 0; i < listX.length; i++)
			s1.add(listX[i]);
	   
	    for (int i = 0; i < listY.length; i++)
	    	s2.add(listY[i]);
	    
		s2.removeAll(s1);
		
		
		return s2;
	}
	
	public static double combinations(double comb) {
		
		double fact=1;  //factorial of numerator
		double fact2=1;  //factorial of denominator 
		double fact3=1;	//factorial of r in the denominator
		int n=30; //represents n in the permutation formula   CAN BE CHANGED*
		int r=3;  //represents r in the permutation formula   CAN BE CHANGED*
		int x=n-r;  //x will be used as variable for the denominator (n-r)!
		
		for(int i=1;i<=n;i++){    
			fact=fact*i;    	//this for loop calculates the numerator n!
		  } 
		
		for(int i=1;i<=x;i++){    
			fact2=fact2*i;    	//this for loop calculates the denominator (n-r)! x = n-r
		  } 
		
		for(int i=1;i<=r;i++){    
			fact3=fact3*i;    	//this for loop calculates the denominator r!
		  } 
		
		double num = (fact3*fact2);   //these two statements are just following the formula 
		double num2 = (fact/num);		//  C = n! / r!(n-r)!
		
		return (comb = num2);  //permutation of P n=(whichever number you change 30 to)
											//r=(which ever number you change 3 to;
	}
	
	public static double permutations(double perm) {
		
		double fact=1;  //factorial of numerator
		double fact2=1;  //factorial of denominator 
		
		int n=30; //represents n in the permutation formula   CAN BE CHANGED*
		int r=3;  //represents r in the permutation formula   CAN BE CHANGED*
		int x = n-r;  //x will be used as variable for the denominator (n-r)!
		
		for(int i=1;i<=n;i++){    
			fact=fact*i;    	//this for loop calculates the numerator n!
		  } 
		
		for(int i=1;i<=x;i++){    
			fact2=fact2*i;    	//this for loop calculates the denominator (n-r)! x = n-r
		  } 
		
		return (perm = fact/fact2);  //permutation of P n=(whichever number you change 30 to)
											//r=(which ever number you change 3 to;
		
	}
	
	//for binomial distribution we use combinations because order doesn't matter
	//only issue with this formula is if the number is too big output turns to 0
	public static double binomialDistribution(double prob) {
	
		double n = 4;     //n is the # of trials this one CAN BE CHANGED*
		double y = 3;		//y is the # of successes this one CAN BE CHANGED*
		double p = .80;   //prob of success CAN BE CHANGED*
		
		double q = 1-p;  //prob of failure
		double r = n-y;
		
		double fact1=1;   //factorial of numerator which is n
	    double fact2=1;		//factorial of n-y
	    double fact3=1;   //factorial of y

		// n factorial / y factorial
		
	    for (int i = 1;i <= n;i++) {          //this for loop gives factorial of n
	        fact1 = fact1 * i;
	    } 
	    
	    for (int i = 1;i <= r;i++) {			//this for loop gives factorial of n-y
	       fact2 = fact2 * i;
	    }	    
	   
	    for (int i = 1;i <= y;i++) {			//this for loop gives factorial of y
		       fact3 = fact3 * i;
		    }	 
	    

	    double num = (fact3*fact2);   //these two statements are just following the formula 
		double num2 = (fact1/num);		//  C = n! / r!(n-r)!
		
		double comb = num2;  
		prob = comb * ((Math.pow(p, y)) * (Math.pow(q,(n-y))));
	   // System.out.println(Math.pow(p, y));
	   // System.out.println(Math.pow(q,(r)));
		return prob;

	}
	
	/*N -> size of population
	*n -> # selected out of population
	*r -> # total of items we are looking for
	*y -> # of items we choose
	*
	*this method basically goes throught the equation of hypergeometric which is just a big division of multiple factorials
	*my implementation was just going through one step at a time through factorials and at the very end having a numerator
	*///and denominator giving us the final answer.
	
	public static double hyperGeometric(double ans) {
		double N = 52;
		double n = 5;		//VALUES THAT CAN BE CHANGED*
		double r =26;
		double y = 2;
		
		double t = n-y;
		double fact1=1;   //factorial of numerator which is r
	    double fact2=1;		//factorial of r-y
	    double fact3=1;   //factorial of y
		double fact4=1; ///fact n-y
		double fact5=1;
		double fact6=1;
		double fact7=1;
		double fact8=1;
		
		 for (int i = 1;i <= r;i++) {          //this for loop gives factorial of r
		        fact1 = fact1 * i;
		    } 
		
		 for (int i = 1;i <= r-y;i++) {          //this for loop gives factorial of r-y
		        fact2 = fact2 * i;
		    } 
		 
		 for (int i = 1;i <= y;i++) {          //this for loop gives factorial of y
		        fact3 = fact3 * i;
		    } 
		 
		 double x = fact1/(fact2*fact3);
		 
		 for (int i = 1;i <= n-y;i++) {          //this for loop gives factorial of n-y
		        fact4 = fact4 * i;
		    } 
		 
		 for (int i = 1;i <= r-t;i++) {          //this for loop gives factorial of N-(n-y)
		        fact5 = fact5 * i;
		    } 
		 
		 double w = fact1/(fact4*fact5);

		 double numerator = w*x;
		 
		 for (int i = 1;i <= N;i++) {          //this for loop gives factorial of N
		        fact6 = fact6 * i;
		    } 
		 
		 for (int i = 1;i <= n;i++) {          //this for loop gives factorial of N
		        fact7 = fact7 * i;
		    } 
		 
		 for (int i = 1;i <= N-n;i++) {          //this for loop gives factorial of N
		        fact8 = fact8 * i;
		    } 
		 
		 double denominator = fact6/(fact7*fact8);
		 
		 ans = numerator/denominator;
		 
		 return ans*100;  //return answer into a percentage

	}
	
	public static double geometricDistribution() {     //P(X=x)=p×q^x−1
		double x = 5;     //x is the number of failures before a success
		double p = .30;    //p is probability of success
		double q = 1-p;   // p-1 is probability of failure
										
		return (100*(Math.pow(q,(x-1))*p));     //the equation of geometric distribution translated to java
	}									//100* to convert to percentage	
	
}
