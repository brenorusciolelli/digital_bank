package bank;

public abstract class Account implements IAccount {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int number;
    protected int ag;
    protected double balance;

    public Account(){
        this.ag = Account.AGENCIA_PADRAO;
        this.number = SEQUENCIAL++;
    }

    @Override
    public void withdraw(double value) {
        this.balance -= value;
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void transfer(double value, Account destinyAccount) {
        this.withdraw(value);
        destinyAccount.deposit(value);
    }

    @Override
    public void extract(){
        System.out.println(String.format("Ag Account: %d", this.ag));
        System.out.println(String.format("Number Account: %d", this.number));
        System.out.println(String.format("Balance Account: %.2f", this.balance));
    }

    public int getNumber() {
        return number;
    }

    public int getAg() {
        return ag;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void showExtractSavingsAccount();

    public abstract void showExtractAccountCurrent();
}
