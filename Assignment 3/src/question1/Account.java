package question1;

public class Account {

	  private String name;
	  private long balance;

	  public Account(String name, long balance) {
	    this.name = name;
	    this.balance = balance;
	  }

	  public String getName() {
	    return name;
	  }

	  public long getBalance() {
	    return balance;
	  }

	  public void deposit(long amount) {
	    balance += amount;
	  }

	  public void withdraw(long amount) {
	    balance -= amount;
	  }
	}