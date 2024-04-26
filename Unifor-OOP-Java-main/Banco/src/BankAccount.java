public class BankAccount {
    protected double cash;
    public double money;

    protected double BankAccount(double cash) {
        return this.cash = cash;
    }
    public double depositCash (double money){
        return this.cash += money;
    }
    public double getCash(double money) {
        return this.cash -= money;
    }}