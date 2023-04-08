import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        double total_money = bank.BankAccount(1000);
        double amount_of_cash;

        Scanner prompt = new Scanner(System.in);
        System.out.println("say the type of request");
        String request = prompt.next();


    switch (request) {
        case "get": System.out.println("say the amount of money of your choice");
            amount_of_cash = prompt.nextDouble();
            if (total_money >= amount_of_cash) {
                System.out.println("withdraw granted!");
                System.out.println(amount_of_cash+" mbtc has been collected from your wallet");
                System.out.println(bank.getCash(amount_of_cash)+" mbtc left");
            }
            else { System.out.println("not enough funds to withdraw");
            }
            break;

        case "deposit": System.out.println("say the amount of money of your choice");
            amount_of_cash = prompt.nextDouble();
            System.out.println("deposit granded!");
            System.out.println(amount_of_cash+" mbtc has been sent to your wallet");
            System.out.println(bank.depositCash(amount_of_cash)+" mbtc in your wallet now"); break;

        default:
            System.out.println(); break;
    }}}
