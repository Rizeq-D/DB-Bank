import java.util.HashMap;
import java.util.Map;

class Bank {
    private String bankName;
    private Map<Integer, BankAccounts> bankAccounts;
    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankAccounts = new HashMap<>();
    }
    public void addAccount(BankAccounts account) {
        bankAccounts.put(account.getId(), account);
    }
    public void transferMoney(int sourceId, int targetId, double money) {
        BankAccounts sourceAccount = bankAccounts.get(sourceId);
        BankAccounts targetAccount = bankAccounts.get(targetId);

        if (sourceAccount != null && targetAccount != null) {
            sourceAccount.withdraw(money);
            targetAccount.add(money);
        } else {
            System.out.println("Invalid source or target account ID.");
        }
    }
}