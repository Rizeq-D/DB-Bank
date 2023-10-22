class BankAccount {
    private double money = 0;
    private int id;
    public BankAccount(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public boolean add(double moneyToAdd) {
        if (moneyToAdd >= 0) {
            money += moneyToAdd;
            return true;
        } else {
            System.out.println("Invalid amount. Money not added.");
            return false;
        }
    }
    public boolean withdraw(double moneyToWithdraw) {
        if (moneyToWithdraw >= 0 && money >= moneyToWithdraw) {
            money -= moneyToWithdraw;
            return true;
        } else {
            System.out.println("Invalid amount or insufficient funds. Money not withdrawn.");
            return false;
        }
    }
    public void printDetails() {
        System.out.println("ID: " + id + " Money: " + money + " Euro");
    }
}
    class Transaction {
        private int sourceId;
        private int targetId;
        private double amount;
        private static int nextId = 1;
        private int id;
    public Transaction(int sourceId, int targetId, double amount) {
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.amount = amount;
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }
    public int getSourceId() {
        return sourceId;
    }
    public int getTargetId() {
        return targetId;
    }
    @Override
    public String toString() {
        return "Transaction #" + id + ": " + sourceId + " -> " + targetId + ", Amount: " + amount;
    }
}
