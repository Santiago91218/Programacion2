package Ejercicio2;
public class SavingsAccount extends Account {
    protected boolean active;
    public SavingsAccount(float balance, float annualRate) {
        super(balance, annualRate);
        if(balance>10000){
            this.active = true;
        }else{
            this.active=false;
        }
    }
    @Override
    public void withdraw(float amount) {
        if(this.active){
            super.withdraw(amount);
        }else{
            System.out.println("No se puede retirar dinero porque la cuenta esta inactiva");
        }
    }
    @Override
    public void consign(float amount){
        if(this.active){
            super.consign(amount);
        }else{
            System.out.println("No se puede consignar porque la cuenta esta inactiva");
        }

    }
    @Override
    public void monthlyStatement(){
        if(numberWithdrawals>4){
            monthlyCommission+=1000;
        }
        super.monthlyStatement();
    }
    public void print(){
        System.out.println("El saldo de la cuenta es: "+this.balance+
                "\nLa comision mensual es:  "+monthlyCommission+
                "\nNumero de transacciones totales "+(numberWithdrawals+numberConsignments));

    }
}