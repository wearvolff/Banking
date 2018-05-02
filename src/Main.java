import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BankSystem bank = new BankSystem("Vadim24");
//        bank.createAccount("Vadim", 234352353.45);
//        bank.createAccount("Igor", 34.5);
//        bank.createAccount("Andrey", 1.2);
//        bank.createAccount("Olya", 3.2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter int value");
        int value = 0;
        while (true) {
            try {
                value = scanner.nextInt();
            }
            catch (Exception e) {
                System.out.println("Value Error");
                break;
            }
            System.out.println(value);

        }
    }
}
