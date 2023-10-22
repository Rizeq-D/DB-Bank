import java.util.HashMap;
import java.util.Map;

class Bank {
    private String bankName;
    private Map<Integer, BankAccount> bankAccounts;
    private Map<Integer, Transaction> transactionHistory;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankAccounts = new HashMap<>();
        this.transactionHistory = new HashMap<>();
    }

    public void addAccount(BankAccount account) {
        if (bankAccounts.containsKey(account.getId())) {
            System.out.println("Account with the same ID already exists.");
        } else {
            bankAccounts.put(account.getId(), account);
            System.out.println("Account created successfully.");
        }
    }

    public void transferMoney(int sourceId, int targetId, double money) {
        BankAccount sourceAccount = bankAccounts.get(sourceId);
        BankAccount targetAccount = bankAccounts.get(targetId);

        if (sourceAccount != null && targetAccount != null) {
            if (sourceAccount.withdraw(money)) {
                targetAccount.add(money);
                Transaction transaction = new Transaction(sourceId, targetId, money);
                transactionHistory.put(transaction.getId(), transaction);
                System.out.println("Transfer successful.");
            } else {
                System.out.println("Insufficient funds in the source account.");
            }
        } else {
            System.out.println("Invalid source or target account ID.");
        }
    }

    public void printTransactionHistory(int accountId) {
        System.out.println("Transaction History for Account " + accountId + ":");
        for (Transaction transaction : transactionHistory.values()) {
            if (transaction.getSourceId() == accountId || transaction.getTargetId() == accountId) {
                System.out.println(transaction);
            }
        }
    }
}
