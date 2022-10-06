import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String[] args){
        // creating Scanner and DecimalFormat objects
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");


        // creating variable ( used later in the loop )
        double addedDish = 0;

        // welcoming the user
        System.out.println("Welcome to the tip calculator!");

        // prompting the user to input values
        System.out.print("How many people are in your group? ");
        int numberOfPeople = scan.nextInt();
        scan.nextLine();

        System.out.print("What's the tip percentage? ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        // creating TipCalculator object
        TipCalculator tipCalc = new TipCalculator(numberOfPeople, tipPercentage);

        // loop to calculate the total price
        while (addedDish != -1){
            System.out.print("Enter a cost in dollars and cents, e.g 12.50 (-1 to end): ");
            addedDish = scan.nextDouble();
            scan.nextLine();
            if (addedDish != -1){
                tipCalc.addMeal(addedDish);
            }

        }

        // printing out all the required values
        System.out.println("----------------------");
        System.out.println("Total Bill Before Tip: " + formatter.format(tipCalc.getTotalBillBeforeTip()));
        System.out.println("Tip Percentage: " + formatter.format(tipCalc.getTipPercentage()));
        System.out.println("Total Tip: " + formatter.format(tipCalc.tipAmount()));
        System.out.println("Total Bill With Tip: " + formatter.format(tipCalc.totalBill()));
        System.out.println("Per Person Cost Before Tip: " + formatter.format(tipCalc.perPersonCostBeforeTip()));
        System.out.println("Tip Per Person: " + formatter.format(tipCalc.perPersonTipAmount()));
        System.out.println("Total Cost Per Person: " + formatter.format(tipCalc.perPersonTotalCost()));

    }

}