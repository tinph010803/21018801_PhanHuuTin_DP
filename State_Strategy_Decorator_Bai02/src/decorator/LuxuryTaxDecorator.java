package decorator;

public class LuxuryTaxDecorator extends TaxDecorator {
	public LuxuryTaxDecorator(Product product) {
        super(product);
    }

    @Override
    public double calculateTax() {
        return super.calculateTax() + getPrice() * 0.20;
    }

    @Override
    public void displayInfo() {
        System.out.println("Áp dụng thuế xa xỉ (20%)...");
        super.displayInfo();
    }
}
