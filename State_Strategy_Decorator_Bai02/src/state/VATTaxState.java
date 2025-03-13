package state;

public class VATTaxState implements TaxState {
	@Override
    public double calculateTax(double price) {
        return price * 0.10;
    }
}
