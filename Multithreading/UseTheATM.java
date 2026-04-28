package Multithreading;

class ATM {
    synchronized public void checkBalance(String name) {
        System.out.print(name + " checking ");
        try {
            Thread.sleep(200);
        } catch (Exception e) {
        }
        System.out.println(" Balance ");
    }

    synchronized public void withdraw(String name, int amount) {
        System.out.print(name + " withdraw ");
        try {
            Thread.sleep(200);
        } catch (Exception e) {
        }
        System.out.println(amount);
    }
}

class Customer extends Thread {
    String name;
    int amount;
    ATM atm;

    Customer(String n, ATM a, int amt) {
        name = n;
        atm = a;
        amount = amt;

    }

    public void UseATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run() {
        UseATM();
    }

}

public class UseTheATM {
    public static void main(String[] args) {

        ATM atm = new ATM();
        Customer c1 = new Customer("Smith", atm, 100);
        Customer c2 = new Customer("John", atm, 200);
        c1.start();
        c2.start();
    }
}
