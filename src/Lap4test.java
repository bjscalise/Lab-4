import java.util.Scanner;

public class Lap4test {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String userPrompt = "Y"; // This variable will indicated whether the user wants to continue or not.
			
			long userInt;
			
			Scanner scan = new Scanner(System.in);
			
			do { // This do loop will run once and then move to the while loop if the user enters Y.
			
				System.out.println("Please enter an integer.");
				
				userInt = scan.nextInt();
		
				long i;
				
				System.out.println(" ");
				System.out.printf("%-10s %-10s %-10s %n", "Number", "Squared", "Cubed");
				System.out.printf("%-10s %-10s %-10s %n", "======", "=======", "=====");
				
				// The above formatting tool justifies all columns to the left and that got us the design we needed.
				
				for(i = 1; i <= userInt; i++) {
					
					System.out.printf("%-10s %-10s %-10s %n", (long) i, (long)Math.pow(i, 2), (long)Math.pow(i, 3));
					
				/* The for loop will increment up to the user's input. The Math.pow method will give us the square and cube.
				 * We explicitly casted all of the variables because the Math.pow method gave us doubles.
				 */
						
				}
				System.out.println(" "); // User is prompted to push Y if they want to run the program again.
				System.out.println("Press Y to continue, Press any other key to quit.");
				userPrompt = scan.next();
			
				} while (userPrompt.equalsIgnoreCase("Y")); // The loop runs as long as userPrompt is Y.
			
			
			System.out.println("Very well. Goodbye."); // The user has entered a key besides Y and the program ends.
			scan.close();
		}

	}

