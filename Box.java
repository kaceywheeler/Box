//Kacey Wheeler
//AP Computer Science: 3B
//11-4-19
//Nested Loops Labs Part 1
//Box 

public class Box {
	
	//Method to create box pattern
	public String box(int user) {
		
		//Declare variables
		String output = "";
		int count = 0;
		
		//Loop number of times as user input
		for (int i = 1; i <= user; i++) {
			
			/*Subtracts one from number of * in output each time:
			Takes less iterations for j to be greater than user - count
			as count gets bigger so each time will print less asterisks*/
			
			for (int j = 1; j <= (user - count); j++) {
				
				output += "*";	
			}
			
			/*Adds one to number of # in output each time:
			Takes more iterations for k to be less than user - count as count
			gets bigger so each time will print more pound signs*/
			
			for (int k = user; k >= (user-count); k--) {
				
				output += "#";
			}
			
			//Add new line to output
			output += "\n";

			//Add one to count
			count++;
		}
			
			//Return output
			return output;
			
		
	}
	

}
