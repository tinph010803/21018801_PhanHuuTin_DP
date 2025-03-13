package state;

public class LuxuryTaxState implements TaxState {
	 @Override
	    public double calculateTax(double price) {
	        return price * 0.20;
	    }
}
