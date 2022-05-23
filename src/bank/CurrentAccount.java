package bank;

public class CurrentAccount extends Account {

    @Override
    public void showExtractSavingsAccount() {

    }

    @Override
    public void showExtractAccountCurrent(){
        System.out.println("*** Extract the Current Account ***");
        extract();
    }
}
