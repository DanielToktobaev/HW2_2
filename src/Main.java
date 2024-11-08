public class Main {
   public static void main(String[] args) throws LimitException {
        BankAccount clientAccount = new BankAccount();
        clientAccount.deposit(15000);

        double currentAmount = clientAccount.getGetAmount();
       System.out.println("Текущий остаток на счете" + currentAmount);

       while (true) {
           try {
               clientAccount.withDraw(6000);
           } catch (LimitException e) {
               System.out.println("Превышен лимит. Снято доступное кол-во средств: " + e.getRemainingAmount());
               clientAccount.withDraw((int) e.getRemainingAmount());
               break;
           }
       }
   }
}
