package Programs;

public class Birthday {

	public static double birthday(double prob) {
		
		double runs=10000;  //numbers of trials run CAN CHANGE*
		int num = 25; //number of students CAN CHANGE*
		int x[] = new int[num];
		boolean noMatch = false;   //used to break out of for loop when a match is not detected
		int match = 0;        //counter 
		
        for (int i = 0; i < runs; i++) {        	
        	for(int j = 0; j < num; j++) {
        		x[j] = (int)(Math.random() * 365) + 1;  //this is assigning birthdays to N amount of people in this case 25 people
        	}
        		//now we have number of students and trials we need to compare dates
        		//I will use another nested for loop
        
        		for (int j = 0; j < num; j++) {
                    for (int k = j + 1; k < num; k++) {
                        if (x[j] == x[k]) {
                            match++;
                            noMatch = true;
                            break;
                        }   
                    }
                    if (noMatch) {
                        noMatch = false;
                        break;
                    }
        		}
        	}
        
        prob = (double) match / runs ;	//average of matches out of all runs
        return prob;
	}
}
  