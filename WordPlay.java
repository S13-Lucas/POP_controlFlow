import java.util.Random;
/**
 * WordPlayStudentOuputTests class - part of Control Flow
 * Advanced String manipulation tasks examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */
public class WordPlay {

    //Task1

    /**
     * finds what word comes first alphabetically or if they are the same
     * @param word1 holds the first word
     * @param word2 holds the second word
     * @return returns which comes first
     */
    //I have been unable to make this pass the Junit test after extensive trial and error as it says I have an error when the words are the same, using ignoreCase has not worked
    public String whatComesFirst(String word1, String word2) {

        if ((word1.compareToIgnoreCase(word2)) < 0) {
            return (word1 + " comes before " + word2 + " in the alphabet");
        } else if ((word1.compareToIgnoreCase(word2)) == 0) {
            return (word1 + " is the same as " + word2);
        } else if ((word1.compareToIgnoreCase(word2)) > 0) {
            return (word2 + " comes before " + word1 + " in the alphabet");
        } else {
            return "d";
        }
    }



    //Task 2

    /**
     * reverse a string
     * @param word holds the word
     * @return returns modified string
     */
    public String backwardsString(String word) {
        String wordX = "";

        for (int i = word.length()-1; i >= 0; i--) {
            wordX = wordX + word.substring(i, i+1);

        }
        return wordX;
    }

    //Task 3

    /**
     * creates an 'address book' by assigning names to numbers
     * @param names holds an array of names
     * @param numbers holds an array of numbers
     * @return returns the names concatenated with the numbers
     */
    public String[] addressBook(String[] names, String[] numbers ) {
        for (int i = 0; i < 3; i++) {
            names[i] = names[i] + " " + numbers[i];
        }
        return names;
    }

    //Task 4

    /**
     * simulates the game rock paper scissors by using a given guess and a randomised result
     * @param guess holds guess
     * @return returns the result of the game
     */
    public String rockPaperScissors(String guess) {
        Random rnd = new Random();
        int myRndNum = rnd.nextInt(3);

        //rock = 0 | paper = 1 | scissors = 2

        if (myRndNum == 0 && guess.equalsIgnoreCase("rock")) {
            return "USER:rock vs COMP:rock it is a draw";

        } else if (myRndNum == 0 && guess.equalsIgnoreCase("paper")) {
            return "USER:rock vs COMP:paper COMPUTER wins";

        } else if (myRndNum == 0 && guess.equalsIgnoreCase("scissors")) {
            return "USER:paper vs COMP:rock user wins";

        } else if (myRndNum == 1 && guess.equalsIgnoreCase("rock")) {
            return "USER:rock vs COMP:paper COMPUTER wins";

        } else if (myRndNum == 1 && guess.equalsIgnoreCase("paper")) {
            return "USER:rock vs COMP:rock it is a draw";

        } else if (myRndNum == 1 && guess.equalsIgnoreCase("scissors")) {
            return "USER:paper vs COMP:rock user wins";

        } else if (myRndNum == 2 && guess.equalsIgnoreCase("rock")) {
            return "USER:paper vs COMP:rock user wins";

        } else if (myRndNum == 2 && guess.equalsIgnoreCase("paper")) {
            return "USER:rock vs COMP:paper COMPUTER wins";

        } else if (myRndNum == 2 && guess.equalsIgnoreCase("scissors")) {
            return "USER:rock vs COMP:rock it is a draw";

        } else {
            return "invalid input";
        }


    }
}