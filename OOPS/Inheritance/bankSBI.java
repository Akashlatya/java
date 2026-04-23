package OOPS.Inheritance;

class Account {
    private String name;
    private String Accnumber;
    private String Address;
    private String DOB;
    protected double balance;
    private String mobileNumber;

    Account() {

    }

    public Account(String n, String accno, String add, String DOB, String mno) {

        Accnumber = accno;
        name = n;
        Address = add;
        this.DOB = DOB;
        mobileNumber = mno;
        balance = 0;

    }

    public String getAccNo() {
        return Accnumber;
    }

    public String getname() {
        return name;
    }

    public String getdob() {
        return DOB;
    }

    public String getAdd() {
        return Address;
    }

    public String getMobNo() {
        return mobileNumber;
    }

    public double getbalance() {
        return balance;
    }

    public void setAddress(String add) {
        Address = add;
    }

    public void setPhno(String mno) {
        this.mobileNumber = mno;
    }

}

class SavingAcc extends Account {
    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        balance -= amt;
    }
}

class LoanAccount extends Account {
    public void payEMI(double amt) {
        balance -= amt;
    }

    public void repay(double amt) {
        if (balance == amt)
            balance = 0;
    }
}

public class bankSBI {
    public static void main(String[] args) {

        LoanAccount LA = new LoanAccount();
        SavingAcc SA = new SavingAcc();
        Account AC = new Account();

        AC.balance = 20000;
        System.out.println(LA.repay(500));

    }

}
