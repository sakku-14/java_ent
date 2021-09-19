public class BankAccount {
    String accNumber;
    int balance;

    public void setAccountNumber(String num) {
        if (num == null || num.length() != 4)
            throw new IllegalArgumentException("４桁の口座番号を入力してください。");
        this.accNumber = num;
    }
    public String getAccNumber() { return this.accNumber; }
    public void setBalance(int b) { this.balance = b; }
    public int getBalance() { return this.balance; }
    public String toString() {
        return "\¥" + this.getBalance() + "(口座番号:" + this.getAccNumber() + ")";
    }
    public boolean equals(Object o) {
        if (o == this) { return true; }
        if (o instanceof BankAccount) {
            BankAccount b = (BankAccount)o;
            String an1 = b.getAccNumber().trim();
            String an2 = this.getAccNumber().trim();
            if (an1.equals(an2)) {
                return true;
            }
        }
        return false;
    }
}