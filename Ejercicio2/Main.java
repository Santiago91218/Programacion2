package Ejercicio2;
public class Main {
    public static void main(String[] args) {
        SavingsAccount saving_account1=new SavingsAccount(20000,4);
        saving_account1.withdraw(100);
        saving_account1.consign(500);
        saving_account1.monthlyStatement();
        saving_account1.print();
    }
}
