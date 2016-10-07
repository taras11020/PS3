
package PS3.Struggle;
import java.util.Date;
public class Account {
private int id;
private double balance;
private double annualInterestRate;
private Date dateCreated;
public double withdrawAmount;
public Account(){
	this.id = 0;
	this.annualInterestRate =0.0;
	this.balance = 0.0;
	//	A no-arguments constructor that creates a default account.
	
}

public Account(int freshid, double freshbalance) {
	this.id = freshid;
	this.balance=freshbalance;
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public double getAnnualInterestRate() {
	return annualInterestRate;
}

public void setAnnualInterestRate(double annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
}

public Date getDateCreated() {
	return dateCreated;
}

public double getMonthlyInterestRate(){
	double monthlyInterestRate = annualInterestRate/12;
	return monthlyInterestRate;
}

public double withdrawal(double withdrawAmount){
	this.balance -= withdrawAmount;
	return balance;

}
public double deposit(double deposit){
	 this.balance += deposit;
	 return balance;

}
public double withdraw(double withdrawAmt) throws insufficientFundsExcep{
    if (withdrawAmt <= balance){
        return balance +=withdrawAmount;
    }
    else{
        double needs = withdrawAmt- balance;
        throw new InsufficientFundsExcep(needs);
    }
}
}
