import java.util.Random;
/**
 * LabExample class - part of Control Flow
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */
public class LabExample {

		// Task 1

    /**
     * compares two numbers to find which one is the largest or returns -1 if they are the same
     * @param numX holds first number
     * @param numY holds second number
     * @return returns largest number
     */
		 public int highestOfTwo(int numX, int numY){
			if (numX > numY) {
                return numX;
            } else if (numX < numY) {
                return numY;
            } else {
                return -1;
            }

		}
	
		// Task 2

    /**
     * tells you what grade you got according to your mark or if you entered an invalid mark
     * @param mark holds the mark
     * @return returns grade
     */
		 public String calculateGrade(int mark) {
             if (mark >= 0 && mark < 40) {
                 return "Fail";
             } else if (mark >= 40 && mark < 50) {
                 return "3rd";
             } else if (mark >= 50 && mark < 60) {
                 return "2ii";
             } else if (mark >= 60 && mark < 70) {
                 return "2i";
             } else if (mark >= 70 && mark <= 100) {
                 return "1st";
             } else {
                 return "Invalid mark";
             }
         }

		// Task 3

    /**
     * 'flips' a coin and tells the user if the guess was correct or incorrect
     * @param guess holds the guess
     * @return returns if the guess was correct or incorrect
     */
		 public String headsOrTails(String guess) {
			Random rand = new Random();
            int flip = rand.nextInt(2)  ;

            if (flip == 1 && guess.equalsIgnoreCase("heads")){
                return "Correct: you guessed heads and I flipped heads";
            } else if (flip == 1 && guess.equalsIgnoreCase("tails")) {
                return "Incorrect: you guessed heads and I flipped tails";
            } else if (flip == 0 && guess.equalsIgnoreCase("heads")) {
                return "Correct: you guessed tails and I flipped tails";
            } else {
                return "Incorrect: you guessed tails and I flipped heads";
            }
		}
		
		// Task 4

    /**
     * adds numbers 1, 2, 3... ,n
     * @param end holds the last number to be added
     * @return returns the sum
     */
		 public int sumFromOneToWhat(int end) {
			int sum = 0;
            for (int i = 0; i <= end; i++){
                sum = sum + i;
            }
            return sum;
		}
		
		// Task 5

    /**
     * adds numbers s, s+1, s+2... ,e
     * @param start holds the start number
     * @param end holds the last number to be added
     * @return returns the sum
     */
		public int sumFromWhatToWhat(int start, int end) {
			int sum = 0;
            for (int i = start; i <= end; i++) {
                sum = sum + i;
            }
            return sum;
		}
}
