public class Main {

    public static void main(String[] args) {
        Bank berlinBank = new Bank("Berlin Bank");

        BankAccounts samsBankAccount = new BankAccounts(1111);
        samsBankAccount.add(100);
        samsBankAccount.printDetails();

        BankAccounts yvonnesBankAccount = new BankAccounts(2222);
        yvonnesBankAccount.add(200);
        yvonnesBankAccount.printDetails();

        berlinBank.addAccount(samsBankAccount);
        berlinBank.addAccount(yvonnesBankAccount);

        berlinBank.transferMoney(2222, 1111, 100);

        samsBankAccount.printDetails();
        yvonnesBankAccount.printDetails();
    }
}