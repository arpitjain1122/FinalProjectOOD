<<<<<<< HEAD
package application.Models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class SavingsAccount extends Account {
	// The withdrawal limit from the savings
	private final DoubleProperty withdrawalLimit;

	public SavingsAccount(String owner, String accountNumber, double balance, double withdrawalLimit) {
		super(owner, accountNumber, balance);
		this.withdrawalLimit = new SimpleDoubleProperty(this, "Withdrawal Limit", withdrawalLimit);
	}

	public DoubleProperty withdrawalLimitProp() {
		return withdrawalLimit;
	}

	@Override
	public String toString() {
		return accountNumberProperty().get();
	}
}
=======
package application.Models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class SavingsAccount extends Account {
	// The withdrawal limit from the savings
	private final DoubleProperty withdrawalLimit;

	public SavingsAccount(String owner, String accountNumber, double balance, double withdrawalLimit) {
		super(owner, accountNumber, balance);
		this.withdrawalLimit = new SimpleDoubleProperty(this, "Withdrawal Limit", withdrawalLimit);
	}

	public DoubleProperty withdrawalLimitProp() {
		return withdrawalLimit;
	}

	@Override
	public String toString() {
		return accountNumberProperty().get();
	}
}
>>>>>>> bce4b244d562c40de5c64c452dbd5eda7d6be521
