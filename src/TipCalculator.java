public class TipCalculator {
    // instance variables
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    // constructor to create a TipCalculator object
    public TipCalculator(int numPeople, int tipPercentage){
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    // getter method that returns the totalBillBeforeTip instance variable
    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }

    // getter method that returns the tipPercentage instance variable
    public int getTipPercentage(){
        return tipPercentage;
    }

    // method that increments totalBillBeforeTip by cost
    public void addMeal(double cost){
        totalBillBeforeTip += cost;
    }

    // method that calculates the tip amount added to bill
    public double tipAmount(){
        return totalBillBeforeTip * (tipPercentage / 100.0);
    }

    // method that calculates the total bill including tip
    public double totalBill(){
        return totalBillBeforeTip + tipAmount();
    }

    // method that calculates the cost per person before tip
    public double perPersonCostBeforeTip(){
        return totalBillBeforeTip / numPeople;
    }

    // method that calculates the tip per person
    public double perPersonTipAmount(){
        return tipAmount() / numPeople;
    }

    // method that calculates the total cost per person
    public double perPersonTotalCost(){
        return perPersonCostBeforeTip() + perPersonTipAmount();
    }

}
