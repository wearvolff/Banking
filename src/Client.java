import java.util.Scanner;

public class Client {

    private BankSystem bank;

    public void start() {
        String[] operation = {"Create account", "Transfer Money", "Remove account", "Show Account", "Withdraw money", "Exit"};
        for (int i = 0; operation.length > i; i++) {
            System.out.println("Code " + i + " operation " + operation[i]);
        }
        Scanner scanner = new Scanner(System.in);
        int userInput;
        while ((userInput = scanner.nextInt()) != operation.length -1) {
            switch (userInput){
                case 0:{
                    System.out.println("Input name ");
                    String name;
                    double balans;
                    try{
                        name = scanner.next();
                        balans = scanner.nextDouble();
                    }catch (Exception e){
                        System.out.println("Name error");
                        break;
                    }
                    bank.createAccount(name,balans);
                    break;
                }
                case 1:{
                    //Доделать домашку
                    bank.transferMoney();
                }
            }
        }
        System.out.println("Finish");

    }

}
