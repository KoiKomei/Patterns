package strategy;

public class Main {
	public static void main(String[] args) {
		BillingStrategy normalStrategy    = new NormalStrategy();
	    BillingStrategy happyHourStrategy = new HappyHourStrategy();
		
	    Customer first=new Customer(normalStrategy);
	    
	    first.add(1.0, 1);
	    
	    first.setStrategy(happyHourStrategy);
	    first.add(1.0, 2);
	    
	    Customer snd=new Customer(happyHourStrategy);
	    snd.add(0.8, 1);
	    
	    first.printBill();
	    
	    snd.setStrategy(normalStrategy);
	    snd.add(1.3, 2);
	    snd.add(2.5, 1);
	    snd.printBill();
	}
}
