package bank;

public class SavingsAccount extends Account{

    @Override
    public void showExtractSavingsAccount(){
        System.out.println("*** Extract the Savings Account ***");
        extract();
    }

    @Override
    public void showExtractAccountCurrent() {

    }
}
