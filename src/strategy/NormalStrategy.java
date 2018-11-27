package strategy;

public class NormalStrategy implements BillingStrategy{
	@Override
	public double getActPrice(final double rawPrice) {
		return rawPrice;
	}
}
