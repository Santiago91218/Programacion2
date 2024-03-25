package Ejercicio2;
public class CurrentAccount extends Account {
    protected float overdraft=0;
    public CurrentAccount(float balance, float annualRate) {
        super(balance, annualRate);
    }
    @Override
    public void withdraw(float amount) {
        if(amount>=balance){
            overdraft = amount -balance;
            balance=0;
        }else{
            balance-=amount;
        }
        numberWithdrawals++;
    }
    @Override
    public void consign(float amount) {
      if(overdraft>0){
          if(overdraft>=amount){
              overdraft-=amount;
              if (overdraft == 0) {
                  System.out.println("Se ha pagado el sobregiro");
              }
              numberConsignments++;
          }else{
              amount-=overdraft;
              overdraft = 0;
              super.consign(amount);
          }
      }else{
          super.consign(amount);
      }
    }
    @Override
    public void monthlyStatement() {
        super.monthlyStatement();
    }
    public void print(){
        System.out.println("El saldo de la cuenta es: "+this.balance+
                "\nLa comision mensual es:  "+monthlyCommission+
                "\nNumero de transacciones totales "+(numberWithdrawals+numberConsignments)+
                "\nValor del sobregiro: "+overdraft)
        ;

    }
}