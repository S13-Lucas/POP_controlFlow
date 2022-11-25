/**
 * SalaryCalculator class - part of Control Flow
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */

public class SalaryCalculator {

    //Task 1

    /**
     * tells the user how much tax they owe from what their salary is
     * @param sal holds the salary
     * @return returns the amount of tax to be paid
     */
    // I believe the function is correct, but it returns 3.0, and I have not been able to find why after research
    public double salaryTax(double sal) {
        if (sal >= 45000) {
            return sal - (sal * 0.5);
        } else if (sal < 45000 && sal >= 30000) {
            return sal - (sal * 0.3);
        } else {
            return sal - (sal * 0.15);
        }
    }


    //Task 2

    /**
     * tells the user how much NI tax they owe from what their salary is and what tax band they are in
     * @param sal holds the salary
     * @param cBand holds the tax band
     * @return returns owed tax
     */

    public double calculateNI(double sal, char cBand) {
        if (cBand == ('A') || cBand == 'a') {
            return (sal * 0.88);
        } else if (cBand == 'B' || cBand == 'b') {
            return (sal * 0.9415);
        } else if (cBand == 'C' || cBand == 'c') {
            return (sal * 0.98);
        } else {
            return sal;
        }
    }


    //Task 3

    /**
     * adds multiple salaries in a array
     * @param sal holds an array with salaries
     * @return returns the total salaries combined
     */
    // I believe the function is correct, but it returns 3.0, and I have not been able to find why after research
    public double salaryTotal(double[] sal) {
        double total = 0;
        for (int i = 0; i < 3; i++) {
            total = total + sal[i];
        }
        return total;
    }


    // Task 4

    /**
     * finds the average salary in a given array of salaries
     * @param sal holds an array of salaries
     * @return returns the average salary
     */
    // I believe the function is correct, but it returns 3.0, and I have not been able to find why after research
    public double salaryAverage(double[] sal) {
        double average = 0;

        for (int i = 0; i < 3; i++) {   //
            average = average + sal[i];
        }
        return average/3;
    }

    //Task 5

    /**
     * increases all the salaries in an array by a given amount
     * @param sal holds an array of salaries
     * @return returns the corrected array
     */
    public double[] salaryIncrease(double[] sal) {
        double[] out = {0, 0, 0};
        for (int i = 0; i < 3; i++) {
            out[i] = sal[i] * 1.05;
        }

        return out;
    }

}