/*Representation for customer's account balances
* */
public class Balances {
    private Money totalMoney;
    private Money availableMoney;

    public void setBalances(Money totalMoney, Money availableMoney){
        this.setTotalMoney(totalMoney);
        this.setAvailableMoney(availableMoney);
    }

    public Money getTotalMoney() {
        return totalMoney;
    }

    private void setTotalMoney(Money totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Money getAvailableMoney() {
        return availableMoney;
    }

    private void setAvailableMoney(Money availableMoney) {
        this.availableMoney = availableMoney;
    }
}
