package Programs;

import java.text.DecimalFormat;

public class BirthdayTest {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.##");

		//assigns prob variable to the probability of N amount of people 
		double prob = Birthday.birthday(0);
	    System.out.print("Probability of N number of people sharing a birthday is " + df.format(prob*100) + "%");
	    
	    //# of runs set to 100000 # of students set to 25, probability ranges from 55-58%

	}

}
