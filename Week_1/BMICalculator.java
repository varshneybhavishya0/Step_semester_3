package Week_1;

import java.util.Scanner;

public class BMICalculator {

    
    static String getBmiStatus(double bmi) {

        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    
    static void printWellnessReport(double[] heights, double[] weights) {

        System.out.println("\nPerson\tHeight\tWeight\tBMI\tStatus");

        for (int i = 0; i < heights.length; i++) {

            double bmi = weights[i] / (heights[i] * heights[i]);

            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n",
                    i + 1,
                    heights[i],
                    weights[i],
                    bmi,
                    getBmiStatus(bmi));
        }
    }

    public static void main(String[] args) {

        Scanner bc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = bc.nextInt();

        double[] heights = new double[n];
        double[] weights = new double[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter height of person " + (i + 1) + " in meters: ");
            heights[i] = bc.nextDouble();

            System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
            weights[i] = bc.nextDouble();
        }

        printWellnessReport(heights, weights);

        bc.close();
    }
}
