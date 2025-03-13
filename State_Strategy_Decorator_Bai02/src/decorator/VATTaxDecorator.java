package decorator;

public class VATTaxDecorator extends TaxDecorator {
	public VATTaxDecorator(Product product) {
        super(product);
    }

    @Override
    public double calculateTax() {
        return super.calculateTax() + getPrice() * 0.10;
    }

    @Override
    public void displayInfo() {
        System.out.println("Áp dụng thuế VAT (10%)...");
        super.displayInfo();
    }
}
