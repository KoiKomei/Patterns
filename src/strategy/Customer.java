package strategy;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private List<Double> drinks;
	private BillingStrategy strat;
	
	public Customer(final BillingStrategy strat) {
	this.drinks=new ArrayList<Double>();
	this.strat=strat;
	}
	
	public void add(double price, int quantity) {
		drinks.add(strat.getActPrice(price*quantity));
	}
	
	public void printBill() {
		double sum=0;
		for(Double i:drinks) {
			sum+=i;
		}
		System.out.println("Total: "+sum);
		drinks.clear();
	}
	public void setStrategy(BillingStrategy strat) {
		this.strat=strat;
	}
	
}
