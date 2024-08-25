import java.util.*;
class ATM {
    int acc_no,amount;
    String name,type;
    
    void getdetails(int an,int a,String n,String t) {
        acc_no = an;
        amount = a;
        name = n;
        type = t;
    }
    void show() {
        System.out.println("The name of the person is: " +name);
        System.out.println("The type of account is: " +type);
        System.out.println("The the Account Number of the person is: " +acc_no);
        System.out.println("Total amount present: " +amount);
        
    }
    void deposit(int a) {
        amount +=a;
        System.out.println("Deposit amount: " +a);
    }
    void withdraw(int a) {
        if(amount < a) {
            System.out.println("Insufficient Funds");
        }
        else {
            amount -=a;
            System.out.println("Withdraw amount: " +a);
        }
    }
    void checkBalance() {
        System.out.println("Balance Amount:" +amount);
    }
}
class Main {
    public static void main(String args[]) {
        ATM atm=new ATM();
        atm.getdetails(11172310,10000,"Shalom Rakshana S","Savings");
        atm.show();
        atm.deposit(50000);
        atm.withdraw(20000);
        atm.checkBalance();
    }
}