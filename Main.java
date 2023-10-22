public class Main {

    public static void main(String[] args) {
        Bank dbBank = new Bank("DB Bank");

        BankAccount samsBankAccount = new BankAccount(1111);
        samsBankAccount.add(100);
        samsBankAccount.printDetails();

        BankAccount yvonnesBankAccount = new BankAccount(2222);
        yvonnesBankAccount.add(200);
        yvonnesBankAccount.printDetails();

        dbBank.addAccount(samsBankAccount);
        dbBank.addAccount(yvonnesBankAccount);

        dbBank.transferMoney(2222, 1111, 100);

        samsBankAccount.printDetails();
        yvonnesBankAccount.printDetails();

        dbBank.transferMoney(2222, 1111, 100);

        dbBank.printTransactionHistory(2222);
        dbBank.printTransactionHistory(1111);
    }
}
