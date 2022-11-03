import java.util.Random;
/**
 * LabExample class - part of Control Flow
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */

import java.util.Random;
public class LabExample {

		// Task 1
		 public int highestOfTwo(int a, int b) {

             if (a > b) {
                 return (a);
             } else if (b > a) {
                 return (b);
             } else {
                 return -1;
             }
         }
	
		// Task 2
		 public String calculateGrade(int mark) {
             if (mark < 40 && mark >=0) {
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
		 public String headsOrTails(String guess) {
             Random rnd = new Random();
             int rndNum = rnd.nextInt(2); // 0-1
             // head = 1;
             // tails = 0;
             if (rndNum == 0 && guess.equalsIgnoreCase("Head")) {
                 return "Incorrect: you guessed heads and I flipped tails";
             } else if (rndNum == 1 && guess.equalsIgnoreCase("Head")) {
                 return "Correct: you guessed heads and I flipped heads";
             } else if (rndNum == 0 && guess.equalsIgnoreCase("Tails")) {
                 return "Incorrect: you guessed tails and I flipped heads";
             } else {
                 return "Correct: you guessed tails and I flipped tails";
             }
         }

		// Task 4
		 public int sumFromOneToWhat(int num) {
			int ans = 0;

            for (int i = 0; i <= num; i++) {
                ans = ans + i;
            }
             return ans;
		}
		
		// Task 5
		public int sumFromWhatToWhat(int bottom, int top) {
             int ans = bottom;
             for (int i = 1; i <= top-bottom; i++) {
                 ans += bottom + i;
             }

             return ans ;
		}
}
