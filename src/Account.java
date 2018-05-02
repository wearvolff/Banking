
public class Account {
    private long id;
    private String owner;
    private double balans;
    private double commission = 1.2;

    Account(String owner, double balans){
        this.owner = owner;
        this.balans = balans;
        this.id = (long)(Math.random() * (999999999999999999L - 1000000000000000000L) + 9999999999999999L);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalans() {
        return balans;
    }

    public long getId(){ return this.id; }




    public void putMoney(double mount){
        this.balans += mount;
    }

    public boolean withDraw(double mount){
        if(balans - mount * commission >= 0){
            this.balans -= mount * commission;
            return true;
        }else {
            return false;
        }
    }


}
