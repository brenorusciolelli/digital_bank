package bank;

public class Main {
    public static void main(String[] args) {

        Account cc = new CurrentAccount();

        Account cp = new SavingsAccount();

        cc.showExtractAccountCurrent();
        System.out.println("-------------------------------------------");
        cp.showExtractSavingsAccount();
    }
}
