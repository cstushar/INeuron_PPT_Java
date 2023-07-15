package question1;

import java.util.Scanner;

public class BankingSystem {

  public static void main(String[] args) {
    @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);

    System.out.println("Enter account holder's name: ");
    String name = scanner.nextLine();

    System.out.println("Enter account balance: ");
    long balance = scanner.nextLong();

    Account account = new Account(name, balance);

    System.out.println("Account holder name: " + account.getName());
    System.out.println("Account balance: " + account.getBalance());

    System.out.println("Enter amount to deposit: ");
    long amount = scanner.nextLong();
    account.deposit(amount);
    System.out.println("Account balance after deposit: " + account.getBalance());

    System.out.println("Enter amount to withdraw: ");
    amount = scanner.nextLong();
    account.withdraw(amount);
    System.out.println("Account balance after withdrawal: " + account.getBalance());
  }
}



