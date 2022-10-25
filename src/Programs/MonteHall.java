package Programs;

public class MonteHall {
	
	public static double SwitchDoor(double prob) {
        int trials = 10000;
        int wins = 0;
        for (int i = 0; i < trials; i++) {
            int prize  = (int) (3 * Math.random());   //3 being the number of doors.
            int choice = (int) (3 * Math.random());
            int reveal;
            
            do {
                reveal = (int) (3 * Math.random());
            } while ((reveal == choice) || (reveal == prize));

           int other = 0 + 1 + 2 - reveal - choice;  
           
            if (other == prize) wins++;      //other is other door being selected 
        } 
        
        prob = ((1.0 * wins / trials) * 100);

        return prob;
    }
	
	//the only difference between switching doors and not switching doors is
	//not subtracting change from int other. This drops the probability of winning.
	public static double DontSwitchDoor(double prob2) {
	       int trials = 10000;
	       int wins = 0;

	       for (int i = 0; i < trials; i++) {
	           int prize  = (int) (3 * Math.random());
	           int choice = (int) (3 * Math.random());

	           int reveal;
	           do {
	               reveal = (int) (3 * Math.random());
	           } while ((reveal == choice) || (reveal == prize));

	          int other = 0 + 1 + 2 - reveal;    //only change because we are not changing door

	           if (other == prize) wins++;
	       } 
	       prob2 = ((1.0 * wins / trials) * 100);
	       
	       return prob2;
	   }
}
