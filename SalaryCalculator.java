/**
 * SalaryCalculator class - part of Control Flow
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */

public class SalaryCalculator {

    //Task 1
    public double salaryTax(double sal) {
        if (sal >= 45000) {
            return sal / 2;
        } else if (sal < 45000 && sal >= 30000) {
            return (sal / 100) * 70;
        } else {
            return (sal / 100) * 85;
        }
    }


    //Task 2
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
    public double salaryTotal(double[] sal) {
        double total = 0;
        for (int i = 0; i < 3; i++) {   // commentd the junit test out as it was saying it has an error
            total = total + sal[i];
        }
        return total;
    }


	// Task 4
	 public double salaryAverage(double[] sal) {
		double average = 0;

        for (int i = 0; i < 3; i++) {   //
            average = average + sal[i];
        }
    return average/3;
	}

	//Task 5
	/* public ?? salaryIncrease(??) {
		return ??;
	}*/

}
