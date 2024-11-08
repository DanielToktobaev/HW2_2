public class BankAccount {
    private double getAmount;

    public double getGetAmount() {
        return getAmount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            this.getAmount += sum;
            System.out.println("Пополнено " + sum + " сомов. Остаток на счете: " + getAmount + "сом");
        } else {
            System.out.println("Некорректная сумма для пополнения");
        }
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > 0 && sum <= this.getAmount) {
            this.getAmount -= sum;
            System.out.println("Вы успешно вывели: " + sum + "сом. Ваш текущий баланс: " + this.getAmount);
        } else {
            throw new LimitException("Недостаточно средств на балансе, ваш баланс: ", this.getAmount);
        }
    }
}