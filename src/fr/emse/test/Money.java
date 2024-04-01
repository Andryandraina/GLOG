package fr.emse.test;

public class Money {
	private int fAmount;
	private String fCurrency;
	public Money(int amount, String currency) {
	fAmount = amount;
	fCurrency = currency;
	}
	public int amount() {
	return fAmount;
	}
	public String currency() {
	return fCurrency;
	}
	public Money add(Money m) {
	return new Money(amount() + m.amount(), currency());
	}
	
	@Override
	public boolean equals(Object anObject) {
	  if (this == anObject) {
	    return true;
	  }
	  if (anObject instanceof Money) {
	    Money other = (Money) anObject;
	    return amount() == other.amount() && currency().equals(other.currency());
	  }
	  return false;
	}
}
