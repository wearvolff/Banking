public class BankSystem {
    private String name;
    private  Account[] accounts;

    BankSystem(String name){
        this.name = name;
        this.accounts = new Account[6];
        Account ivan = new Account("Ivan", 2345);
        Account sergey = new Account("Sergey", 25.5);
        Account oleg = new Account("Oleg", 0);
        Account inna = new Account("Inna", 34.23);

        accounts[1] = oleg;
        accounts[4] = inna;
        accounts[3] = sergey;
        accounts[5] = ivan;
    }

    public boolean createAccount(String owner, double balanse){
        Account some = new Account(owner, balanse);

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null){
                accounts[i] = some;
                System.out.println("Account created ");
                return true;
            }
        }
        System.out.println("Base is full");
        Account[] newAccount = new Account[this.accounts.length*2];
        System.arraycopy(accounts, 0,newAccount,0,accounts.length);
        newAccount[accounts.length] = some;
        this.accounts = newAccount;


        for (int j = 0; j < accounts.length; j++) {
            System.out.print(accounts[j]+", ");
        }
        return false;
    }

    public boolean transferMoney(long from, long to, double sum){
        for (Account itemFrom: this.accounts) {
            if (itemFrom != null && itemFrom.getId() == from){
               for (Account itemTo: accounts){
                   if (itemTo != null && itemTo.getId() == to){
                       if (itemFrom.getBalans() >= sum + 1.2){
                           itemFrom.withDraw(sum);
                           itemTo.putMoney(sum);
                           return true;
                       }
                   }
               }
            }
        }
        return false;
    }
}
