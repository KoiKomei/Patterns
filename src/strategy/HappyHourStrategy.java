package strategy;

public class HappyHourStrategy implements BillingStrategy{

	@Override
	public double getActPrice(final double rawPrice) {
		return rawPrice*0.5;
	}
}
