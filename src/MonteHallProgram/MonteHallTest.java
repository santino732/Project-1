package MonteHallProgram;

import java.text.DecimalFormat;

public class MonteHallTest {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");

		
		double prob = MonteHall.SwitchDoor(0);
		double prob2 = MonteHall.DontSwitchDoor(0);

		System.out.println("Percent of games won by switching door: " + df.format(prob));
		System.out.println("Percent of games won by NOT switching door: " + df.format(prob2));

		
	}
	
}
