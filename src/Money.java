import org.jetbrains.annotations.NotNull;

/*Representation for money amounts
* */
public class Money {
    private int dollar;

    public Money(int dollar){
        this.setDollar(dollar);
    }

    public String toString(){
        return "$" + this.getDollar();
    }

    public void add(@NotNull Money money){
        this.setDollar(this.getDollar() + money.getDollar());
    }

    public void subtract(@NotNull Money money){
        this.setDollar(this.getDollar() - money.getDollar());
    }

    public int getDollar() {
        return dollar;
    }

    private void setDollar(int dollar) {
        this.dollar = dollar;
    }
}
