class BankAccounts {
    private double money = 0;
    private int id;
    public BankAccounts(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void add(double moneyToAdd) {
        money += moneyToAdd;
    }
    public void withdraw(double moneyToWithdraw) {
        money -= moneyToWithdraw;
    }
    public void printDetails() {
        System.out.println("ID: " + id + " Money: " + money + " Euro");
    }

}